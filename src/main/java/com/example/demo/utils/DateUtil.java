package com.example.demo.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	
	/*.. transform String to JavaDate.*/
	public static Date toDate (String date) throws ParseException {
		return format.parse(date);
	}
	
	/*.. transform JavaDate to String.*/
	public static String parse (Date date){
		return format.format(date);
	}
}
