package ar.com.burucps.business

import javax.media.j3d.View;

import ar.com.burucps.party.OrganizationCore
import grails.transaction.Transactional

@Transactional(readOnly = true)
class SubcontractorController {

	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	//	Data Binding to Multiple Domain Objects
	//	def album = new Album( params["album"] )
	//	def artist = new Artist( params["artist"] )
	//  Data Binding with the bindData Method
	//	The data-binding techniques you have seen so far are automatic and handled implicitly by Grails. However, in some circumstances
	//	you might need to exercise greater control over the data-binding process or to bind data to objects other than domain classes.
	//	To help tackle this issue, Grails provides a bindData method that takes the object to bind the data to and a java.util.Map.
	//	The map should contain keys that match the property names of the target properties within the passed object. As an example,
	//	if you wanted to ensure only the title property was bound to an Album instance, you could use:
	//	def save = {
	//		def album = Album.get(params.id)
	//		 bindData(album, params, [include:"title"])
	//		 bindData(album, params, [include:"title"], "album")
	//	}
	//	you can pass the Album instance as the first argument, and the parameters to bind to the instance as the second argument.
	//	The final argument is a map specifying that you wish to include only the title property in the data-binding process. You
	//	could change the key within the map to exclude if you wished to bind all properties except the title property.
	//  <input type="text" name="artist.name" />

	def index(Integer max) {
		params.max = Math.min(max ?: 10, 100)
		respond Subcontractor.list(params), model:[subcontractorInstanceCount: Subcontractor.count()]
	}

	def show(Subcontractor subcontractor) {
		respond subcontractor
	}

	def create() {
		render view:"create", model: [organization:["uid":null,"name":null,"email":null],subcontractor:["businessUnit":["id":null]]]
	}

	@Transactional
	def save() {
		render params.organization.uid
		render params.organization.name
		render params.organization.email

		def organization = new OrganizationCore()
		def subcontractor = organization.addRole(Subcontractor.getSpecification())

		if  ( (organization == null) || (subcontractor == null) ) {
			notFound()
			return
		}
		
		bindData(organization, params, [include:["name", "uid", "email"]], "organization")
		bindData(subcontractor, params, [include:"businessUnit"], "subcontractor")
	
		if ((organization.hasErrors()) || (subcontractor.hasErrors())) {
			respond ([organization.errors,subcontractor.errors], view:'create')
			return
		}

		organization.save flush:true

		request.withFormat {
			form {
				flash.message = message(code: 'default.created.message', args: [
					message(code: 'subcontractor.label', default: 'Subcontractor'),
					subcontractor.id
				])
				redirect subcontractor
			}
			'*' { respond subcontractor, [status: CREATED] }
		}

	}

	protected void notFound() {
		request.withFormat {
			form {
				flash.message = message(code: 'default.not.found.message', args: [
					message(code: 'subcontractor.label', default: 'Subcontractor'),
					params.id
				])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}
}
