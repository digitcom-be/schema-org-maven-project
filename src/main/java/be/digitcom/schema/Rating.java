/**
 * A rating is an evaluation on a numeric scale, such as 1 to 5 stars.
 */
package be.digitcom.schema;

/**
 * @author student
 *
 */
public class Rating extends Intangible {
	/**
	 * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. 
	 * That is equivalent to this and may be used interchangeably.
	 */
	private Person author;
	
	/**
	 * The highest value allowed in this rating system. 
	 * If bestRating is omitted, 5 is assumed.
	 */
	private static int bestRating = 5;
	
	/**
	 * The rating for the content.
	 */
	private int ratingValue;
	
	/**
	 * The lowest value allowed in this rating system. 
	 * If worstRating is omitted, 1 is assumed.
	 */
	private static int worstRating = 1;
	
	
	// Constructors
	public Rating() {}
	
	public Rating(Person author, int ratingValue) {
		this.setAuthor(author);
		this.setRatingValue(ratingValue);
	}
	
	

	/**
	 * @return the author
	 */
	public Person getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(Person author) {
		this.author = author;
	}

	/**
	 * @return the bestRating
	 */
	public int getBestRating() {
		return bestRating;
	}



	/**
	 * @return the ratingValue
	 */
	public int getRatingValue() {
		return ratingValue;
	}

	/**
	 * @param ratingValue the ratingValue to set
	 */
	public void setRatingValue(int ratingValue) {
		this.ratingValue = ratingValue;
	}

	/**
	 * @return the worstRating
	 */
	public int getWorstRating() {
		return worstRating;
	}


}
