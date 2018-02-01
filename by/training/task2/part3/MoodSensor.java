package by.training.task2.part3;

public class MoodSensor {
	public static void main(String [] args) {
		String [] faces = {":)",":(",":D"};
		
		String face = MyArr.oneRandom(faces);
		
		View.print(face);
	}
}
