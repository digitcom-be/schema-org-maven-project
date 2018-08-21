/*
 * OpeningHoursSpecification
 * Canonical URL: http://schema.org/OpeningHoursSpecification
 * Thing > Intangible > StructuredValue > OpeningHoursSpecification
 * A structured value providing information about the opening hours of a place or a certain service inside a place.
 * The place is open if the opens property is specified, and closed otherwise.
 * If the value for the closes property is less than the value for the opens property then the hour range is assumed to span over the next day.
 */
package be.digitcom.schema;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class OpeningHoursSpecification {
	/*
	 * The closing hour of the place or service on the given day(s) of the week.
	 */
	private LocalTime closes;
	
	/*
	 * The day of the week for which these opening hours are valid.
	 */
	private DayOfWeek dayOfWeek;
	
	/*
	 * The opening hour of the place or service on the given day(s) of the week.
	 */
	private LocalTime opens;
	
	/*
	 * The date when the item becomes valid.
	 */
	private LocalDateTime validFrom;
	
	/*
	 * The date after when the item is not valid. 
	 * For example the end of an offer, salary period, or a period of opening hours.
	 */
	private LocalDateTime validThrough;
	
	
	// Constructor
	
	public OpeningHoursSpecification() {}


	/**
	 * @return the closes
	 */
	public LocalTime getCloses() {
		return closes;
	}


	/**
	 * @param closes the closes to set
	 */
	public void setCloses(LocalTime closes) {
		this.closes = closes;
	}


	/**
	 * @return the dayOfWeek
	 */
	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}


	/**
	 * @param dayOfWeek the dayOfWeek to set
	 */
	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}


	/**
	 * @return the opens
	 */
	public LocalTime getOpens() {
		return opens;
	}


	/**
	 * @param opens the opens to set
	 */
	public void setOpens(LocalTime opens) {
		this.opens = opens;
	}


	/**
	 * @return the validFrom
	 */
	public LocalDateTime getValidFrom() {
		return validFrom;
	}


	/**
	 * @param validFrom the validFrom to set
	 */
	public void setValidFrom(LocalDateTime validFrom) {
		this.validFrom = validFrom;
	}


	/**
	 * @return the validThrough
	 */
	public LocalDateTime getValidThrough() {
		return validThrough;
	}


	/**
	 * @param validThrough the validThrough to set
	 */
	public void setValidThrough(LocalDateTime validThrough) {
		this.validThrough = validThrough;
	}
	
	
	
}
