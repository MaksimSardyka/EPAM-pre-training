package part3;

public class MoodSensor {
	public static void main(String [] args) {
		String [] faces = {":)",":(",":D"};
		
		String face = MyArr.getOneRandom(faces);
		
		View.print(face);
	}
}
