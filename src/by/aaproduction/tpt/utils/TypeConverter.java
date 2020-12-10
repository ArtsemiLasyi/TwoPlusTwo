/**
 * 
 */
package by.aaproduction.tpt.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author Artsemy
 *
 */
public final class TypeConverter {
	
	public static String dateFormat = "dd-MMM-yyyy";
	
	public static Date convertFromStringToDate(String date) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat, Locale.ENGLISH);
		return formatter.parse(date);
	}
	
	public static String convertFromDateToString(Date date) {
		DateFormat df = new SimpleDateFormat(dateFormat);
		return df.format(date);
	}
	
	public static String getDateFormat() {
		return dateFormat;
	}
}
