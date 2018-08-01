package com.capgemini.datetimeview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateValidity {

	public static void main(String[] args) throws IOException {
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy"); 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the date in dd/mm/yyyy");
		
		String dateStr=br.readLine();//"01/08/2018";
		sdf.setLenient(false);
		
		Date date=null;
		try
		{
			 date=sdf.parse(dateStr);
		}
		
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Invalid Date");
		}
		
		System.out.println("Enter the no of days to add");
		Calendar c=Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE,Integer.parseInt(br.readLine()));
		
		System.out.println(sdf.format(c.getTime()));
	}

}
