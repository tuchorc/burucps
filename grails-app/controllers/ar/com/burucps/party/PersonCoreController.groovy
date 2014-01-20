package ar.com.burucps.party



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PersonCoreController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond PersonCore.list(params), model:[personCoreInstanceCount: PersonCore.count()]
    }

    def show(PersonCore personCoreInstance) {
        respond personCoreInstance
    }

    def create() {
        respond new PersonCore(params)
    }

    @Transactional
    def save(PersonCore personCoreInstance) {
        if (personCoreInstance == null) {
            notFound()
            return
        }

        if (personCoreInstance.hasErrors()) {
            respond personCoreInstance.errors, view:'create'
            return
        }

        personCoreInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'personCoreInstance.label', default: 'PersonCore'), personCoreInstance.id])
                redirect personCoreInstance
            }
            '*' { respond personCoreInstance, [status: CREATED] }
        }
    }

    def edit(PersonCore personCoreInstance) {
        respond personCoreInstance
    }

    @Transactional
    def update(PersonCore personCoreInstance) {
        if (personCoreInstance == null) {
            notFound()
            return
        }

        if (personCoreInstance.hasErrors()) {
            respond personCoreInstance.errors, view:'edit'
            return
        }

        personCoreInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'PersonCore.label', default: 'PersonCore'), personCoreInstance.id])
                redirect personCoreInstance
            }
            '*'{ respond personCoreInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(PersonCore personCoreInstance) {

        if (personCoreInstance == null) {
            notFound()
            return
        }

        personCoreInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'PersonCore.label', default: 'PersonCore'), personCoreInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'personCoreInstance.label', default: 'PersonCore'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
