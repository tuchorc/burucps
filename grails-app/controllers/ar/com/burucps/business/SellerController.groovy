package ar.com.burucps.business



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class SellerController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Seller.list(params), model:[sellerInstanceCount: Seller.count()]
    }

    def show(Seller sellerInstance) {
        respond sellerInstance
    }

    def create() {
        respond new Seller(params)
    }

    @Transactional
    def save(Seller sellerInstance) {
        if (sellerInstance == null) {
            notFound()
            return
        }

        if (sellerInstance.hasErrors()) {
            respond sellerInstance.errors, view:'create'
            return
        }

        sellerInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'sellerInstance.label', default: 'Seller'), sellerInstance.id])
                redirect sellerInstance
            }
            '*' { respond sellerInstance, [status: CREATED] }
        }
    }

    def edit(Seller sellerInstance) {
        respond sellerInstance
    }

    @Transactional
    def update(Seller sellerInstance) {
        if (sellerInstance == null) {
            notFound()
            return
        }

        if (sellerInstance.hasErrors()) {
            respond sellerInstance.errors, view:'edit'
            return
        }

        sellerInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Seller.label', default: 'Seller'), sellerInstance.id])
                redirect sellerInstance
            }
            '*'{ respond sellerInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Seller sellerInstance) {

        if (sellerInstance == null) {
            notFound()
            return
        }

        sellerInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Seller.label', default: 'Seller'), sellerInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'sellerInstance.label', default: 'Seller'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
