/**
 * @url http://schema.org/PeopleAudience
 * 
 * A set of characteristics belonging to people, e.g. who compose an item's target audience.
 */
package be.digitcom.schema.audience;

import be.digitcom.schema.healthLifesci.MedicalCondition;

/**
 * @author Rufin M�togb� Hounkpe
 *
 */
public class PeopleAudience extends Audience {
	/*
	 * Specifying the health condition(s) of a patient, medical study, or other target audience.
	 */
	private MedicalCondition healthCondition;
	
	/*
	 * Audiences defined by a person's gender.
	 */
	private String requiredGender;
	
	/*
	 * Audiences defined by a person's maximum age.
	 */
	private int requiredMaxAge;
	
	/*
	 * Audiences defined by a person's minimum age.
	 */
	private int requiredMinAge;
	
	/*
	 * The gender of the person or audience.
	 */
	private int suggestedGender;
	
	/*
	 * Maximal age recommended for viewing content.
	 */
	private int suggestedMaxAge;
	
	/*
	 * Minimal age recommended for viewing content.
	 */
	private int suggestedMinAge;

	/**
	 * @return the healthCondition
	 */
	public MedicalCondition getHealthCondition() {
		return healthCondition;
	}

	/**
	 * @param healthCondition the healthCondition to set
	 */
	public void setHealthCondition(MedicalCondition healthCondition) {
		this.healthCondition = healthCondition;
	}

	/**
	 * @return the requiredGender
	 */
	public String getRequiredGender() {
		return requiredGender;
	}

	/**
	 * @param requiredGender the requiredGender to set
	 */
	public void setRequiredGender(String requiredGender) {
		this.requiredGender = requiredGender;
	}

	/**
	 * @return the requiredMaxAge
	 */
	public int getRequiredMaxAge() {
		return requiredMaxAge;
	}

	/**
	 * @param requiredMaxAge the requiredMaxAge to set
	 */
	public void setRequiredMaxAge(int requiredMaxAge) {
		this.requiredMaxAge = requiredMaxAge;
	}

	/**
	 * @return the requiredMinAge
	 */
	public int getRequiredMinAge() {
		return requiredMinAge;
	}

	/**
	 * @param requiredMinAge the requiredMinAge to set
	 */
	public void setRequiredMinAge(int requiredMinAge) {
		this.requiredMinAge = requiredMinAge;
	}

	/**
	 * @return the suggestedGender
	 */
	public int getSuggestedGender() {
		return suggestedGender;
	}

	/**
	 * @param suggestedGender the suggestedGender to set
	 */
	public void setSuggestedGender(int suggestedGender) {
		this.suggestedGender = suggestedGender;
	}

	/**
	 * @return the suggestedMaxAge
	 */
	public int getSuggestedMaxAge() {
		return suggestedMaxAge;
	}

	/**
	 * @param suggestedMaxAge the suggestedMaxAge to set
	 */
	public void setSuggestedMaxAge(int suggestedMaxAge) {
		this.suggestedMaxAge = suggestedMaxAge;
	}

	/**
	 * @return the suggestedMinAge
	 */
	public int getSuggestedMinAge() {
		return suggestedMinAge;
	}

	/**
	 * @param suggestedMinAge the suggestedMinAge to set
	 */
	public void setSuggestedMinAge(int suggestedMinAge) {
		this.suggestedMinAge = suggestedMinAge;
	}
	
	
}
