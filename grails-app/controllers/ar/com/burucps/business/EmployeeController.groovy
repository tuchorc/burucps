package ar.com.burucps.business



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class EmployeeController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond EmployeeCore.list(params), model:[employeeCoreInstanceCount: EmployeeCore.count()]
    }

    def show(EmployeeCore employeeCoreInstance) {
        respond employeeCoreInstance
    }

    def create() {
        respond new EmployeeCore(params)
    }

    @Transactional
    def save(EmployeeCore employeeCoreInstance) {
        if (employeeCoreInstance == null) {
            notFound()
            return
        }

        if (employeeCoreInstance.hasErrors()) {
            respond employeeCoreInstance.errors, view:'create'
            return
        }

        employeeCoreInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'employeeCoreInstance.label', default: 'EmployeeCore'), employeeCoreInstance.id])
                redirect employeeCoreInstance
            }
            '*' { respond employeeCoreInstance, [status: CREATED] }
        }
    }

    def edit(EmployeeCore employeeCoreInstance) {
        respond employeeCoreInstance
    }

    @Transactional
    def update(EmployeeCore employeeCoreInstance) {
        if (employeeCoreInstance == null) {
            notFound()
            return
        }

        if (employeeCoreInstance.hasErrors()) {
            respond employeeCoreInstance.errors, view:'edit'
            return
        }

        employeeCoreInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'EmployeeCore.label', default: 'EmployeeCore'), employeeCoreInstance.id])
                redirect employeeCoreInstance
            }
            '*'{ respond employeeCoreInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(EmployeeCore employeeCoreInstance) {

        if (employeeCoreInstance == null) {
            notFound()
            return
        }

        employeeCoreInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'EmployeeCore.label', default: 'EmployeeCore'), employeeCoreInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'employeeCoreInstance.label', default: 'EmployeeCore'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
