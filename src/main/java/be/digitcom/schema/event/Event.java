/**
 * An event happening at a certain time and location, such as a concert, lecture, or festival. 
 * Ticketing information may be added via the offers property. 
 * Repeated events may be structured as separate Event objects.
 * 
 * @author Rufin Hounkpe
 * 
 * @author schema.org
 * @url http://schema.org/Event
 */

package be.digitcom.schema.event;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import be.digitcom.schema.Entity;
import be.digitcom.schema.Person;
import be.digitcom.schema.Place;
import be.digitcom.schema.Rating;
import be.digitcom.schema.Review;
import be.digitcom.schema.Thing;
import be.digitcom.schema.service.Offer;

public class Event extends Thing {
	/**
	 * @param about
	 * 
	 * The subject matter of the content.
	 */
	private Thing about;
	
	/**
	 * @param actors
	 * 
	 * An actor, e.g. in tv, radio, movie, video games etc., or in an event. 
	 * Actors can be associated with individual items or with a series, episode, clip. 
	 * Supersedes actors.
	 * 
	 */
	private List<Person> actors = new ArrayList<>();
	
	private List<Rating> ratings = new ArrayList<>();

	
	/**
	 * @param attendees
	 * 
	 * A person or organization attending the event. Supersedes attendees.
	 */
	private List<Entity> attendees = new ArrayList<>();
	
	/**
	 * 
	 * The person or organization who wrote a composition, 
	 * or who is the composer of a work performed at some event.
	 * 
	 */
	private List<Entity> composers = new ArrayList<>();
	
	/**
	 * A secondary contributor to the CreativeWork or Event.
	 */
	private List<Entity> contributors = new ArrayList<>();
	
	/**
	 * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. 
	 * Directors can be associated with individual items or with a series, episode, clip. 
	 * Supersedes directors.
	 */
	private List<Person> directors = new ArrayList<>();
	
	/**
	 * The time admission will commence.
	 */
	private LocalTime doorTime;
	
	
	/**
	 * The start date and time of the item (in ISO 8601 date format).
	 */
	private LocalDateTime startDate;
	
	
	/**
	 * The end date and time of the item (in ISO 8601 date format).
	 */
	private LocalDateTime endDate;
	
	
	/**
	 * An eventStatus of an event represents its status; 
	 * particularly useful when an event is cancelled or rescheduled.
	 */
	private EventStatusType eventStatus = EventStatusType.EventScheduled;
	
	/**
	 * A person or organization that supports (sponsors) something through some kind of financial contribution.
	 */
	private List<Entity> funders = new ArrayList<>();
	
	/**
	 * The language of the content or performance or used in an action. 
	 * Please use one of the language codes from the IETF BCP 47 standard.
	 * See also availableLanguage. Supersedes language.
	 */
	private List<String> inLanguage = new ArrayList<>();
	
	/**
	 * The location of for example where the event is happening, 
	 * an organization is located, or where an action takes place.
	 */
	private Place location;
	
	
	/**
	 * @param maximumAttendeeCapacity
	 * 
	 * The total number of individuals that may attend an event or venue.
	 */
	private int maximumAttendeeCapacity;
	
	
	/**
	 * A flag to signal that the item, event, or place is accessible for free. Supersedes free.
	 */
	
	
	/**
	 * An offer to provide this item�for example, an offer to sell a product, rent the DVD of a movie, 
	 * perform a service, or give away tickets to an event.
	 */
	private List<Offer> offers = new ArrayList<>();
	
	/**
	 * An organizer of an Event.
	 */
	private List<Entity> organizers = new ArrayList<>();
	
	/**
	 * A performer at the event�for example, a presenter, musician, musical group or actor.
	 * Supersedes performers.
	 */
	private List<Entity> performers = new ArrayList<>();
	
	/**
	 * A review of the item. Supersedes reviews.
	 */
	private List<Review> reviews = new ArrayList<>();
	
	/**
	 * A person or organization that supports a thing through a pledge, 
	 * promise, or financial contribution. e.g. a sponsor of a Medical Study 
	 * or a corporate sponsor of an event.
	 */
	private List<Entity> sponsors = new ArrayList<>();
	
	
	/**
	 * An Event that is part of this event. For example, 
	 * a conference event includes many presentations, 
	 * each of which is a subEvent of the conference. 
	 * Supersedes subEvents.
	 * Inverse property: superEvent.
	 */
	private List<Event> subEvents = new ArrayList<>(); 
	
	
	/**
	 * An event that this event is a part of. 
	 * For example, a collection of individual music performances might each have a music festival as their superEvent.
	 * Inverse property: subEvent.
	 */
	private Event superEvent;
	
	/**
	 * The typical expected age range, e.g. '7-9', '11-'.
	 */
	private String typicalAgeRange;
	
	/*
	 * Organization or person who adapts a creative work to different languages, 
	 * regional differences and technical requirements of a target market, or that translates during some event.
	 */
	private List<Entity> translators = new ArrayList<>();
	
	
	
	
	// Constructor
	
	public Event() {}

	
	
	
	/**
	 * @return the about
	 */
	public Thing getAbout() {
		return about;
	}

	/**
	 * @param about the about to set
	 */
	public void setAbout(Thing about) {
		this.about = about;
	}

	/**
	 * @return the actors
	 */
	public List<Person> getActors() {
		return actors;
	}

	/**
	 * @param actors the actors to set
	 */
	public void setActors(Person... actors) {
		for(Person person : actors) {
			this.actors.add(person);
		}
	}

	/**
	 * @return the aggregateRating
	 */
	public List<Rating> getRatings() {
		return ratings;
	}
	

	/**
	 * @param ratings the ratings to set
	 */
	public void setRatings(Rating... ratings) {
		for(Rating rating : ratings) {
			this.ratings.add(rating);
		}
	}

	
	/**
	 * @return the attendees
	 */
	public List<Entity> getAttendees() {
		return attendees;
	}

	/**
	 * @param attendees the attendees to set
	 */
	public void setAttendees(Entity... attendees) {
		for(Entity  attendee : attendees) {
			this.attendees.add(attendee);
		}
	}

	/**
	 * @return the composers
	 */
	public List<Entity> getComposers() {
		return composers;
	}

	/**
	 * @param composers the composers to set
	 */
	public void setComposers(Entity... composers) {
		for(Entity entity : composers) {
			this.composers.add(entity);
		}
	}

	/**
	 * @return the contributors
	 */
	public List<Entity> getContributors() {
		return contributors;
	}

	/**
	 * @param contributors the contributors to set
	 */
	public void setContributors(Entity... contributors) {
		for(Entity entity : contributors) {
			this.contributors.add(entity);
		}
	}

	/**
	 * @return the directors
	 */
	public List<Person> getDirectors() {
		return directors;
	}

	/**
	 * @param directors the directors to set
	 */
	public void setDirectors(Person... directors) {
		for(Person director : directors) {
			this.directors.add(director);
		}
	}

	/**
	 * @return the doorTime
	 */
	public LocalTime getDoorTime() {
		return doorTime;
	}

	/**
	 * @param doorTime the doorTime to set
	 */
	public void setDoorTime(LocalTime doorTime) {
		this.doorTime = doorTime;
	}


	/**
	 * @return the startDate
	 */
	public LocalDateTime getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public LocalDateTime getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the eventStatus
	 */
	public EventStatusType getEventStatus() {
		return eventStatus;
	}

	/**
	 * @param eventStatus the eventStatus to set
	 */
	public void setEventStatus(EventStatusType eventStatus) {
		this.eventStatus = eventStatus;
	}

	/**
	 * @return the funders
	 */
	public List<Entity> getFunders() {
		return funders;
	}

	/**
	 * @param funders the funders to set
	 */
	public void setFunders(List<Entity> funders) {
		this.funders = funders;
	}

	/**
	 * @return the inLanguage
	 */
	public List<String> getInLanguage() {
		return inLanguage;
	}

	/**
	 * @param inLanguage the inLanguage to set
	 */
	public void setInLanguage(List<String> inLanguage) {
		this.inLanguage = inLanguage;
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
	 * @return the offers
	 */
	public List<Offer> getOffers() {
		return offers;
	}

	/**
	 * @param offers the offers to set
	 */
	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}

	/**
	 * @return the organizers
	 */
	public List<Entity> getOrganizers() {
		return organizers;
	}

	/**
	 * @param organizers the organizers to set
	 */
	public void setOrganizers(List<Entity> organizers) {
		this.organizers = organizers;
	}

	/**
	 * @return the performers
	 */
	public List<Entity> getPerformers() {
		return performers;
	}

	/**
	 * @param performers the performers to set
	 */
	public void setPerformers(List<Entity> performers) {
		this.performers = performers;
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
	 * @return the subEvents
	 */
	public List<Event> getSubEvents() {
		return subEvents;
	}

	/**
	 * @param subEvents the subEvents to set
	 */
	public void setSubEvents(List<Event> subEvents) {
		this.subEvents = subEvents;
	}

	/**
	 * @return the superEvent
	 */
	public Event getSuperEvent() {
		return superEvent;
	}

	/**
	 * @param superEvent the superEvent to set
	 */
	public void setSuperEvent(Event superEvent) {
		this.superEvent = superEvent;
	}

	/**
	 * @return the typicalAgeRange
	 */
	public String getTypicalAgeRange() {
		return typicalAgeRange;
	}

	/**
	 * @param typicalAgeRange the typicalAgeRange to set
	 */
	public void setTypicalAgeRange(String typicalAgeRange) {
		this.typicalAgeRange = typicalAgeRange;
	}

	/**
	 * @return the translators
	 */
	public List<Entity> getTranslators() {
		return translators;
	}

	/**
	 * @param translators the translators to set
	 */
	public void setTranslators(List<Entity> translators) {
		this.translators = translators;
	}
	
	
	public double aggregateRating() {
		return ratingAverage().orElse(0.0);
	}
	
	private Optional<Double> ratingAverage() {
		if(this.ratings.size() == 0) {
			return Optional.empty();
		}
		
		int sum = 0;
		for(Rating rating : this.ratings) {
			sum += rating.getRatingValue();
		}

		return Optional.of((double)sum / this.ratings.size());
	}
		
	/**
	 * 
	 * The duration of an item (movie, audio recording, event, etc.) in ISO 8601 date format.
	 */
	public Duration duration() {
		
		Duration d = Duration.between(this.startDate, this.endDate);
		return d.abs();
	}
}
