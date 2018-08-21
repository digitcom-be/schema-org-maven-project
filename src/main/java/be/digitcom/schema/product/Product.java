/**
 * @url http://schema.org/Product
 * 
 * Any offered product or service. For example: a pair of shoes; 
 * a concert ticket; the rental of a car; a haircut; 
 * or an episode of a TV show streamed online.
 */
package be.digitcom.schema.product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import be.digitcom.schema.Brand;
import be.digitcom.schema.Organization;
import be.digitcom.schema.PropertyValue;
import be.digitcom.schema.Review;
import be.digitcom.schema.Thing;
import be.digitcom.schema.audience.Audience;
import be.digitcom.schema.service.Offer;
import be.digitcom.schema.service.OfferItemCondition;

/**
 * @author Rufin M�togb� Hounkpe
 *
 */
public class Product extends Thing {
	
	/*
	 * A property-value pair representing an additional characteristics of the entitity, 
	 * e.g. a product feature or another characteristic for which there is no matching property in schema.org.
	 * Note: Publishers should be aware that applications designed to use specific schema.org properties 
	 * (e.g. @url http://schema.org/width, @url http://schema.org/color, @url http://schema.org/gtin13, ...) 
	 * will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
	 */
	private PropertyValue  additionalProperty;
	
	
	/*
	 * An intended audience, i.e. a group for whom something was created. Supersedes serviceAudience.
	 */
	private Audience audience;
	
	
	/*
	 * An award won by or for this item. Supersedes awards.
	 */
	private List<String> awards = new ArrayList<>();
	
	/*
	 * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
	 */
	private Brand brand;
	
	
	/*
	 * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
	 */
	private List<String> category;
	
	/*
	 * The color of the product.
	 */
	private String color;
	
	/*
	 * The depth of the item.
	 */
	private double depth;
	
	
	/*
	 * The GTIN-12 code of the product, or the product to which the offer refers. 
	 * The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, 
	 * and Check Digit used to identify trade items. See GS1 GTIN Summary for more details.
	 */
	private String gtin12;
	
	
	/*
	 * The GTIN-13 code of the product, or the product to which the offer refers. 
	 * This is equivalent to 13-digit ISBN codes and EAN UCC-13. 
	 * Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. 
	 * See GS1 GTIN Summary for more details.
	 */
	private String gtin13;
	
	/*
	 * The GTIN-14 code of the product, or the product to which the offer refers. See GS1 GTIN Summary for more details.
	 */
	private String gtin14;
	
	
	/*
	 * The GTIN-8 code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN.
	 * See GS1 GTIN Summary for more details.
	 */
	private String gtin8;
	
	
	/*
	 * The height of the item.
	 */
	private double height;
	
	
	/*
	 * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
	 */
	private Product isAccessoryOrSparePartFor;
	
	
	/*
	 * A pointer to another product (or multiple products) for which this product is a consumable.
	 */
	private Product isConsumableFor;
	
	
	/*
	 * A pointer to another, somehow related product (or multiple products).
	 */
	private List<Product> isRelatedTo = new ArrayList<>();
	
	
	/*
	 * A pointer to another, functionally similar product (or multiple products).
	 */
	private List<Product> isSimilarTo = new ArrayList<>();
	
	
	/*
	 * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, 
	 * or the products or services included in the offer.
	 */
	private OfferItemCondition itemCondition;
	
	/*
	 * An associated logo.
	 */
	private String logo;
	
	
	/*
	 * The manufacturer of the product.
	 */
	private Organization manufacturer;
	
	
	/*
	 * A material that something is made from, e.g. leather, wool, cotton, paper.
	 */
	private List<String> material;
	
	/*
	 * ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. 
	 * It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
	 */
	private String model;
	
	/*
	 * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
	 */
	private String mpn;
	
	
	/*
	 * An offer to provide this item�for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.
	 */
	private List<Offer> offers = new ArrayList<>();
	
	
	/*
	 * The product identifier, such as ISBN. For example: meta itemprop="productID" content="isbn:123-456-789".
	 */
	private String productID;
	
	
	/*
	 * The date of production of the item, e.g. vehicle.
	 */
	private LocalDate productionDate;
	
	
	/*
	 * The date the item e.g. vehicle was purchased by the current owner.
	 */
	private LocalDate purchaseDate;
	
	
	/*
	 * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
	 */
	private LocalDate releaseDate;
	
	
	/*
	 * A review of the item. Supersedes reviews.
	 */
	private List<Review> reviews = new ArrayList<>(); 
	
	
	/*
	 * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
	 */
	private String sku;
	
	
	/*
	 * The weight of the product or person.
	 */
	private double weight;
	
	
	/*
	 * The width of the item.
	 */
	private double width;


	/**
	 * @return the additionalProperty
	 */
	public PropertyValue getAdditionalProperty() {
		return additionalProperty;
	}


	/**
	 * @param additionalProperty the additionalProperty to set
	 */
	public void setAdditionalProperty(PropertyValue additionalProperty) {
		this.additionalProperty = additionalProperty;
	}


	/**
	 * @return the audience
	 */
	public Audience getAudience() {
		return audience;
	}


	/**
	 * @param audience the audience to set
	 */
	public void setAudience(Audience audience) {
		this.audience = audience;
	}


	/**
	 * @return the awards
	 */
	public List<String> getAwards() {
		return awards;
	}


	/**
	 * @param awards the awards to set
	 */
	public void setAwards(List<String> awards) {
		this.awards = awards;
	}


	/**
	 * @return the brand
	 */
	public Brand getBrand() {
		return brand;
	}


	/**
	 * @param brand the brand to set
	 */
	public void setBrand(Brand brand) {
		this.brand = brand;
	}


	/**
	 * @return the category
	 */
	public List<String> getCategory() {
		return category;
	}


	/**
	 * @param category the category to set
	 */
	public void setCategory(List<String> category) {
		this.category = category;
	}


	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}


	/**
	 * @return the depth
	 */
	public double getDepth() {
		return depth;
	}


	/**
	 * @param depth the depth to set
	 */
	public void setDepth(double depth) {
		this.depth = depth;
	}


	/**
	 * @return the gtin12
	 */
	public String getGtin12() {
		return gtin12;
	}


	/**
	 * @param gtin12 the gtin12 to set
	 */
	public void setGtin12(String gtin12) {
		this.gtin12 = gtin12;
	}


	/**
	 * @return the gtin13
	 */
	public String getGtin13() {
		return gtin13;
	}


	/**
	 * @param gtin13 the gtin13 to set
	 */
	public void setGtin13(String gtin13) {
		this.gtin13 = gtin13;
	}


	/**
	 * @return the gtin14
	 */
	public String getGtin14() {
		return gtin14;
	}


	/**
	 * @param gtin14 the gtin14 to set
	 */
	public void setGtin14(String gtin14) {
		this.gtin14 = gtin14;
	}


	/**
	 * @return the gtin8
	 */
	public String getGtin8() {
		return gtin8;
	}


	/**
	 * @param gtin8 the gtin8 to set
	 */
	public void setGtin8(String gtin8) {
		this.gtin8 = gtin8;
	}


	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}


	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}


	/**
	 * @return the isAccessoryOrSparePartFor
	 */
	public Product getIsAccessoryOrSparePartFor() {
		return isAccessoryOrSparePartFor;
	}


	/**
	 * @param isAccessoryOrSparePartFor the isAccessoryOrSparePartFor to set
	 */
	public void setIsAccessoryOrSparePartFor(Product isAccessoryOrSparePartFor) {
		this.isAccessoryOrSparePartFor = isAccessoryOrSparePartFor;
	}


	/**
	 * @return the isConsumableFor
	 */
	public Product getIsConsumableFor() {
		return isConsumableFor;
	}


	/**
	 * @param isConsumableFor the isConsumableFor to set
	 */
	public void setIsConsumableFor(Product isConsumableFor) {
		this.isConsumableFor = isConsumableFor;
	}


	/**
	 * @return the isRelatedTo
	 */
	public List<Product> getIsRelatedTo() {
		return isRelatedTo;
	}


	/**
	 * @param isRelatedTo the isRelatedTo to set
	 */
	public void setIsRelatedTo(List<Product> isRelatedTo) {
		this.isRelatedTo = isRelatedTo;
	}


	/**
	 * @return the isSimilarTo
	 */
	public List<Product> getIsSimilarTo() {
		return isSimilarTo;
	}


	/**
	 * @param isSimilarTo the isSimilarTo to set
	 */
	public void setIsSimilarTo(List<Product> isSimilarTo) {
		this.isSimilarTo = isSimilarTo;
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
	 * @return the logo
	 */
	public String getLogo() {
		return logo;
	}


	/**
	 * @param logo the logo to set
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}


	/**
	 * @return the manufacturer
	 */
	public Organization getManufacturer() {
		return manufacturer;
	}


	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(Organization manufacturer) {
		this.manufacturer = manufacturer;
	}


	/**
	 * @return the material
	 */
	public List<String> getMaterial() {
		return material;
	}


	/**
	 * @param material the material to set
	 */
	public void setMaterial(List<String> material) {
		this.material = material;
	}


	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}


	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}


	/**
	 * @return the mpn
	 */
	public String getMpn() {
		return mpn;
	}


	/**
	 * @param mpn the mpn to set
	 */
	public void setMpn(String mpn) {
		this.mpn = mpn;
	}


	/**
	 * @return the offers
	 */
	public List<Offer> getOffers() {
		return offers;
	}


	/**
	 * @param offers the offers to set
	 */
	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}


	/**
	 * @return the productID
	 */
	public String getProductID() {
		return productID;
	}


	/**
	 * @param productID the productID to set
	 */
	public void setProductID(String productID) {
		this.productID = productID;
	}


	/**
	 * @return the productionDate
	 */
	public LocalDate getProductionDate() {
		return productionDate;
	}


	/**
	 * @param productionDate the productionDate to set
	 */
	public void setProductionDate(LocalDate productionDate) {
		this.productionDate = productionDate;
	}


	/**
	 * @return the purchaseDate
	 */
	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}


	/**
	 * @param purchaseDate the purchaseDate to set
	 */
	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}


	/**
	 * @return the releaseDate
	 */
	public LocalDate getReleaseDate() {
		return releaseDate;
	}


	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
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
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}


	/**
	 * @param sku the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}


	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}


	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}


	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}


	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	
}
