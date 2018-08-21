/*
 * WarrantyScope
 * Canonical URL: http://schema.org/WarrantyScope
 * Thing > Intangible > Enumeration > WarrantyScope
 * A range of of services that will be provided to a customer free of charge in case of a defect or malfunction of a product.
 * Commonly used values:
 * http://purl.org/goodrelations/v1#Labor-BringIn
 * http://purl.org/goodrelations/v1#PartsAndLabor-BringIn
 * http://purl.org/goodrelations/v1#PartsAndLabor-PickUp
 */

package be.digitcom.schema.service;

public enum WarrantyScope {
	Labor_BringIn,
	PartsAndLabor_BringIn,
	PartsAndLabor_PickUp;
}
