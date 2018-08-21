/**
 * An eventStatus of an event represents its status; 
 * particularly useful when an event is cancelled or rescheduled.
 */
package be.digitcom.schema.event;

/**
 * @author Rufin Hounkpe
 *
 */
public enum EventStatusType {
	EventCancelled,
	EventPostponed,
	EventRescheduled,
	EventScheduled;
}
