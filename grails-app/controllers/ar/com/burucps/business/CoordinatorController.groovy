package ar.com.burucps.business



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class CoordinatorController {
	
	static Boolean linkMe = false
	static String btnName = ""
	
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Coordinator.list(params), model:[coordinatorInstanceCount: Coordinator.count()]
    }

    def show(Coordinator coordinatorInstance) {
        respond coordinatorInstance
    }

    def create() {
        respond new Coordinator(params)
    }

    @Transactional
    def save(Coordinator coordinatorInstance) {
        if (coordinatorInstance == null) {
            notFound()
            return
        }

        if (coordinatorInstance.hasErrors()) {
            respond coordinatorInstance.errors, view:'create'
            return
        }

        coordinatorInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'coordinatorInstance.label', default: 'Coordinator'), coordinatorInstance.id])
                redirect coordinatorInstance
            }
            '*' { respond coordinatorInstance, [status: CREATED] }
        }
    }

    def edit(Coordinator coordinatorInstance) {
        respond coordinatorInstance
    }

    @Transactional
    def update(Coordinator coordinatorInstance) {
        if (coordinatorInstance == null) {
            notFound()
            return
        }

        if (coordinatorInstance.hasErrors()) {
            respond coordinatorInstance.errors, view:'edit'
            return
        }

        coordinatorInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Coordinator.label', default: 'Coordinator'), coordinatorInstance.id])
                redirect coordinatorInstance
            }
            '*'{ respond coordinatorInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Coordinator coordinatorInstance) {

        if (coordinatorInstance == null) {
            notFound()
            return
        }

        coordinatorInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Coordinator.label', default: 'Coordinator'), coordinatorInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'coordinatorInstance.label', default: 'Coordinator'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
