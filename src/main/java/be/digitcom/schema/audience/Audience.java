/*
 * @url http://schema.org/Audience
 * Intended audience for an item, i.e. the group for whom the item was created.
 */

package be.digitcom.schema.audience;

import be.digitcom.schema.AdministrativeArea;
import be.digitcom.schema.Intangible;

/*
 * @author Rufin M�togb� Hounkpe
 */

public class Audience extends Intangible {
	/*
	 * The target group associated with a given audience (e.g. veterans, car owners, musicians, etc.).
	 */
	private String audienceType;
	
	
	/*
	 * The geographic area associated with the audience.
	 */
	private AdministrativeArea geographicArea;


	/**
	 * @return the audienceType
	 */
	public String getAudienceType() {
		return audienceType;
	}


	/**
	 * @param audienceType the audienceType to set
	 */
	public void setAudienceType(String audienceType) {
		this.audienceType = audienceType;
	}


	/**
	 * @return the geographicArea
	 */
	public AdministrativeArea getGeographicArea() {
		return geographicArea;
	}


	/**
	 * @param geographicArea the geographicArea to set
	 */
	public void setGeographicArea(AdministrativeArea geographicArea) {
		this.geographicArea = geographicArea;
	}
	
	
}
