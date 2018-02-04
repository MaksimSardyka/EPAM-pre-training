package part4;

public class MyCalendar {
	public static int[] addOneDay(int[] date) {
		int [] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int day = date[0];
		int month = date[1]; 
		int year = date[2];
		
		//not last day of month + not additional day of leap-year
		if ((day < months[month-1]) || ( day==28 && month==2 && isLeapYear(year))) {
			day++;
		} else if (month!=12){//not last year's day
			day=1;
			month++;
		} else {//last year's day
			day=1;
			month=1;
			year++;
		}
		int [] result = {day,month,year};
		return result;
	}
	public static boolean isLeapYear(int year) { 
		return(year%4==0 && year%100!=0 || year%400==0);
	}
}