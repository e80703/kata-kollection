package kata.implementation;

/**
 *	kata description: decide whether a year is a leap year or not 
 * 		a leap year is defined as one that is divisible by 4,
 * 		but is not otherwise divisible by 100 unless it is 
 * 		also divisble by 400
 * 
 * 	source: http://en.wikipedia.org/wiki/Leap_year
 * 
 */
public class LeapYear {

	public static boolean isLeapYear(int year) {
		// write only version
		return (year % 4 == 0) ? ((year % 100 == 0) ? ((year % 400 == 0) ? true
				: false) : true) : false;

/*
		// normal version
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		}
		return false;
*/
	}
	
}
