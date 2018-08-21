package be.digitcom.schema;

import java.util.ArrayList;
import java.util.List;

public class ContactPoint extends StructuredValue {
	/*
	 * The geographic area where a service or offered item is provided. Supersedes serviceArea.
	 */
	private AdministrativeArea areaServed;
	
	
	/*
	 * A language someone may use with or at the item, service or place. Please use one of the language codes from the IETF BCP 47 standard.
	 * See also inLanguage
	 */
	private List<String> availableLanguage = new ArrayList<>();
	
	
	/*
	 * A person or organization can have different contact points, for different purposes. 
	 * For example, a sales contact point, a PR contact point and so on. 
	 * This property is used to specify the kind of contact point.
	 */
	private String contactType;
	
	
	/*
	 * Email address.
	 */
	private String email;
	
	
	/*
	 * The fax number.
	 */
	private String faxNumber;
	
	
	/*
	 * The hours during which this service or contact is available.
	 */
	private OpeningHoursSpecification hoursAvailable;
	
	
	/*
	 * The telephone number.
	 */
	private String telephone;
	
	public ContactPoint() {}

	/**
	 * @return the areaServed
	 */
	public AdministrativeArea getAreaServed() {
		return areaServed;
	}

	/**
	 * @param areaServed the areaServed to set
	 */
	public void setAreaServed(AdministrativeArea areaServed) {
		this.areaServed = areaServed;
	}
	
	

	/**
	 * @return the availableLanguage
	 */
	public List<String> getAvailableLanguage() {
		return availableLanguage;
	}

	/**
	 * @param availableLanguage the availableLanguage to set
	 */
	public void setAvailableLanguage(List<String> availableLanguage) {
		this.availableLanguage = availableLanguage;
	}

	/**
	 * @return the contactType
	 */
	public String getContactType() {
		return contactType;
	}

	/**
	 * @param contactType the contactType to set
	 */
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the hoursAvailable
	 */
	public OpeningHoursSpecification getHoursAvailable() {
		return hoursAvailable;
	}

	/**
	 * @param hoursAvailable the hoursAvailable to set
	 */
	public void setHoursAvailable(OpeningHoursSpecification hoursAvailable) {
		this.hoursAvailable = hoursAvailable;
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
