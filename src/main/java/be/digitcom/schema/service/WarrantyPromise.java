/*
 * WarrantyPromise
 * Canonical URL: http://schema.org/WarrantyPromise
 * Thing > Intangible > StructuredValue > WarrantyPromise
 * A structured value representing the duration and scope of services that will be provided to a customer free 
 * of charge in case of a defect or malfunction of a product.
 */

package be.digitcom.schema.service;

import be.digitcom.schema.StructuredValue;

public class WarrantyPromise extends StructuredValue {
	/*
	 * The duration of the warranty promise. 
	 * Common unitCode values are ANN for year, MON for months, or DAY for days.
	 */
	private QuantitativeValue durationOfWarranty;
	
	/*
	 * The scope of the warranty promise.
	 */
	private WarrantyScope warrantyScope;

	public QuantitativeValue getDurationOfWarranty() {
		return durationOfWarranty;
	}

	public void setDurationOfWarranty(QuantitativeValue durationOfWarranty) {
		this.durationOfWarranty = durationOfWarranty;
	}

	public WarrantyScope getWarrantyScope() {
		return warrantyScope;
	}

	public void setWarrantyScope(WarrantyScope warrantyScope) {
		this.warrantyScope = warrantyScope;
	}
	
	
}
