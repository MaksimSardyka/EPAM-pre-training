package part3;

public class MyArr {
	public static String getOneRandom(String [] arr)
	{     
	   return arr[(int)(Math.random() * arr.length)];
	}
}
