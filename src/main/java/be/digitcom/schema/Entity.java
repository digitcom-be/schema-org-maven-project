/**
 * 
 */
package be.digitcom.schema;

import java.util.ArrayList;
import java.util.List;

import be.digitcom.schema.service.Demand;

/**
 * @author Rufin Hounkpe
 *
 */
public abstract class Entity extends Thing {
	/*
	 * Physical address of the item.
	 */
	private PostalAddress address;
	
	/*
	 * The overall rating, based on a collection of reviews or ratings, of the item.
	 */
	private AggregateRating  aggregateRating;
	
	
	/*
	 * An award won by or for this item. Supersedes awards.
	 */
	private List<String> awards = new ArrayList<>();
	
	/*
	 * A contact point for a person or organization. Supersedes contactPoints.
	 */
	private List<ContactPoint> contactPoints = new ArrayList<>();
	
	/*
	 * 	Email address.
	 */
	private String email;
	
	/*
	 * The fax number.
	 */
	private String faxNumber;
	
	/*
	 * An Organization (or ProgramMembership) to which this Person or Organization belongs.
	 * Inverse property: member.
	 */
	private List<Organization> memberOf = new ArrayList<>();
	
	/*
	 * A review of the item. Supersedes reviews.
	 */
	private List<Review> reviews = new ArrayList<>();
	
	/*
	 * A pointer to products or services sought by the organization or person (demand).
	 */
	private List<Demand> seeks = new ArrayList<>();
	
	
	/*
	 * A person or organization that supports a thing through a pledge, promise, 
	 * or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
	 */
	private List<Entity> sponsors = new ArrayList<>();
	
	/*
	 * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
	 */
	private String taxID;
	
	/*
	 * The telephone number.
	 */
	private List<String> telephone = new ArrayList<>();
	
	/*
	 * The Value-added Tax ID of the organization or person.
	 */
	private String vatID;
	
	// Constructor
	public Entity() {}
	
	public Entity(String email) {
		this.setEmail(email);
	}

	/**
	 * @return the address
	 */
	public PostalAddress getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(PostalAddress address) {
		this.address = address;
	}

	/**
	 * @return the aggregateRating
	 */
	public AggregateRating getAggregateRating() {
		return aggregateRating;
	}

	/**
	 * @param aggregateRating the aggregateRating to set
	 */
	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the faxNumber
	 */
	public String getFaxNumber() {
		return faxNumber;
	}

	/**
	 * @param faxNumber the faxNumber to set
	 */
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
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
	 * @return the reviews
	 */
	public List<Review> getReviews() {
		return reviews;
	}

	/**
	 * @param reviews the reviews to set
	 */
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	/**
	 * @return the seeks
	 */
	public List<Demand> getSeeks() {
		return seeks;
	}

	/**
	 * @param seeks the seeks to set
	 */
	public void setSeeks(List<Demand> seeks) {
		this.seeks = seeks;
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
	 * @return the taxID
	 */
	public String getTaxID() {
		return taxID;
	}

	/**
	 * @param taxID the taxID to set
	 */
	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

	/**
	 * @return the telephone
	 */
	public List<String> getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(List<String> telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the vatID
	 */
	public String getVatID() {
		return vatID;
	}

	/**
	 * @param vatID the vatID to set
	 */
	public void setVatID(String vatID) {
		this.vatID = vatID;
	}
	
	
	
	
}
