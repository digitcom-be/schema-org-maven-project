package be.digitcom.schema;

public class PostalAddress extends ContactPoint {
	/*
	 * The country. For example, USA. You can also provide the two-letter ISO 3166-1 alpha-2 country code.
	 */
	private String addressCountry;
	
	/*
	 * The locality. For example, Mountain View.
	 */
	private String addressLocality;
	
	/*
	 * The region. For example, CA.
	 */
	private String addressRegion;
	
	/*
	 * The post office box number for PO box addresses.
	 */
	private String postOfficeBoxNumber;
	
	/*
	 * The postal code. For example, 94043.
	 */
	private String postalCode;
	
	/*
	 * The street address. For example, 1600 Amphitheatre Pkwy.
	 */
	private String streetAddress;
	
	
	
	
	
	public PostalAddress() {}
	
	
	

	/**
	 * @return the addressCountry
	 */
	public String getAddressCountry() {
		return addressCountry;
	}

	/**
	 * @param addressCountry the addressCountry to set
	 */
	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}

	/**
	 * @return the addressLocality
	 */
	public String getAddressLocality() {
		return addressLocality;
	}

	/**
	 * @param addressLocality the addressLocality to set
	 */
	public void setAddressLocality(String addressLocality) {
		this.addressLocality = addressLocality;
	}

	/**
	 * @return the addressRegion
	 */
	public String getAddressRegion() {
		return addressRegion;
	}

	/**
	 * @param addressRegion the addressRegion to set
	 */
	public void setAddressRegion(String addressRegion) {
		this.addressRegion = addressRegion;
	}

	/**
	 * @return the postOfficeBoxNumber
	 */
	public String getPostOfficeBoxNumber() {
		return postOfficeBoxNumber;
	}

	/**
	 * @param postOfficeBoxNumber the postOfficeBoxNumber to set
	 */
	public void setPostOfficeBoxNumber(String postOfficeBoxNumber) {
		this.postOfficeBoxNumber = postOfficeBoxNumber;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	
}
