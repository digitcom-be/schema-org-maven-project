package be.digitcom.schema;

public abstract class Thing {
	/**
	 * The identifier property represents any kind of identifier for 
	 * any kind of Thing, such as ISBNs, GTIN codes, UUIDs etc.
	 * Schema.org provides dedicated properties for representing many of these, 
	 * either as textual strings or as URL (URI) links. 
	 * See background notes for more details.
	 */
	private Long identifier;
	
	/**
	 * The name of the item.
	 */
	private String name;
	
	/**
	 * 	An additional type for the item, typically used for adding 
	 * more specific types from external vocabularies in microdata syntax. 
	 * This is a relationship between something and a class that 
	 * the thing is in. In RDFa syntax, it is better to use 
	 * the native RDFa syntax - the 'typeof' attribute - for multiple types. 
	 * Schema.org tools may have only weaker understanding of extra types, 
	 * in particular those defined externally.
	 */
	private String additionalType;
	
	/**
	 * An alias for the item.
	 */
	private String alternateName;
	
	/**
	 * A description of the item.
	 */
	private String description;
	
	/**
	 * An image of the item. This can be a URL or a fully described ImageObject.
	 */
	private String image;
	
	/**
	 * URL of the item.
	 */
	private String url;
	
	/*
	 * A sub property of description. A short description of the item used to disambiguate from other, 
	 * similar items. Information from other properties (in particular, name) 
	 * may be necessary for the description to be useful for disambiguation.
	 */
	private String disambiguatingDescription;
	
	/*
	 * URL of a reference Web page that unambiguously indicates the item's identity. 
	 * E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
	 */
	private String sameAs;
	
	
	public Thing() {}
	
	

	/**
	 * @return the identifier
	 */
	public Long getIdentifier() {
		return identifier;
	}

	/**
	 * @param identifier the identifier to set
	 */
	public void setIdentifier(Long identifier) {
		this.identifier = identifier;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the additionalType
	 */
	public String getAdditionalType() {
		return additionalType;
	}

	/**
	 * @param additionalType the additionalType to set
	 */
	public void setAdditionalType(String additionalType) {
		this.additionalType = additionalType;
	}

	/**
	 * @return the alternateName
	 */
	public String getAlternateName() {
		return alternateName;
	}

	/**
	 * @param alternateName the alternateName to set
	 */
	public void setAlternateName(String alternateName) {
		this.alternateName = alternateName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the disambiguatingDescription
	 */
	public String getDisambiguatingDescription() {
		return disambiguatingDescription;
	}

	/**
	 * @param disambiguatingDescription the disambiguatingDescription to set
	 */
	public void setDisambiguatingDescription(String disambiguatingDescription) {
		this.disambiguatingDescription = disambiguatingDescription;
	}

	/**
	 * @return the sameAs
	 */
	public String getSameAs() {
		return sameAs;
	}

	/**
	 * @param sameAs the sameAs to set
	 */
	public void setSameAs(String sameAs) {
		this.sameAs = sameAs;
	}
	
	
}
