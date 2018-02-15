package part3;

public class MoodSensor {
	public static final String[] FACES = { ":)", ":(", ":D" };

	public static void main(String[] args) {
		View.print(MyArr.getOneRandom(FACES));
	}
}
