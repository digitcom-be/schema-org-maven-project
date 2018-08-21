/**
 * A person (alive, dead, undead, or fictional).
 * Canonical URL: http://schema.org/Person
 */
package be.digitcom.schema;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import be.digitcom.schema.event.Event;

/**
 * @author Rufin Hounkpe
 *
 */

public class Person extends Entity implements Comparable<Person> {
	
	/**
	 * @param familyName
	 * 
	 * Family name. In the U.S., the last name of an Person. 
	 * This can be used along with givenName instead of the name property.
	 * 
	 */
	private String familyName;
	
	/**
	 * @param givenName
	 * Given name. In the U.S., the first name of a Person. 
	 * This can be used along with familyName instead of the name property.
	 */
	private String givenName;
	
	
	/**
	 * 
	 * @param additionalName
	 * 
	 * An additional name for a Person, can be used for a middle name.
	 */
	private String additionalName;
	
	/**
	 * @param birthDate
	 * Date of birth.
	 */
	private LocalDate birthDate;
	
	/**
	 * @param birthPlace
	 * The place where the person was born.
	 */
	private String birthPlace;
	
	
	/**
	 * @param gender
	 * Gender of the person. While http://schema.org/Male and http://schema.org/Female may be used, 
	 * text strings are also acceptable for people who do not identify as a binary gender.
	 */
	private GenderType gender = GenderType.UNKNOWN;
	
	
	/**
	 * 
	 * @param affiliation
	 * 
	 * An organization that this person is affiliated with. 
	 * For example, a school/university, a club, or a team.
	 */
	private List<Organization>  affiliation = new ArrayList<>();
	
	/**
	 * 
	 * @param awards
	 * 
	 * An award won by or for this item. Supersedes awards.
	 */
	private List<String> awards = new ArrayList<>();
	
	/**
	 * 
	 * @param children
	 * 
	 * Children of the person.
	 */
	private List<Person> children = new ArrayList<>();
	
	/**
	 * 
	 * @param colleagues
	 * 
	 * A colleague of the person. Supersedes colleagues.
	 */
	private List<Person> colleagues = new ArrayList<>();
	
	/**
	 * 
	 * @param contactPoints
	 * 
	 * A contact point for a person or organization. Supersedes contactPoints.
	 */
	private List<ContactPoint>  contactPoints = new ArrayList<>();
	
	/**
	 * 
	 * @param deathDate
	 * 
	 * Date of death.
	 */
	private LocalDate deathDate;
	
	/**
	 * 
	 * @param deathPlace
	 * 
	 * The place where the person died.
	 */
	private Place deathPlace;
	
	private List<Person> followees = new ArrayList<>();
	
	private List<Person> followers = new ArrayList<>();
	
	/**
	 * 
	 * @param HonorificPrefix
	 * 
	 * An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
	 */
	private HonorificPrefix HonorificPrefix;
	
	/**
	 * 
	 * @param honorificSuffix
	 * 
	 * An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.
	 */
	private HonorificSuffix honorificSuffix;
	
	/**
	 * 
	 * @param jobTitle
	 * 
	 * The job title of the person (for example, Financial Manager).
	 */
	private String jobTitle;
	
	/**
	 * 
	 * @param memberOf
	 * 
	 * An Organization (or ProgramMembership) to which this Person or Organization belongs.
	 */
	private List<Organization> memberOf = new ArrayList<>();
	
	/**
	 * 
	 * @param name
	 * 
	 * 	Nationality of the person.
	 */
	private List<String> nationality = new ArrayList<>();
	
	/**
	 * 
	 * @param parents
	 * 
	 * A parent of this person. Supersedes parents.
	 */
	private List<Person> parents = new ArrayList<>();
	
	/**
	 * 
	 * @param performerIn
	 * 
	 * Event that this person is a performer or participant in.
	 */
	private List<Event> performerIn = new ArrayList<>();
	
	/**
	 * 
	 * @param siblings
	 * 
	 * A sibling of the person. Supersedes siblings.
	 */
	private List<Person> siblings = new ArrayList<>();
	
	/**
	 * 
	 * @param spouse
	 * 
	 * The person's spouse.
	 */
	private Person spouse;

	
	
	/**
	 * 
	 * @param workLocation
	 * 
	 * A contact location for a person's place of work.
	 */
	private ContactPoint workLocation;
	
	
	/**
	 * 
	 * @param worksFor
	 * 
	 * Organizations that the person works for
	 */
	private Organization  worksFor;
	
	
	/*
	 * An organization that the person is an alumni of.
	 * Inverse property: alumni.
	 */
	private List<EducationalOrganization> alumniOf = new ArrayList<>();
	
	
	// Constructor
	public Person() {}
	
	public Person(String familyName, String givenName) {
		this.setFamilyName(familyName);
		this.setGivenName(givenName);
		this.setName(familyName + " " +givenName); 
	}
	
	public Person(String familyName, String givenName, String email) {
		super(email);
		this.setFamilyName(familyName);
		this.setGivenName(givenName);
		this.setName(familyName + " " +givenName); 
	}
	
	

	/**
	 * @return the familyName
	 */
	public String getFamilyName() {
		return familyName;
	}


	/**
	 * @param familyName the familyName to set
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}


	/**
	 * @return the givenName
	 */
	public String getGivenName() {
		return givenName;
	}


	/**
	 * @param givenName the givenName to set
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}


	/**
	 * @return the additionalName
	 */
	public String getAdditionalName() {
		return additionalName;
	}


	/**
	 * @param additionalName the additionalName to set
	 */
	public void setAdditionalName(String additionalName) {
		this.additionalName = additionalName;
	}


	/**
	 * @return the birthDate
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}


	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}


	/**
	 * @return the birthPlace
	 */
	public String getBirthPlace() {
		return birthPlace;
	}


	/**
	 * @param birthPlace the birthPlace to set
	 */
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}


	/**
	 * @return the gender
	 */
	public GenderType getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(GenderType gender) {
		this.gender = gender;
	}


	/**
	 * @return the affiliation
	 */
	public List<Organization> getAffiliation() {
		return affiliation;
	}


	/**
	 * @param affiliation the affiliation to set
	 */
	public void setAffiliation(List<Organization> affiliation) {
		this.affiliation = affiliation;
	}


	/**
	 * @return the awards
	 */
	public List<String> getAwards() {
		return awards;
	}


	/**
	 * @param awards the awards to set
	 */
	public void setAwards(List<String> awards) {
		this.awards = awards;
	}


	/**
	 * @return the children
	 */
	public List<Person> getChildren() {
		return children;
	}


	/**
	 * @param children the children to set
	 */
	public void setChildren(List<Person> children) {
		this.children = children;
	}


	/**
	 * @return the colleagues
	 */
	public List<Person> getColleagues() {
		return colleagues;
	}


	/**
	 * @param colleagues the colleagues to set
	 */
	public void setColleagues(List<Person> colleagues) {
		this.colleagues = colleagues;
	}


	/**
	 * @return the contactPoints
	 */
	public List<ContactPoint> getContactPoints() {
		return contactPoints;
	}


	/**
	 * @param contactPoints the contactPoints to set
	 */
	public void setContactPoints(List<ContactPoint> contactPoints) {
		this.contactPoints = contactPoints;
	}


	/**
	 * @return the deathDate
	 */
	public LocalDate getDeathDate() {
		return deathDate;
	}


	/**
	 * @param deathDate the deathDate to set
	 */
	public void setDeathDate(LocalDate deathDate) {
		this.deathDate = deathDate;
	}


	/**
	 * @return the deathPlace
	 */
	public Place getDeathPlace() {
		return deathPlace;
	}


	/**
	 * @param deathPlace the deathPlace to set
	 */
	public void setDeathPlace(Place deathPlace) {
		this.deathPlace = deathPlace;
	}


	/**
	 * @return the followees
	 */
	public List<Person> getFollowees() {
		return followees;
	}


	/**
	 * @param followees the followees to set
	 */
	public void setFollowees(List<Person> followees) {
		this.followees = followees;
	}


	/**
	 * @return the followers
	 */
	public List<Person> getFollowers() {
		return followers;
	}


	/**
	 * @param followers the followers to set
	 */
	public void setFollowers(List<Person> followers) {
		this.followers = followers;
	}


	/**
	 * @return the honorificPrefix
	 */
	public HonorificPrefix getHonorificPrefix() {
		return HonorificPrefix;
	}


	/**
	 * @param honorificPrefix the honorificPrefix to set
	 */
	public void setHonorificPrefix(HonorificPrefix honorificPrefix) {
		HonorificPrefix = honorificPrefix;
	}


	/**
	 * @return the honorificSuffix
	 */
	public HonorificSuffix getHonorificSuffix() {
		return honorificSuffix;
	}


	/**
	 * @param honorificSuffix the honorificSuffix to set
	 */
	public void setHonorificSuffix(HonorificSuffix honorificSuffix) {
		this.honorificSuffix = honorificSuffix;
	}


	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}


	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	/**
	 * @return the memberOf
	 */
	public List<Organization> getMemberOf() {
		return memberOf;
	}


	/**
	 * @param memberOf the memberOf to set
	 */
	public void setMemberOf(List<Organization> memberOf) {
		this.memberOf = memberOf;
	}


	/**
	 * @return the nationality
	 */
	public List<String> getNationality() {
		return nationality;
	}


	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(List<String> nationality) {
		this.nationality = nationality;
	}


	/**
	 * @return the parents
	 */
	public List<Person> getParents() {
		return parents;
	}


	/**
	 * @param parents the parents to set
	 */
	public void setParents(List<Person> parents) {
		this.parents = parents;
	}


	/**
	 * @return the performerIn
	 */
	public List<Event> getPerformerIn() {
		return performerIn;
	}


	/**
	 * @param performerIn the performerIn to set
	 */
	public void setPerformerIn(List<Event> performerIn) {
		this.performerIn = performerIn;
	}


	/**
	 * @return the siblings
	 */
	public List<Person> getSiblings() {
		return siblings;
	}


	/**
	 * @param siblings the siblings to set
	 */
	public void setSiblings(List<Person> siblings) {
		this.siblings = siblings;
	}


	/**
	 * @return the spouse
	 */
	public Person getSpouse() {
		return spouse;
	}


	/**
	 * @param spouse the spouse to set
	 */
	public void setSpouse(Person spouse) {
		this.spouse = spouse;
	}


	/**
	 * @return the workLocation
	 */
	public ContactPoint getWorkLocation() {
		return workLocation;
	}


	/**
	 * @param workLocation the workLocation to set
	 */
	public void setWorkLocation(ContactPoint workLocation) {
		this.workLocation = workLocation;
	}


	/**
	 * @return the worksFor
	 */
	public Organization getWorksFor() {
		return worksFor;
	}


	/**
	 * @param worksFor the worksFor to set
	 */
	public void setWorksFor(Organization worksFor) {
		this.worksFor = worksFor;
	}


	/**
	 * @return the alumniOf
	 */
	public List<EducationalOrganization> getAlumniOf() {
		return alumniOf;
	}


	/**
	 * @param alumniOf the alumniOf to set
	 */
	public void setAlumniOf(List<EducationalOrganization> alumniOf) {
		this.alumniOf = alumniOf;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
	

	@Override
	public int compareTo(Person p) {
		return this.getName().compareTo(p.getName());
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Person)) {
			return false;
		}
		
		Person person = (Person)o;
		return (this.getFamilyName().equals(person.getFamilyName()) && 
				this.getGivenName().equals(person.getGivenName()) && 
				this.getEmail().equals(person.getEmail())
		);
	}
	
	@Override
	public int hashCode() {
		int hash = 53;
		
		hash = hash + this.getFamilyName().hashCode() + this.getGivenName().hashCode();
		hash = hash * this.getEmail().hashCode() * 13;
		
		return hash;
	}

	
	
}