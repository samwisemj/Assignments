package com.capgemini.datetimeview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DayOfTheDate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter date in dd/mm/yyyy format");
		
		String s=br.readLine();
//		String s="07/07/1995";
		Date date=new Date(s);
		System.out.println(LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).getDayOfWeek());

	}

}
