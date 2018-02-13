package part3;

public class Main {
	public static void main(String[] args) {
		long N =1_000_100L;
		long S =101L;
		
		View.print("Iterative: "+Iterative.equals(N, S)+"\nRecursive: "+Recursive.equals(N, S));
	}
}
