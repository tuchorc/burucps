package ar.com.burucps.party



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class OrganizationCoreController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond OrganizationCore.list(params), model:[organizationCoreInstanceCount: OrganizationCore.count()]
    }

    def show(OrganizationCore organizationCoreInstance) {
        respond organizationCoreInstance
    }

    def create() {
        respond new OrganizationCore(params)
    }

    @Transactional
    def save(OrganizationCore organizationCoreInstance) {
        if (organizationCoreInstance == null) {
            notFound()
            return
        }

        if (organizationCoreInstance.hasErrors()) {
            respond organizationCoreInstance.errors, view:'create'
            return
        }

        organizationCoreInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'organizationCoreInstance.label', default: 'OrganizationCore'), organizationCoreInstance.id])
                redirect organizationCoreInstance
            }
            '*' { respond organizationCoreInstance, [status: CREATED] }
        }
    }

    def edit(OrganizationCore organizationCoreInstance) {
        respond organizationCoreInstance
    }

    @Transactional
    def update(OrganizationCore organizationCoreInstance) {
        if (organizationCoreInstance == null) {
            notFound()
            return
        }

        if (organizationCoreInstance.hasErrors()) {
            respond organizationCoreInstance.errors, view:'edit'
            return
        }

        organizationCoreInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'OrganizationCore.label', default: 'OrganizationCore'), organizationCoreInstance.id])
                redirect organizationCoreInstance
            }
            '*'{ respond organizationCoreInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(OrganizationCore organizationCoreInstance) {

        if (organizationCoreInstance == null) {
            notFound()
            return
        }

        organizationCoreInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'OrganizationCore.label', default: 'OrganizationCore'), organizationCoreInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'organizationCoreInstance.label', default: 'OrganizationCore'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
