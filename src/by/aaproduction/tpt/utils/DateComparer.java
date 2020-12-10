/**
 * 
 */
package by.aaproduction.tpt.utils;

import java.util.Date;

/**
 * @author Artsemy
 *
 */
public class DateComparer {
	
	public static int CompareDates(Date date1, Date date2) {
		int result;
		
		long time1 = date1.getTime();
		long time2 = date2.getTime();
		
		if (time1 > time2)
			result = 1;
		else if (time1 < time2)
			result = -1;
		else
			result = 0;
		return result;
	}
	
}
