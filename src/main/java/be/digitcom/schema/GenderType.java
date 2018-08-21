package be.digitcom.schema;

public enum GenderType {
	MALE("Male"),
	FEMALE("Female"),
	UNKNOWN("Unknown");
	
	private String name;
	
	private GenderType(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
}
