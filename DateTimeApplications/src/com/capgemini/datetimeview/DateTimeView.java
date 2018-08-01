package com.capgemini.datetimeview;

import java.time.LocalDateTime;

public class DateTimeView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime date;
		date=LocalDateTime.now();
		System.out.println(date.getDayOfWeek()+", "+date.getMonth()+" "+date.getDayOfMonth()+", "+date.getYear());
		
	}

}
