package part1;

public class Weight{
		public static final double GRAM_IN_KG = 1000.0;
		public static final double GRAM_IN_TON = 1000_000.0;
		
		public static double convertToKg(int grams){
			return grams/GRAM_IN_KG;
		}
		public static double convertToTon(int grams){
			return grams/GRAM_IN_TON;
		}
}
