package com.capgemini.datetimeview;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class HowManyDaysAlive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Total Number of days alive is "+ChronoUnit.DAYS
				.between(LocalDateTime.ofInstant(new Date("07/07/1995").toInstant(), ZoneId.systemDefault()),LocalDateTime.now()));
	}

}
