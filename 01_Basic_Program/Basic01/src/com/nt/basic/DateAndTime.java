package com.nt.basic;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTime {

	public static void main(String[] args) {
		int day,month,year,hours,minute,seconds;
		
		GregorianCalendar date = new GregorianCalendar();
		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year= date.get(Calendar.YEAR);
		hours = date.get(Calendar.HOUR);
		minute = date.get(Calendar.MINUTE);
		seconds= date.get(Calendar.SECOND);
		
		
		System.out.print("Current Date and time "+day+"/"+month+1+"/"+year+":"+hours+":"+minute+":"+seconds);
		
	}

}
