/**
 * 
 */
package be.digitcom.schema.event;

import java.time.Duration;

/**
 * @author Rufin M�togb� Hounkpe
 *
 */
public interface Temporalisable {
	/**
	 * 
	 * The duration of an item (movie, audio recording, event, etc.) in ISO 8601 date format.
	 */
	abstract public Duration duration();
}
