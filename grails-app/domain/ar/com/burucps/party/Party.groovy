package ar.com.burucps.party

abstract class Party {
	
	static mapping = { tablePerHierarchy false }

	abstract String getName();
	abstract String getUid();
	abstract String getEmail();
	
	String toString() {
		"$name";
	}
}
