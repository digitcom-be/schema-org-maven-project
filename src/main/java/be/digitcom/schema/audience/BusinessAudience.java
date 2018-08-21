/**
 * @url http://schema.org/BusinessAudience
 * A set of characteristics belonging to businesses, e.g. who compose an item's target audience.
 */
package be.digitcom.schema.audience;

import java.math.BigDecimal;

/**
 * @author Rufin M�togb� Hounkpe
 *
 */
public class BusinessAudience extends Audience {
	/*
	 * The number of employees in an organization e.g. business.
	 */
	private int numberOfEmployees;
	
	/*
	 * The size of the business in annual revenue.
	 */
	private BigDecimal yearlyRevenue;
	
	/*
	 * The age of the business.
	 */
	private int yearsInOperation;

	/**
	 * @return the numberOfEmployees
	 */
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	/**
	 * @param numberOfEmployees the numberOfEmployees to set
	 */
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	/**
	 * @return the yearlyRevenue
	 */
	public BigDecimal getYearlyRevenue() {
		return yearlyRevenue;
	}

	/**
	 * @param yearlyRevenue the yearlyRevenue to set
	 */
	public void setYearlyRevenue(BigDecimal yearlyRevenue) {
		this.yearlyRevenue = yearlyRevenue;
	}

	/**
	 * @return the yearsInOperation
	 */
	public int getYearsInOperation() {
		return yearsInOperation;
	}

	/**
	 * @param yearsInOperation the yearsInOperation to set
	 */
	public void setYearsInOperation(int yearsInOperation) {
		this.yearsInOperation = yearsInOperation;
	}
	
	
}
