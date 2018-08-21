/**
 * A review of an item - for example, of a restaurant, movie, or store.
 */
package be.digitcom.schema;

/**
 * @author Rufin Hounkpe
 *
 */
public class Review {
	/**
	 * The item that is being reviewed/rated.
	 */
	private Thing itemReviewed;
	
	/**
	 * The actual body of the review.
	 */
	private String reviewBody;
	
	/**
	 * The rating given in this review. Note that reviews can themselves be rated. 
	 * The reviewRating applies to rating given by the review. 
	 * The aggregateRating property applies to the review itself, as a creative work.
	 */
	private Rating reviewRating;
	
	public Review() {}

	/**
	 * @return the itemReviewed
	 */
	public Thing getItemReviewed() {
		return itemReviewed;
	}

	/**
	 * @param itemReviewed the itemReviewed to set
	 */
	public void setItemReviewed(Thing itemReviewed) {
		this.itemReviewed = itemReviewed;
	}

	/**
	 * @return the reviewBody
	 */
	public String getReviewBody() {
		return reviewBody;
	}

	/**
	 * @param reviewBody the reviewBody to set
	 */
	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}

	/**
	 * @return the reviewRating
	 */
	public Rating getReviewRating() {
		return reviewRating;
	}

	/**
	 * @param reviewRating the reviewRating to set
	 */
	public void setReviewRating(Rating reviewRating) {
		this.reviewRating = reviewRating;
	}
	
	
}
