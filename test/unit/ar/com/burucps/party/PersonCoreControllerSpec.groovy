package ar.com.burucps.party



import grails.test.mixin.*
import spock.lang.*

@TestFor(PersonCoreController)
@Mock(PersonCore)
class PersonCoreControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.personCoreInstanceList
            model.personCoreInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.personCoreInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            def personCore = new PersonCore()
            personCore.validate()
            controller.save(personCore)

        then:"The create view is rendered again with the correct model"
            model.personCoreInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            personCore = new PersonCore(params)

            controller.save(personCore)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/personCore/show/1'
            controller.flash.message != null
            PersonCore.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def personCore = new PersonCore(params)
            controller.show(personCore)

        then:"A model is populated containing the domain instance"
            model.personCoreInstance == personCore
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def personCore = new PersonCore(params)
            controller.edit(personCore)

        then:"A model is populated containing the domain instance"
            model.personCoreInstance == personCore
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/personCore/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def personCore = new PersonCore()
            personCore.validate()
            controller.update(personCore)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.personCoreInstance == personCore

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            personCore = new PersonCore(params).save(flush: true)
            controller.update(personCore)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/personCore/show/$personCore.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/personCore/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def personCore = new PersonCore(params).save(flush: true)

        then:"It exists"
            PersonCore.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(personCore)

        then:"The instance is deleted"
            PersonCore.count() == 0
            response.redirectedUrl == '/personCore/index'
            flash.message != null
    }
}
