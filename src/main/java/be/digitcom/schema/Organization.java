/**
 * 
 */
package be.digitcom.schema;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import be.digitcom.schema.event.Event;

/**
 * @author Rufin Hounkpe
 *
 */

public class Organization extends Entity implements Comparable<Organization>, Comparator<Organization> {
	/*
	 * The official name of the organization, e.g. the registered company name.
	 */
	private String legalName;		
	
	
	/*
	 * The location of for example where the event is happening, 
	 * an organization is located, or where an action takes place.
	 */
	private Place location;
	
	
	
	/*
	 * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. 
	 * See also: the more specific 'department' property. Inverse property: parentOrganization.
	 */
	private List<Organization> subOrganizations = new ArrayList<>();
	
	/*
	 * A person or organization that supports a thing through a pledge, promise, 
	 * or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
	 */
	private List<Entity> sponsors = new ArrayList<>();
	

	
	/*
	 * The larger organization that this organization is a subOrganization of, if any. Supersedes branchOf.
	 * Inverse property: subOrganization.
	 */
	private Organization parentOrganization;
	
	
	/*
	 * An Organization (or ProgramMembership) to which this Person or Organization belongs.
	 * Inverse property: member.
	 */
	private List<Organization> memberOf = new ArrayList<>();
	
	
	/*
	 * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; 
	 * ProgramMembership is typically for individuals. Supersedes members, musicGroupMember.
	 * Inverse property: memberOf.
	 */
	private List<Person> members = new ArrayList<>();
	
	
	/*
	 * An associated logo.
	 */
	private String logo;

	
	/*
	 * A person or organization that supports (sponsors) something through some kind of financial contribution.
	 */
	private Organization[] funders;
	
	/*
	 * The place where the Organization was founded.
	 */
	private Place foundingLocation;
	
	/*
	 * The date that this organization was founded.
	 */
	private LocalDate foundingDate;
	
	/*
	 * A person who founded this organization. Supersedes founders.
	 */
	private List<Person> founders = new ArrayList<>();
	

	
	/*
	 * Upcoming or past event associated with this place, organization, or action. Supersedes events.
	 */
	private List<Event>events = new ArrayList<>();
	
	/*
	 * Someone working for this organization. Supersedes employees.
	 */
	private List<Person> employees = new ArrayList<>();
	

	
	/*
	 * The date that this organization was dissolved.
	 */
	private LocalDate dissolutionDate;
	

	/*
	 * The brand(s) associated with a product or service, 
	 * or the brand(s) maintained by an organization or business person.
	 */
	private List<Brand> brands = new ArrayList<>();
	

	
	/*
	 * The geographic area where a service or offered item is provided. Supersedes serviceArea.
	 */
	private List<AdministrativeArea> areaServed = new ArrayList<>();
	
	
	/*
	 * For a NewsMediaOrganization or other news-related Organization, 
	 * a statement about public engagement activities (for news media, the newsroom�s), 
	 * including involving the public - digitally or otherwise -- in coverage decisions, 
	 * reporting and activities after publication.
	 */
	private String actionableFeedbackPolicy;
	
	
	/*
	 * An organization identifier that uniquely identifies a legal entity as defined in ISO 17442.
	 */
	private String leiCode;
	
	
	/*
	 *  Constructor
	 */
	public Organization() {
		
	}
	
	public Organization(String legalName) {
		this.setLegalName(legalName);
		this.setName(legalName);
	}
	
	public Organization(String legalName, String email) {
		this(legalName);
		this.setEmail(email);
	}

	/**
	 * @return the legalName
	 */
	public String getLegalName() {
		return legalName;
	}

	/**
	 * @param legalName the legalName to set
	 */
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	/**
	 * @return the location
	 */
	public Place getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Place location) {
		this.location = location;
	}

	/**
	 * @return the subOrganizations
	 */
	public List<Organization> getSubOrganizations() {
		return subOrganizations;
	}

	/**
	 * @param subOrganizations the subOrganizations to set
	 */
	public void setSubOrganizations(List<Organization> subOrganizations) {
		this.subOrganizations = subOrganizations;
	}

	/**
	 * @return the sponsors
	 */
	public List<Entity> getSponsors() {
		return sponsors;
	}

	/**
	 * @param sponsors the sponsors to set
	 */
	public void setSponsors(List<Entity> sponsors) {
		this.sponsors = sponsors;
	}

	/**
	 * @return the parentOrganization
	 */
	public Organization getParentOrganization() {
		return parentOrganization;
	}

	/**
	 * @param parentOrganization the parentOrganization to set
	 */
	public void setParentOrganization(Organization parentOrganization) {
		this.parentOrganization = parentOrganization;
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
	 * @return the members
	 */
	public List<Person> getMembers() {
		return members;
	}

	/**
	 * @param members the members to set
	 */
	public void setMembers(List<Person> members) {
		this.members = members;
	}

	/**
	 * @return the logo
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * @param logo the logo to set
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}

	/**
	 * @return the funders
	 */
	public Organization[] getFunders() {
		return funders;
	}

	/**
	 * @param funders the funders to set
	 */
	public void setFunders(Organization[] funders) {
		this.funders = funders;
	}

	/**
	 * @return the foundingLocation
	 */
	public Place getFoundingLocation() {
		return foundingLocation;
	}

	/**
	 * @param foundingLocation the foundingLocation to set
	 */
	public void setFoundingLocation(Place foundingLocation) {
		this.foundingLocation = foundingLocation;
	}

	/**
	 * @return the foundingDate
	 */
	public LocalDate getFoundingDate() {
		return foundingDate;
	}

	/**
	 * @param foundingDate the foundingDate to set
	 */
	public void setFoundingDate(LocalDate foundingDate) {
		this.foundingDate = foundingDate;
	}

	/**
	 * @return the founders
	 */
	public List<Person> getFounders() {
		return founders;
	}

	/**
	 * @param founders the founders to set
	 */
	public void setFounders(List<Person> founders) {
		this.founders = founders;
	}

	/**
	 * @return the events
	 */
	public List<Event> getEvents() {
		return events;
	}

	/**
	 * @param events the events to set
	 */
	public void setEvents(List<Event> events) {
		this.events = events;
	}

	/**
	 * @return the employees
	 */
	public List<Person> getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(List<Person> employees) {
		this.employees = employees;
	}

	/**
	 * @return the dissolutionDate
	 */
	public LocalDate getDissolutionDate() {
		return dissolutionDate;
	}

	/**
	 * @param dissolutionDate the dissolutionDate to set
	 */
	public void setDissolutionDate(LocalDate dissolutionDate) {
		this.dissolutionDate = dissolutionDate;
	}

	/**
	 * @return the brands
	 */
	public List<Brand> getBrands() {
		return brands;
	}

	/**
	 * @param brands the brands to set
	 */
	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}

	/**
	 * @return the areaServed
	 */
	public List<AdministrativeArea> getAreaServed() {
		return areaServed;
	}

	/**
	 * @param areaServed the areaServed to set
	 */
	public void setAreaServed(List<AdministrativeArea> areaServed) {
		this.areaServed = areaServed;
	}

	/**
	 * @return the actionableFeedbackPolicy
	 */
	public String getActionableFeedbackPolicy() {
		return actionableFeedbackPolicy;
	}

	/**
	 * @param actionableFeedbackPolicy the actionableFeedbackPolicy to set
	 */
	public void setActionableFeedbackPolicy(String actionableFeedbackPolicy) {
		this.actionableFeedbackPolicy = actionableFeedbackPolicy;
	}

	/**
	 * @return the leiCode
	 */
	public String getLeiCode() {
		return leiCode;
	}

	/**
	 * @param leiCode the leiCode to set
	 */
	public void setLeiCode(String leiCode) {
		this.leiCode = leiCode;
	}
	
	
	@Override
	public int hashCode() {
		int hash = this.getLegalName().hashCode();
		
		hash *= 13;
		
		hash = hash + this.getEmail().hashCode() * 51;
		
		return hash;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Organization) {
			Organization organization = (Organization)o;
			return this.getLegalName().equals(organization.getLegalName()) && this.getEmail().equals(organization.getEmail());
		}
		return false;
	}
	
	@Override
	public int compareTo(Organization organization) {
		return this.getLegalName().compareTo(organization.getLegalName());
	}
	
	@Override
	public int compare(Organization o1, Organization o2) {
		Comparator<Organization> c = Comparator.comparing(o -> o.getLegalName());
		c = c.thenComparing(o -> o.getEmail());
		return c.compare(o1, o2);
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
	
}