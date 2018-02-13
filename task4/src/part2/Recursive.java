package part2;

public class Recursive {
	public static double pow(double x, int n){
		if(n!=1) {
			return x*pow(x,n-1);
		} 
		return x;
	}
}
