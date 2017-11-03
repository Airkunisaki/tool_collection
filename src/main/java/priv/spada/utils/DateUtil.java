package priv.spada.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	private final String DATE_PATTERN_1 = "yyyy-MM-dd hh:mm:ss";
	
	public  static Date convertStringToDate(String time, DateFormatType type) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat(type.getValue());
		
		DateFormatType.NORMAL_PRECISION_SS.getValue();
		
		return sdf.parse(time);
	}
	
	public void main(String[] args){
		try {
			convertStringToDate("2017-12-1 11:00:00", DateFormatType.NORMAL_PRECISION_SS);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
