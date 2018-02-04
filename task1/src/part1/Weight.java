package part1;

public class Weight{
		public static double GRAM_IN_KG = 1000.0;
		public static double GRAM_IN_TON = 1000_000.0;
		
		public static double convertToKgs(int grams){
			return grams/GRAM_IN_KG;
		}
		public static double convertToTons(int grams){
			return grams/GRAM_IN_TON;
		}
}
