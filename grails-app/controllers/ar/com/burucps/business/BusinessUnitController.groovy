package ar.com.burucps.business



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class BusinessUnitController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond BusinessUnit.list(params), model:[businessUnitInstanceCount: BusinessUnit.count()]
    }

    def show(BusinessUnit businessUnitInstance) {
        respond businessUnitInstance
    }

    def create() {
        respond new BusinessUnit(params)
    }

    @Transactional
    def save(BusinessUnit businessUnitInstance) {
        if (businessUnitInstance == null) {
            notFound()
            return
        }

        if (businessUnitInstance.hasErrors()) {
            respond businessUnitInstance.errors, view:'create'
            return
        }

        businessUnitInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'businessUnitInstance.label', default: 'BusinessUnit'), businessUnitInstance.id])
                redirect businessUnitInstance
            }
            '*' { respond businessUnitInstance, [status: CREATED] }
        }
    }

    def edit(BusinessUnit businessUnitInstance) {
        respond businessUnitInstance
    }

    @Transactional
    def update(BusinessUnit businessUnitInstance) {
        if (businessUnitInstance == null) {
            notFound()
            return
        }

        if (businessUnitInstance.hasErrors()) {
            respond businessUnitInstance.errors, view:'edit'
            return
        }

        businessUnitInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'BusinessUnit.label', default: 'BusinessUnit'), businessUnitInstance.id])
                redirect businessUnitInstance
            }
            '*'{ respond businessUnitInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(BusinessUnit businessUnitInstance) {

        if (businessUnitInstance == null) {
            notFound()
            return
        }

        businessUnitInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'BusinessUnit.label', default: 'BusinessUnit'), businessUnitInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'businessUnitInstance.label', default: 'BusinessUnit'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
