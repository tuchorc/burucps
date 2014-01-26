package ar.com.burucps.party

//TODO: debe ser abstract
//abstract class Party {
class Party {

	String uid;
	String name;
	String email;

	// Auiditoria
	Date creationDate;
	String createdBy;
	Date lastUpdateDate;
	String lastUpdateBy;


	static mapping = { tablePerHierarchy false }

	static constraints = {
		uid (nullable: true)
		name (blank: false, nullable: true)
		email (email : true, nullable: true)
		// Auditoria
		creationDate (nullable: true);
		createdBy (nullable: true);
		lastUpdateDate (nullable: true);
		lastUpdateBy (nullable: true);
	}
	
	def beforeInsert() {
		//createdBy = securityService.currentAuthenticatedUsername()
		creationDate = new Date();
		lastUpdateDate = new Date();
	 }
	
	def beforeUpdate() {
		//lastUpdatedBy = securityService.currentAuthenticatedUsername()
		lastUpdateDate = new Date();
	 }
}
