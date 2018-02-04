package part4;

public class Main {
	public static void main(String [] args) {
		int day=28;
		int month=2;
		int year=2016;
		
		int [] today = {day, month,year};
		int [] tomorrow = MyCalendar.addOneDay(today);
		
		View.print(tomorrow[0] +"-"+ tomorrow[1] +"-"+ tomorrow[2] + "\n");
	}
}
