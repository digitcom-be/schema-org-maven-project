/**
 * @url http://schema.org/EducationalAudience
 * 
 * An EducationalAudience.
 */
package be.digitcom.schema.audience;

/**
 * @author Rufin M�togb� Hounkpe
 *
 */
public class EducationalAudience extends Audience {
	/*
	 * An educationalRole of an EducationalAudience.
	 */
	private String educationalRole;

	/**
	 * @return the educationalRole
	 */
	public String getEducationalRole() {
		return educationalRole;
	}

	/**
	 * @param educationalRole the educationalRole to set
	 */
	public void setEducationalRole(String educationalRole) {
		this.educationalRole = educationalRole;
	}
	
}
