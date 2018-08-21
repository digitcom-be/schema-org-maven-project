package be.digitcom.schema.event.specific;

/*
 * @author Rufin M�togb� Hounkpe
 */

import java.util.ArrayList;
import java.util.List;

import be.digitcom.schema.Person;
import be.digitcom.schema.event.Event;

public class CourseInstance extends Event {
	
	/*
	 * The medium or means of delivery of the course instance or the mode of study, 
	 * either as a text label (e.g. "online", "onsite" or "blended"; "synchronous" or "asynchronous"; 
	 * "full-time" or "part-time") or as a URL reference to a term from a controlled vocabulary 
	 * (e.g. https://ceds.ed.gov/element/001311#Asynchronous ).
	 */
	private String courseMode;
	
	/*
	 * A person assigned to instruct or provide instructional assistance for the CourseInstance.
	 */
	private List<Person> instructors = new ArrayList<>();
	
	
	
	public CourseInstance() {}



	/**
	 * @return the courseMode
	 */
	public String getCourseMode() {
		return courseMode;
	}



	/**
	 * @param courseMode the courseMode to set
	 */
	public void setCourseMode(String courseMode) {
		this.courseMode = courseMode;
	}



	/**
	 * @return the instructors
	 */
	public List<Person> getInstructors() {
		return instructors;
	}



	/**
	 * @param instructors the instructors to set
	 */
	public void setInstructors(List<Person> instructors) {
		this.instructors = instructors;
	}
	


	
}
