package part2;

public class Vowel{
	public static String STR_VOWELS = "aeiou"; 
	public static char [] ARR_VOWELS = {'a','e','i','o','u'};
	
	public static boolean isVowel1(char letter){
		letter = Character.toLowerCase(letter);
		if(STR_VOWELS.contains(Character.toString(letter))) {
			return(true);
		} else {
			return(false);
		}
	}
	
	public static boolean isVowel2(char letter){
		letter = Character.toLowerCase(letter);
		return STR_VOWELS.indexOf(letter) != -1;
	}
	
	public static boolean isVowel3(char letter){
		letter = Character.toLowerCase(letter);
		if(letter == ARR_VOWELS[0]) {
			return true;
		} else if (letter == ARR_VOWELS[1]) {
			return true;
		} else if (letter == ARR_VOWELS[2]) {
			return true;
		} else if (letter == ARR_VOWELS[3]) {
			return true;
		} else if (letter == ARR_VOWELS[4]) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean isVowel4(char letter){
		letter = Character.toLowerCase(letter);
		switch(letter) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		default: 
			return false;
		}
	}
}

