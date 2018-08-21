/*
 * PriceSpecification
 * Canonical URL: http://schema.org/PriceSpecification
 * Thing > Intangible > StructuredValue > PriceSpecification
 * A structured value representing a price or price range. Typically, 
 * only the subclasses of this type are used for markup. 
 * It is recommended to use MonetaryAmount to describe independent amounts of money such as a salary, 
 * credit card limits, etc.
 */

package be.digitcom.schema.service;

import java.time.LocalDateTime;

public class PriceSpecification {
	/*
	 * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. 
	 * This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
	 */
	private QuantitativeValue  eligibleQuantity;
	
	/*
	 * The transaction volume, in a monetary unit, for which the offer or price specification is valid, 
	 * e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, 
	 * or to limit the acceptance of credit cards to purchases to a certain minimal amount.
	 */
	private PriceSpecification eligibleTransactionVolume;
	
	/*
	 * The highest price if the price is a range.
	 */
	private double maxPrice;
	
	/*
	 * The lowest price if the price is a range.
	 */
	private double minPrice;
	
	/*
	 * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
	 * Usage guidelines:
	 * Use the priceCurrency property (with ISO 4217 codes e.g. "USD") instead of including ambiguous symbols such as '$' in the value.
	 * Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
	 * Note that both RDFa and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values alongside more human-friendly formatting.
	 * Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
	 */
	private double price;
	
	/*
	 * The currency (in 3-letter ISO 4217 format) of the price or a price component, 
	 * when attached to PriceSpecification and its subtypes.
	 */
	private PriceCurrency priceCurrency = PriceCurrency.EURO;
	
	/*
	 * The date when the item becomes valid.
	 */
	private LocalDateTime validFrom;
	
	/*
	 * The date after when the item is not valid. 
	 * For example the end of an offer, salary period, or a period of opening hours.
	 */
	private LocalDateTime validThrough;
	
	
	/*
	 * Specifies whether the applicable value-added tax (VAT) is included in the price specification or not.
	 */
	private boolean valueAddedTaxIncluded;
	
	
	// Constructor
	public PriceSpecification() {}


	/**
	 * @return the eligibleQuantity
	 */
	public QuantitativeValue getEligibleQuantity() {
		return eligibleQuantity;
	}


	/**
	 * @param eligibleQuantity the eligibleQuantity to set
	 */
	public void setEligibleQuantity(QuantitativeValue eligibleQuantity) {
		this.eligibleQuantity = eligibleQuantity;
	}


	/**
	 * @return the eligibleTransactionVolume
	 */
	public PriceSpecification getEligibleTransactionVolume() {
		return eligibleTransactionVolume;
	}


	/**
	 * @param eligibleTransactionVolume the eligibleTransactionVolume to set
	 */
	public void setEligibleTransactionVolume(PriceSpecification eligibleTransactionVolume) {
		this.eligibleTransactionVolume = eligibleTransactionVolume;
	}


	/**
	 * @return the maxPrice
	 */
	public double getMaxPrice() {
		return maxPrice;
	}


	/**
	 * @param maxPrice the maxPrice to set
	 */
	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}


	/**
	 * @return the minPrice
	 */
	public double getMinPrice() {
		return minPrice;
	}


	/**
	 * @param minPrice the minPrice to set
	 */
	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	/**
	 * @return the priceCurrency
	 */
	public PriceCurrency getPriceCurrency() {
		return priceCurrency;
	}


	/**
	 * @param priceCurrency the priceCurrency to set
	 */
	public void setPriceCurrency(PriceCurrency priceCurrency) {
		this.priceCurrency = priceCurrency;
	}


	/**
	 * @return the validFrom
	 */
	public LocalDateTime getValidFrom() {
		return validFrom;
	}


	/**
	 * @param validFrom the validFrom to set
	 */
	public void setValidFrom(LocalDateTime validFrom) {
		this.validFrom = validFrom;
	}


	/**
	 * @return the validThrough
	 */
	public LocalDateTime getValidThrough() {
		return validThrough;
	}


	/**
	 * @param validThrough the validThrough to set
	 */
	public void setValidThrough(LocalDateTime validThrough) {
		this.validThrough = validThrough;
	}


	/**
	 * @return the valueAddedTaxIncluded
	 */
	public boolean isValueAddedTaxIncluded() {
		return valueAddedTaxIncluded;
	}


	/**
	 * @param valueAddedTaxIncluded the valueAddedTaxIncluded to set
	 */
	public void setValueAddedTaxIncluded(boolean valueAddedTaxIncluded) {
		this.valueAddedTaxIncluded = valueAddedTaxIncluded;
	}
	
	
}
