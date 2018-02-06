package part2;

public class Ring {
	public static double getArea(int r1, int r2){
		return r1>r2 ? Math.PI*(Math.pow(r1,2) - Math.pow(r2,2)) : Math.PI*(Math.pow(r2,2) - Math.pow(r1,2));
	}
}
