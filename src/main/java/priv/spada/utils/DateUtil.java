package priv.spada.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	private String test;
	
	public  static Date convertStringToDate(String time, String pattern) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		return sdf.parse(time);
	}

}
