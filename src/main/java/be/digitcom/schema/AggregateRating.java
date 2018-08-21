package be.digitcom.schema;

/*
 * @author Rufin M�togb� Hounkpe
 * @url https://schema.org/AggregateRating
 * 
 * The average rating based on multiple ratings or reviews.
 */

public class AggregateRating extends Rating {
	/*
	 * The item that is being reviewed/rated.
	 */
	Thing itemReviewed;
	
	/*
	 * The count of total number of ratings.
	 */
	int ratingCount;
	
	/*
	 * The count of total number of reviews.
	 */
	int reviewCount;
	
	
	// Constructors
	
	public AggregateRating() {}
	
	public AggregateRating(Thing itemReviewed) {
		this.setItemReviewed(itemReviewed);
	}

	

	public Thing getItemReviewed() {
		return itemReviewed;
	}

	public void setItemReviewed(Thing itemReviewed) {
		this.itemReviewed = itemReviewed;
	}

	public int getRatingCount() {
		return ratingCount;
	}

	public void setRatingCount(int ratingCount) {
		this.ratingCount = ratingCount;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}
	
	
}
