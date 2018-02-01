package by.training.task1.part2;

public class Ring {
	public static double getSquare(int outer, int inner){
		return(outer>inner ? Math.PI*(Math.pow(outer,2) - Math.pow(inner,2)) : -1);
	}
}
