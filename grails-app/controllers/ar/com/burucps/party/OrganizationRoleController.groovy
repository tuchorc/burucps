package ar.com.burucps.party



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class OrganizationRoleController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond OrganizationRole.list(params), model:[organizationRoleInstanceCount: OrganizationRole.count()]
    }

    def show(OrganizationRole organizationRoleInstance) {
        respond organizationRoleInstance
    }

    def create() {
        respond new OrganizationRole(params)
    }

    @Transactional
    def save(OrganizationRole organizationRoleInstance) {
        if (organizationRoleInstance == null) {
            notFound()
            return
        }

        if (organizationRoleInstance.hasErrors()) {
            respond organizationRoleInstance.errors, view:'create'
            return
        }

        organizationRoleInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'organizationRoleInstance.label', default: 'OrganizationRole'), organizationRoleInstance.id])
                redirect organizationRoleInstance
            }
            '*' { respond organizationRoleInstance, [status: CREATED] }
        }
    }

    def edit(OrganizationRole organizationRoleInstance) {
        respond organizationRoleInstance
    }

    @Transactional
    def update(OrganizationRole organizationRoleInstance) {
        if (organizationRoleInstance == null) {
            notFound()
            return
        }

        if (organizationRoleInstance.hasErrors()) {
            respond organizationRoleInstance.errors, view:'edit'
            return
        }

        organizationRoleInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'OrganizationRole.label', default: 'OrganizationRole'), organizationRoleInstance.id])
                redirect organizationRoleInstance
            }
            '*'{ respond organizationRoleInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(OrganizationRole organizationRoleInstance) {

        if (organizationRoleInstance == null) {
            notFound()
            return
        }

        organizationRoleInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'OrganizationRole.label', default: 'OrganizationRole'), organizationRoleInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'organizationRoleInstance.label', default: 'OrganizationRole'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
