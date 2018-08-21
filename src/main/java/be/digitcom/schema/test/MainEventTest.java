package be.digitcom.schema.test;


import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;

import java.time.LocalTime;
import java.time.Month;


public class MainEventTest {

	public static void main(String[] args) {
		
		createEvent(
				LocalDate.of(2018, Month.JUNE, 4), 
				LocalDate.of(2018, Month.AUGUST, 1), 
				DayOfWeek.TUESDAY, 
				LocalTime.of(19, 00), 
				LocalTime.of(20, 30), 
				new BigDecimal(12)				
		);
		
	}
	
	private static void createEvent(LocalDate seasonStart, LocalDate seasonEnd, DayOfWeek day, LocalTime classStart, LocalTime classEnd, BigDecimal singleClassPrice) {
		System.out.println("D�but saison = " + seasonStart + " " + seasonEnd + "\n");
		LocalDate eventDay = seasonStart;
		
		while(eventDay.isBefore(seasonEnd)) {
			while(!eventDay.getDayOfWeek().equals(day)) {
				eventDay = eventDay.plusDays(1);
			}
			
			eventDay = eventDay.plusWeeks(1);
		}
		System.out.println("\nFin saison = " + seasonEnd.getDayOfWeek() + " " + seasonEnd);
	}


}
