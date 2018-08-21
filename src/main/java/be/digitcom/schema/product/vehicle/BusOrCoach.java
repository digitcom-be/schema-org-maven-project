/**
 * @url http://schema.org/BusOrCoach
 */
package be.digitcom.schema.product.vehicle;

import be.digitcom.schema.service.QuantitativeValue;

/**
 * @author Administrator
 *
 */
public class BusOrCoach extends Vehicle {
	/*
	 * The ACRISS Car Classification Code is a code used by many car rental companies, for classifying vehicles. 
	 * ACRISS stands for Association of Car Rental Industry Systems and Standards.
	 */
	private String acrissCode;
	
	/*
	 * The permitted total weight of cargo and installations (e.g. a roof rack) on top of the vehicle.
	 * 
	 * Typical unit code(s): KGM for kilogram, LBR for pound
	 * Note 1: You can indicate additional information in the name of the QuantitativeValue node.
	 * Note 2: You may also link to a QualitativeValue node that provides additional information using valueReference
	 * Note 3: Note that you can use minValue and maxValue to indicate ranges.
	 */
	private QuantitativeValue roofLoad;

	/**
	 * @return the acrissCode
	 */
	public String getAcrissCode() {
		return acrissCode;
	}

	/**
	 * @param acrissCode the acrissCode to set
	 */
	public void setAcrissCode(String acrissCode) {
		this.acrissCode = acrissCode;
	}

	/**
	 * @return the roofLoad
	 */
	public QuantitativeValue getRoofLoad() {
		return roofLoad;
	}

	/**
	 * @param roofLoad the roofLoad to set
	 */
	public void setRoofLoad(QuantitativeValue roofLoad) {
		this.roofLoad = roofLoad;
	}
	
	
}
