package by.training.task2.part4;

public class MyCalendar {
	public static String addOneDay(int d, int m, int y) {
		int [] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//not last day of month + not additional day of leap-year
		if ((d < months[m-1]) || ( d==28 && m==2 && leapYear(y))) {
			d++;
		} else if (m!=12){//not last year's day
			d=1;
			m++;
		} else {//last year's day
			d=1;
			m=1;
			y++;
		}
		return(d +"-"+ m +"-"+ y);
	}
	public static boolean leapYear(int y) { 
		return(y%4==0 && y%100!=0 || y%400==0);
	}
}