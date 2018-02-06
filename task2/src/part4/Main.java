package part4;

public class Main {
	public static void main(String [] args) {
		int day=28;
		int month=2;
		int year=2016;
		
		String tomorrow = MyCalendar.addOneDay(day, month, year);
		
		View.print(tomorrow + "\n");
	}
}
