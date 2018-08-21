/*
 * http://schema.org/Place
 */
package be.digitcom.schema;

import java.util.ArrayList;
import java.util.List;

import be.digitcom.schema.event.Event;

public class Place extends Thing {
	/*
	 * Physical address of the item.
	 */
	private PostalAddress address;
	
	/*
	 * The overall rating, based on a collection of reviews or ratings, of the item.
	 */
	private AggregateRating aggregateRating;
	
	/*
	 * The basic containment relation between a place and one that contains it. Supersedes containedIn.
	 * Inverse property: containsPlace.
	 */
	private Place containedInPlace;
	
	
	/*
	 * The basic containment relation between a place and another that it contains.
	 * Inverse property: containedInPlace.
	 */
	private Place containsPlace;
	
	/*
	 * Upcoming or past event associated with this place, organization, or action. Supersedes events.
	 */
	private List<Event> events = new ArrayList<>();
	
	
	/*
	 * The fax number.
	 */
	private String faxNumber;
	
	/*
	 * The geo coordinates of the place.
	 */
	private GeoCoordinates geo;
	
	/*
	 * A flag to signal that the item, event, or place is accessible for free. Supersedes free.
	 */
	private boolean isAccessibleForFree;
	
	/*
	 * An associated logo.
	 */
	private String logo;
	
	/*
	 * The total number of individuals that may attend an event or venue.
	 */
	private int maximumAttendeeCapacity;
	
	
	/*
	 * The opening hours of a certain place.
	 */
	private OpeningHoursSpecification openingHoursSpecification;
	
	
	/*
	 * A photograph of this place. Supersedes photos.
	 */
	private String photos;
	
	/*
	 * A flag to signal that the Place is open to public visitors. 
	 * If this property is omitted there is no assumed default boolean value
	 */
	private boolean publicAccess;
	
	
	/*
	 * A review of the item. Supersedes reviews.
	 */
	private Review[] reviews;
	
	
	/*
	 * Indicates whether it is allowed to smoke in the place, e.g. in the restaurant, hotel or hotel room.
	 */
	private boolean smokingAllowed;
	
	
	/*
	 * The special opening hours of a certain place.
	 * Use this to explicitly override general opening hours brought in scope by openingHoursSpecification or openingHours.
	 */
	private OpeningHoursSpecification specialOpeningHoursSpecification;
	
	
	/*
	 * The telephone number.
	 */
	private String telephone;
	
	
	/*
	 * Constructor
	 */
	public Place() {}


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
	 * @return the containedInPlace
	 */
	public Place getContainedInPlace() {
		return containedInPlace;
	}


	/**
	 * @param containedInPlace the containedInPlace to set
	 */
	public void setContainedInPlace(Place containedInPlace) {
		this.containedInPlace = containedInPlace;
	}


	/**
	 * @return the containsPlace
	 */
	public Place getContainsPlace() {
		return containsPlace;
	}


	/**
	 * @param containsPlace the containsPlace to set
	 */
	public void setContainsPlace(Place containsPlace) {
		this.containsPlace = containsPlace;
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
	 * @return the geo
	 */
	public GeoCoordinates getGeo() {
		return geo;
	}


	/**
	 * @param geo the geo to set
	 */
	public void setGeo(GeoCoordinates geo) {
		this.geo = geo;
	}


	/**
	 * @return the isAccessibleForFree
	 */
	public boolean isAccessibleForFree() {
		return isAccessibleForFree;
	}


	/**
	 * @param isAccessibleForFree the isAccessibleForFree to set
	 */
	public void setAccessibleForFree(boolean isAccessibleForFree) {
		this.isAccessibleForFree = isAccessibleForFree;
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
	 * @return the maximumAttendeeCapacity
	 */
	public int getMaximumAttendeeCapacity() {
		return maximumAttendeeCapacity;
	}


	/**
	 * @param maximumAttendeeCapacity the maximumAttendeeCapacity to set
	 */
	public void setMaximumAttendeeCapacity(int maximumAttendeeCapacity) {
		this.maximumAttendeeCapacity = maximumAttendeeCapacity;
	}


	/**
	 * @return the openingHoursSpecification
	 */
	public OpeningHoursSpecification getOpeningHoursSpecification() {
		return openingHoursSpecification;
	}


	/**
	 * @param openingHoursSpecification the openingHoursSpecification to set
	 */
	public void setOpeningHoursSpecification(OpeningHoursSpecification openingHoursSpecification) {
		this.openingHoursSpecification = openingHoursSpecification;
	}


	/**
	 * @return the photos
	 */
	public String getPhotos() {
		return photos;
	}


	/**
	 * @param photos the photos to set
	 */
	public void setPhotos(String photos) {
		this.photos = photos;
	}


	/**
	 * @return the publicAccess
	 */
	public boolean isPublicAccess() {
		return publicAccess;
	}


	/**
	 * @param publicAccess the publicAccess to set
	 */
	public void setPublicAccess(boolean publicAccess) {
		this.publicAccess = publicAccess;
	}


	/**
	 * @return the reviews
	 */
	public Review[] getReviews() {
		return reviews;
	}


	/**
	 * @param reviews the reviews to set
	 */
	public void setReviews(Review[] reviews) {
		this.reviews = reviews;
	}


	/**
	 * @return the smokingAllowed
	 */
	public boolean isSmokingAllowed() {
		return smokingAllowed;
	}


	/**
	 * @param smokingAllowed the smokingAllowed to set
	 */
	public void setSmokingAllowed(boolean smokingAllowed) {
		this.smokingAllowed = smokingAllowed;
	}


	/**
	 * @return the specialOpeningHoursSpecification
	 */
	public OpeningHoursSpecification getSpecialOpeningHoursSpecification() {
		return specialOpeningHoursSpecification;
	}


	/**
	 * @param specialOpeningHoursSpecification the specialOpeningHoursSpecification to set
	 */
	public void setSpecialOpeningHoursSpecification(OpeningHoursSpecification specialOpeningHoursSpecification) {
		this.specialOpeningHoursSpecification = specialOpeningHoursSpecification;
	}


	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}


	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
}
