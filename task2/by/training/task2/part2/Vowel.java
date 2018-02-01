package by.training.task2.part2;

public class Vowel{
	public static boolean isVowel1(char letter){
		String vowels = "аоиеёэыуюя"; 
		if(vowels.contains(Character.toString(letter))) {
			return(true);
		} else {
			return(false);
		}
	}
	public static boolean isVowel2(char letter){
		String vowels ="аоиеёэыуюя";
		return vowels.indexOf(letter) != -1;
	}
	public static boolean isVowel3(char letter){
		char [] vowels = {'а','о','и','е','ё','э','ы','у','ю','я'};
		for(char vowel:vowels) {
			if(letter==vowel) {
				return true;
			}
		}
		return false;
	}
	public static boolean isVowel4(char letter){
		switch(letter) {
		case 'а':
		case 'о':
		case 'и':
		case 'е':
		case 'ё':
		case 'э':
		case 'ы':
		case 'у':
		case 'ю':
		case 'я':
			return true;
		default: 
			return false;
		}
	}
}