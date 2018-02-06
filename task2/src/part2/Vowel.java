package part2;

public class Vowel{
	public static final String STR_VOWELS = "aeiouy"; 
	public static final char [] ARR_VOWELS = {'a','e','i','o','u','y'};
	
	public static boolean isVowel1(char letter){
		letter = Character.toLowerCase(letter);
			return STR_VOWELS.contains(Character.toString(letter));
	}
	
	public static boolean isVowel2(char letter){
		letter = Character.toLowerCase(letter);
			return STR_VOWELS.indexOf(letter) != -1;
	}
	
	public static boolean isVowel3(char letter){
		letter = Character.toLowerCase(letter);
			return (letter == ARR_VOWELS[0] || letter == ARR_VOWELS[1] || letter == ARR_VOWELS[2] || letter == ARR_VOWELS[3] || letter == ARR_VOWELS[4] || letter == ARR_VOWELS[5]);
	}
	public static boolean isVowel4(char letter){
		letter = Character.toLowerCase(letter);
		switch(letter) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'y':
			return true;
		default: 
			return false;
		}
	}
}

