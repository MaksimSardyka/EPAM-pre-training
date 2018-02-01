package by.training.task2.part2;

public class Main {
	public static void main(String [] args) {
	Character letter = 'е';
	boolean result1 = Vowel.isVowel1(Character.toLowerCase(letter));
	boolean result2 = Vowel.isVowel2(Character.toLowerCase(letter));
	boolean result3 = Vowel.isVowel3(Character.toLowerCase(letter));
	boolean result4 = Vowel.isVowel4(Character.toLowerCase(letter));
	View.print("1)"+result1 +"\n2)"+ result2 +"\n3)"+ result3 +"\n4)"+ result4);
	} 
}
