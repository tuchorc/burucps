package ar.com.burucps.business



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class SubcontractorController {

	static Boolean linkMe = false
	static String btnName = ""
	
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Subcontractor.list(params), model:[subcontractorInstanceCount: Subcontractor.count()]
    }

    def show(Subcontractor subcontractorInstance) {
        respond subcontractorInstance
    }

    def create() {
        respond new Subcontractor(params)
    }

    @Transactional
    def save(Subcontractor subcontractorInstance) {
        if (subcontractorInstance == null) {
            notFound()
            return
        }

        if (subcontractorInstance.hasErrors()) {
            respond subcontractorInstance.errors, view:'create'
            return
        }

        subcontractorInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'subcontractorInstance.label', default: 'Subcontractor'), subcontractorInstance.id])
                redirect subcontractorInstance
            }
            '*' { respond subcontractorInstance, [status: CREATED] }
        }
    }

    def edit(Subcontractor subcontractorInstance) {
        respond subcontractorInstance
    }

    @Transactional
    def update(Subcontractor subcontractorInstance) {
        if (subcontractorInstance == null) {
            notFound()
            return
        }

        if (subcontractorInstance.hasErrors()) {
            respond subcontractorInstance.errors, view:'edit'
            return
        }

        subcontractorInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Subcontractor.label', default: 'Subcontractor'), subcontractorInstance.id])
                redirect subcontractorInstance
            }
            '*'{ respond subcontractorInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Subcontractor subcontractorInstance) {

        if (subcontractorInstance == null) {
            notFound()
            return
        }

        subcontractorInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Subcontractor.label', default: 'Subcontractor'), subcontractorInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'subcontractorInstance.label', default: 'Subcontractor'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
