/**
 * @url http://schema.org/PropertyValue
 * 
 * A property-value pair, e.g. representing a feature of a product or place. Use the 'name' property for the name of the property. 
 * If there is an additional human-readable version of the value, put that into the 'description' property.
 * 
 * Always use specific schema.org properties when a) they exist and b) you can populate them. 
 * Using PropertyValue as a substitute will typically not trigger the same effect as using the original, specific property.
 */
package be.digitcom.schema;

/**
 * @author Rufin M�togb� Hounkpe
 *
 */
public class PropertyValue {
	/*
	 * The upper value of some characteristic or property.
	 */
	private int maxValue;
	
	
	/*
	 * A technique or technology used in a Dataset (or DataDownload, DataCatalog), 
	 * corresponding to the method used for measuring the corresponding variable(s) (described using variableMeasured). 
	 * This is oriented towards scientific and scholarly dataset publication but may have broader applicability; 
	 * it is not intended as a full representation of measurement, but rather as a high level summary for dataset discovery.
	 * 
	 * For example, if variableMeasured is: molecule concentration, measurementTechnique could be: 
	 * "mass spectrometry" or "nmr spectroscopy" or "colorimetry" or "immunofluorescence".
	 * 
	 * If the variableMeasured is "depression rating", the measurementTechnique could be "Zung Scale" or "HAM-D" or "Beck Depression Inventory".
	 * 
	 * If there are several variableMeasured properties recorded for some given data object, 
	 * use a PropertyValue for each variableMeasured and attach the corresponding measurementTechnique.
	 */
	private String measurementTechnique;
	
	/*
	 * The lower value of some characteristic or property.
	 */
	private int minValue;
	
	/*
	 * A commonly used identifier for the characteristic represented by the property, e.g. a manufacturer or a standard code for a property. 
	 * propertyID can be (1) a prefixed string, mainly meant to be used with standards for product properties; 
	 * (2) a site-specific, non-prefixed string (e.g. the primary key of the property or the vendor-specific id of the property), 
	 * or (3) a URL indicating the type of the property, either pointing to an external vocabulary, 
	 * or a Web resource that describes the property (e.g. a glossary entry). 
	 * Standards bodies should promote a standard prefix for the identifiers of properties from their standards.
	 */
	private String propertyID;
	
	/*
	 * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. 
	 * Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
	 */
	private String unitCode;
	
	/*
	 * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for unitCode.
	 */
	private String unitText;
	
	
	/*
	 * The value of the quantitative value or property value node.
	 * For QuantitativeValue and MonetaryAmount, the recommended type for values is 'Number'.
	 * For PropertyValue, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.
	 */
	private String value;
	
	/*
	 * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
	 */
	private PropertyValue valueReference;

	/**
	 * @return the maxValue
	 */
	public int getMaxValue() {
		return maxValue;
	}

	/**
	 * @param maxValue the maxValue to set
	 */
	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	/**
	 * @return the measurementTechnique
	 */
	public String getMeasurementTechnique() {
		return measurementTechnique;
	}

	/**
	 * @param measurementTechnique the measurementTechnique to set
	 */
	public void setMeasurementTechnique(String measurementTechnique) {
		this.measurementTechnique = measurementTechnique;
	}

	/**
	 * @return the minValue
	 */
	public int getMinValue() {
		return minValue;
	}

	/**
	 * @param minValue the minValue to set
	 */
	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	/**
	 * @return the propertyID
	 */
	public String getPropertyID() {
		return propertyID;
	}

	/**
	 * @param propertyID the propertyID to set
	 */
	public void setPropertyID(String propertyID) {
		this.propertyID = propertyID;
	}

	/**
	 * @return the unitCode
	 */
	public String getUnitCode() {
		return unitCode;
	}

	/**
	 * @param unitCode the unitCode to set
	 */
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	/**
	 * @return the unitText
	 */
	public String getUnitText() {
		return unitText;
	}

	/**
	 * @param unitText the unitText to set
	 */
	public void setUnitText(String unitText) {
		this.unitText = unitText;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the valueReference
	 */
	public PropertyValue getValueReference() {
		return valueReference;
	}

	/**
	 * @param valueReference the valueReference to set
	 */
	public void setValueReference(PropertyValue valueReference) {
		this.valueReference = valueReference;
	}
	
	
}
