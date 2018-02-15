package part4;

public class MyCalendar {
	public static final int[] LAST_MONTHS_DAY = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static String addOneDay(int day, int month, int year) {
		/* not last day of month + not additional day of leap-year */
		if ((day < LAST_MONTHS_DAY[month - 1]) || (day == 28 && month == 2 && checkIsLeapYear(year))) {
			day++;
		} else if (month != 12) {// not last year's day
			day = 1;
			month++;
		} else {// last year's day
			day = 1;
			month = 1;
			year++;
		}
		return day + " " + month + " " + year;
	}

	public static boolean checkIsLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}