package be.digitcom.schema.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatNumber {
	
	static DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
	
	static LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
	static LocalTime time = LocalTime.of(11, 12, 34);
	static LocalDateTime dateTime = LocalDateTime.of(date, time);
	
	
	static NumberFormat en = NumberFormat.getInstance(Locale.US);
	static NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
	static String s = "40.45";
	
	
	static double price = 48;
	static int attendeesPerYear = 3_200_000;
	static int attendeesPerMonth = attendeesPerYear / 12;
	
	static NumberFormat us = NumberFormat.getInstance(Locale.US);
	static NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
	static NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
	static NumberFormat beFr = NumberFormat.getInstance(new Locale("fr", "BE"));
	static NumberFormat beNl = NumberFormat.getInstance(new Locale("nl", "BE"));
	
	static NumberFormat usPrice = NumberFormat.getCurrencyInstance(Locale.US);
	static NumberFormat beFrPrice = NumberFormat.getCurrencyInstance(new Locale("fr", "BE"));
	static NumberFormat beNlPrice = NumberFormat.getCurrencyInstance(new Locale("nl", "BE"));
	static NumberFormat deDePrice = NumberFormat.getCurrencyInstance(new Locale("de", "DE"));
	static NumberFormat caPrice = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);

	public static void main(String[] args) throws ParseException {
		
		System.out.println(shortDateTime.format(dateTime));
		System.out.println(shortDateTime.format(date));
		//System.out.println(shortDateTime.format(time));
		
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		try {
			System.out.println(en.parse(s));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(fr.parse(s));
		
		System.out.println("US: " + usPrice.format(price));
		System.out.println("de DE : " + deDePrice.format(price));
		System.out.println("Fr BE: " + beFrPrice.format(price));
		System.out.println("Nl BE: " + beNlPrice.format(price));	
		System.out.println("fr CA: " + caPrice.format(price));	
		
		System.out.println("US: " + us.format(attendeesPerMonth));
		System.out.println("de DE : " + g.format(attendeesPerMonth));
		System.out.println("FR CA: " + ca.format(attendeesPerMonth));
		System.out.println("Fr BE: " + beFr.format(attendeesPerMonth));
		System.out.println("Nl BE: " + beNl.format(attendeesPerMonth));
	}

}
