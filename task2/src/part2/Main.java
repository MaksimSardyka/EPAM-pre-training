package part2;

public class Main {
	public static void main(String [] args) {
	char letter = 'I';
	
	boolean result1 = Vowel.isVowel1(letter);
	boolean result2 = Vowel.isVowel2(letter);
	boolean result3 = Vowel.isVowel3(letter);
	boolean result4 = Vowel.isVowel4(letter);
	
	View.print("1)" + (result1?"Vowel":"Consonant") +"\n");
	View.print("2)" + (result2?"Vowel":"Consonant") +"\n");
	View.print("3)" + (result3?"Vowel":"Consonant") +"\n");
	View.print("4)" + (result4?"Vowel":"Consonant") +"\n");
	} 
}
