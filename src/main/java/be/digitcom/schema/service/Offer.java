/**
 * Offer
 * Canonical URL: http://schema.org/Offer
 * Offer
 * An offer to transfer some rights to an item or to provide a service � for example, 
 * an offer to sell tickets to an event, to rent the DVD of a movie, to stream a TV show over the internet, 
 * to repair a motorcycle, or to loan a book.
 * 
 * For GTIN-related fields, see Check Digit calculator and validation guide from GS1.
 */
package be.digitcom.schema.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import be.digitcom.schema.AdministrativeArea;
import be.digitcom.schema.Entity;
import be.digitcom.schema.Intangible;
import be.digitcom.schema.Place;
import be.digitcom.schema.Rating;
import be.digitcom.schema.Review;

/**
 * @author Rufin Hounkpe
 *
 */
public class Offer extends Intangible {
	/*
	 * The payment method(s) accepted by seller for this offer.
	 */
	private List<PaymentMethod> acceptedPaymentMethod = new ArrayList<>();
	
	/*
	 * An additional offer that can only be obtained in combination with the first base offer 
	 * (e.g. supplements and extensions that are available for a surcharge).
	 */
	private List<Offer> addOn = new ArrayList<>();
	
	/*
	 * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
	 */
	private QuantitativeValue advanceBookingRequirement;
	
	/*
	 * The overall rating, based on a collection of reviews or ratings, of the item.
	 */
	private List<Rating> aggregateRating = new ArrayList<>();
	
	/*
	 * The geographic area where a service or offered item is provided. Supersedes serviceArea.
	 */
	private List<AdministrativeArea> areaServed = new ArrayList<>();
	
	/*
	 * The availability of this item�for example In stock, Out of stock, Pre-order, etc.
	 */
	private ItemAvailability availability = ItemAvailability.IN_STOCK;
	
	/*
	 * 	The end of the availability of the product or service included in the offer.
	 */
	private LocalDateTime availabilityEnds;
	
	
	/*
	 * The beginning of the availability of the product or service included in the offer.
	 */
	private LocalDateTime availabilityStarts;
	
	/*
	 * The place(s) from which the offer can be obtained (e.g. store locations).
	 */
	private Place availableAtOrFrom;
	
	/*
	 * The delivery method(s) available for this offer.
	 */
	private DeliveryMethod availableDeliveryMethod;
	
	/*
	 * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle 
	 * (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
	 */
	private BusinessFunction  businessFunction;
	
	/*
	 * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
	 */
	private List<PhysicalActivityCategory> category = new ArrayList<>();
	
	/*
	 * The typical delay between the receipt of the order and the goods either leaving the warehouse 
	 * or being prepared for pickup, in case the delivery method is on site pickup.
	 */
	private QuantitativeValue  deliveryLeadTime;
	
	/*
	 * The type(s) of customers for which the given offer is valid.
	 */
	private List<BusinessEntityType> eligibleCustomerType = new ArrayList<>();
	
	/*
	 * The duration for which the given offer is valid.
	 */
	private QuantitativeValue eligibleDuration;
	
	/*
	 * The interval and unit of measurement of ordering quantities for which the offer 
	 * or price specification is valid. This allows e.g. specifying that a certain freight 
	 * charge is valid only for a certain quantity.
	 */
	private QuantitativeValue eligibleQuantity;
	
	/*
	 * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, 
	 * or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
	 * See also ineligibleRegion.
	 */
	private List<String> eligibleRegion = new ArrayList<>();
	
	/*
	 * The transaction volume, in a monetary unit, for which the offer or price specification is valid,
	 * e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume,
	 *  or to limit the acceptance of credit cards to purchases to a certain minimal amount.
	 */
	private PriceSpecification eligibleTransactionVolume;
	
	/*
	 * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, 
	 * or the GeoShape for the geo-political region(s) for which the offer 
	 * or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
	 * See also eligibleRegion.
	 */
	private List<String> ineligibleRegions = new ArrayList<>();
	
	/*
	 * The current approximate inventory level for the item or items.
	 */
	private QuantitativeValue inventoryLevel;
	
	/*
	 * A predefined value from OfferItemCondition or a textual description of the condition of the product 
	 * or service, or the products or services included in the offer.
	 */
	private OfferItemCondition itemCondition;
	
	/*
	 * A pointer to the organization or person making the offer.
	 * Inverse property: makesOffer.
	 */
	private Entity offeredBy;
	
	/*
	 * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
	 * Usage guidelines:
	 * Use the priceCurrency property (with ISO 4217 codes e.g. "USD") instead of including ambiguous symbols such as '$' in the value.
	 * Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
	 * Note that both RDFa and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values alongside more human-friendly formatting.
	 * Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
	 */
	private int price;
	
	private PriceCurrency priceCurrency = PriceCurrency.EURO;
	
	/*
	 * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
	 */
	private PriceSpecification  priceSpecification;
	
	/*
	 * The date after which the price is no longer available.
	 */
	private LocalDate priceValidUntil;
	
	/*
	 * A review of the item. Supersedes reviews.
	 */
	private List<Review> reviews = new ArrayList<>();
	
	/*
	 * An entity which offers (sells / leases / lends / loans) the services / goods. 
	 * A seller may also be a provider. Supersedes merchant, vendor.
	 */
	private Entity seller;
	
	/*
	 * The serial number or any alphanumeric identifier of a particular product. 
	 * When attached to an offer, it is a shortcut for the serial number of the product included in the offer.
	 */
	private String serialNumber;
	
	/*
	 * 	The date when the item becomes valid.
	 */
	private LocalDate validFrom;
	
	/*
	 * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
	 */
	private LocalDate validThrough;
	
	/*
	 * The warranty promise(s) included in the offer. Supersedes warrantyPromise.
	 */
	private WarrantyPromise warranty;
	
	// Constructor
	
	public Offer() {}

	/**
	 * @return the acceptedPaymentMethod
	 */
	public List<PaymentMethod> getAcceptedPaymentMethod() {
		return acceptedPaymentMethod;
	}

	/**
	 * @param acceptedPaymentMethod the acceptedPaymentMethod to set
	 */
	public void setAcceptedPaymentMethod(List<PaymentMethod> acceptedPaymentMethod) {
		this.acceptedPaymentMethod = acceptedPaymentMethod;
	}

	/**
	 * @return the addOn
	 */
	public List<Offer> getAddOn() {
		return addOn;
	}

	/**
	 * @param addOn the addOn to set
	 */
	public void setAddOn(List<Offer> addOn) {
		this.addOn = addOn;
	}

	/**
	 * @return the advanceBookingRequirement
	 */
	public QuantitativeValue getAdvanceBookingRequirement() {
		return advanceBookingRequirement;
	}

	/**
	 * @param advanceBookingRequirement the advanceBookingRequirement to set
	 */
	public void setAdvanceBookingRequirement(QuantitativeValue advanceBookingRequirement) {
		this.advanceBookingRequirement = advanceBookingRequirement;
	}

	/**
	 * @return the aggregateRating
	 */
	public List<Rating> getAggregateRating() {
		return aggregateRating;
	}

	/**
	 * @param aggregateRating the aggregateRating to set
	 */
	public void setAggregateRating(List<Rating> aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	/**
	 * @return the areaServed
	 */
	public List<AdministrativeArea> getAreaServed() {
		return areaServed;
	}

	/**
	 * @param areaServed the areaServed to set
	 */
	public void setAreaServed(List<AdministrativeArea> areaServed) {
		this.areaServed = areaServed;
	}

	/**
	 * @return the availability
	 */
	public ItemAvailability getAvailability() {
		return availability;
	}

	/**
	 * @param availability the availability to set
	 */
	public void setAvailability(ItemAvailability availability) {
		this.availability = availability;
	}

	/**
	 * @return the availabilityEnds
	 */
	public LocalDateTime getAvailabilityEnds() {
		return availabilityEnds;
	}

	/**
	 * @param availabilityEnds the availabilityEnds to set
	 */
	public void setAvailabilityEnds(LocalDateTime availabilityEnds) {
		this.availabilityEnds = availabilityEnds;
	}

	/**
	 * @return the availabilityStarts
	 */
	public LocalDateTime getAvailabilityStarts() {
		return availabilityStarts;
	}

	/**
	 * @param availabilityStarts the availabilityStarts to set
	 */
	public void setAvailabilityStarts(LocalDateTime availabilityStarts) {
		this.availabilityStarts = availabilityStarts;
	}

	/**
	 * @return the availableAtOrFrom
	 */
	public Place getAvailableAtOrFrom() {
		return availableAtOrFrom;
	}

	/**
	 * @param availableAtOrFrom the availableAtOrFrom to set
	 */
	public void setAvailableAtOrFrom(Place availableAtOrFrom) {
		this.availableAtOrFrom = availableAtOrFrom;
	}

	/**
	 * @return the availableDeliveryMethod
	 */
	public DeliveryMethod getAvailableDeliveryMethod() {
		return availableDeliveryMethod;
	}

	/**
	 * @param availableDeliveryMethod the availableDeliveryMethod to set
	 */
	public void setAvailableDeliveryMethod(DeliveryMethod availableDeliveryMethod) {
		this.availableDeliveryMethod = availableDeliveryMethod;
	}

	/**
	 * @return the businessFunction
	 */
	public BusinessFunction getBusinessFunction() {
		return businessFunction;
	}

	/**
	 * @param businessFunction the businessFunction to set
	 */
	public void setBusinessFunction(BusinessFunction businessFunction) {
		this.businessFunction = businessFunction;
	}

	/**
	 * @return the category
	 */
	public List<PhysicalActivityCategory> getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(List<PhysicalActivityCategory> category) {
		this.category = category;
	}

	/**
	 * @return the deliveryLeadTime
	 */
	public QuantitativeValue getDeliveryLeadTime() {
		return deliveryLeadTime;
	}

	/**
	 * @param deliveryLeadTime the deliveryLeadTime to set
	 */
	public void setDeliveryLeadTime(QuantitativeValue deliveryLeadTime) {
		this.deliveryLeadTime = deliveryLeadTime;
	}

	/**
	 * @return the eligibleCustomerType
	 */
	public List<BusinessEntityType> getEligibleCustomerType() {
		return eligibleCustomerType;
	}

	/**
	 * @param eligibleCustomerType the eligibleCustomerType to set
	 */
	public void setEligibleCustomerType(List<BusinessEntityType> eligibleCustomerType) {
		this.eligibleCustomerType = eligibleCustomerType;
	}

	/**
	 * @return the eligibleDuration
	 */
	public QuantitativeValue getEligibleDuration() {
		return eligibleDuration;
	}

	/**
	 * @param eligibleDuration the eligibleDuration to set
	 */
	public void setEligibleDuration(QuantitativeValue eligibleDuration) {
		this.eligibleDuration = eligibleDuration;
	}

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
	 * @return the eligibleRegion
	 */
	public List<String> getEligibleRegion() {
		return eligibleRegion;
	}

	/**
	 * @param eligibleRegion the eligibleRegion to set
	 */
	public void setEligibleRegion(List<String> eligibleRegion) {
		this.eligibleRegion = eligibleRegion;
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
	 * @return the ineligibleRegions
	 */
	public List<String> getIneligibleRegions() {
		return ineligibleRegions;
	}

	/**
	 * @param ineligibleRegions the ineligibleRegions to set
	 */
	public void setIneligibleRegions(List<String> ineligibleRegions) {
		this.ineligibleRegions = ineligibleRegions;
	}

	/**
	 * @return the inventoryLevel
	 */
	public QuantitativeValue getInventoryLevel() {
		return inventoryLevel;
	}

	/**
	 * @param inventoryLevel the inventoryLevel to set
	 */
	public void setInventoryLevel(QuantitativeValue inventoryLevel) {
		this.inventoryLevel = inventoryLevel;
	}

	/**
	 * @return the itemCondition
	 */
	public OfferItemCondition getItemCondition() {
		return itemCondition;
	}

	/**
	 * @param itemCondition the itemCondition to set
	 */
	public void setItemCondition(OfferItemCondition itemCondition) {
		this.itemCondition = itemCondition;
	}

	/**
	 * @return the offeredBy
	 */
	public Entity getOfferedBy() {
		return offeredBy;
	}

	/**
	 * @param offeredBy the offeredBy to set
	 */
	public void setOfferedBy(Entity offeredBy) {
		this.offeredBy = offeredBy;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
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
	 * @return the priceSpecification
	 */
	public PriceSpecification getPriceSpecification() {
		return priceSpecification;
	}

	/**
	 * @param priceSpecification the priceSpecification to set
	 */
	public void setPriceSpecification(PriceSpecification priceSpecification) {
		this.priceSpecification = priceSpecification;
	}

	/**
	 * @return the priceValidUntil
	 */
	public LocalDate getPriceValidUntil() {
		return priceValidUntil;
	}

	/**
	 * @param priceValidUntil the priceValidUntil to set
	 */
	public void setPriceValidUntil(LocalDate priceValidUntil) {
		this.priceValidUntil = priceValidUntil;
	}

	/**
	 * @return the reviews
	 */
	public List<Review> getReviews() {
		return reviews;
	}

	/**
	 * @param reviews the reviews to set
	 */
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	/**
	 * @return the seller
	 */
	public Entity getSeller() {
		return seller;
	}

	/**
	 * @param seller the seller to set
	 */
	public void setSeller(Entity seller) {
		this.seller = seller;
	}

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

	/**
	 * @return the validFrom
	 */
	public LocalDate getValidFrom() {
		return validFrom;
	}

	/**
	 * @param validFrom the validFrom to set
	 */
	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}

	/**
	 * @return the validThrough
	 */
	public LocalDate getValidThrough() {
		return validThrough;
	}

	/**
	 * @param validThrough the validThrough to set
	 */
	public void setValidThrough(LocalDate validThrough) {
		this.validThrough = validThrough;
	}

	/**
	 * @return the warranty
	 */
	public WarrantyPromise getWarranty() {
		return warranty;
	}

	/**
	 * @param warranty the warranty to set
	 */
	public void setWarranty(WarrantyPromise warranty) {
		this.warranty = warranty;
	}
	
}
