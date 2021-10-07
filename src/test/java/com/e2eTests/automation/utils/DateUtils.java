package com.e2eTests.automation.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	public static String monthNumberStr(String month){
		Date date;
		String res = "00";
		try {
			date = new SimpleDateFormat("MMMM").parse(month);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			res = String.valueOf(cal.get(Calendar.MONTH)+1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (res.length() == 1)
			res = "0" + res;
		
		return res;
	}
}
