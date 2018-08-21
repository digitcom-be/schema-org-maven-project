/**
 * @ http://schema.org/IndividualProduct
 * 
 * A single, identifiable product instance (e.g. a laptop with a particular serial number).
 */
package be.digitcom.schema.product;

/**
 * @author Rufin M�togb� Hounkpe
 *
 */
public class IndividualProduct extends Product {
	/*
	 * The serial number or any alphanumeric identifier of a particular product. When attached to an offer, 
	 * it is a shortcut for the serial number of the product included in the offer.
	 */
	private String serialNumber;

	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	
}
