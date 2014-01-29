package ar.com.burucps.business

import java.util.Date;

//import ar.com.burucps.party.Party
import ar.com.burucps.sales.ISalesRepresentative;
import ar.com.burucps.sales.ISummarizable;

class BusinessUnit implements ISummarizable  {
	
	String code;
	String name;
	// Auiditoria
	Date creationDate;
	String createdBy;
	Date lastUpdateDate;
	String lastUpdateBy;

	// TODO era ISalesRepresentative
	//static hasMany = [salesRepresentatives : Party]
	static belongsTo = [coordinator : Coordinator, parent : BusinessUnit]

	static constraints = {
		code (blank:false)
		name (blank:false)
		coordinator(nullable: true)
		parent(nullable:true)
		// Auditoria
		creationDate (nullable: true);
		createdBy (nullable: true);
		lastUpdateDate (nullable: true);
		lastUpdateBy (nullable: true);
	}
	
	def beforeInsert() {
		//createdBy = securityService.currentAuthenticatedUsername()
		//lastUpdatedBy = securityService.currentAuthenticatedUsername()
		creationDate = new Date();
		lastUpdateDate = new Date();
	 }
	
	def beforeUpdate() {
		//lastUpdatedBy = securityService.currentAuthenticatedUsername()
		lastUpdateDate = new Date();
	 }
	
	String toString() {
		"$name";
	}
}
