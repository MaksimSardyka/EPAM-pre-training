/*
 * Parser2.java
 *
 * @version 1.00
 *
 * @since 08 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task9.parser;

import java.util.ArrayList;

public class Parser {
    /**
     * Class description goes here.
     *
     * @version 1.00
     *
     * @since 08 March 2018
     *
     * @author Maksim Sardyka
     */
    private static final String PUNCTUATION_SYMBOLS = "([.!?]+)";

    static boolean isPunctuation(String symbol) {
	boolean result = false;
	if (PUNCTUATION_SYMBOLS.contains(symbol)) {
	    result = true;
	}
	return result;
    }

    static String[] deleteAllStringEqualTo(String[] strings, String stringToDelete) {
	ArrayList<String> result = new ArrayList<>();
	for (int i = 0; i < strings.length; i++) {
	    if (!strings[i].equals(stringToDelete)) {
		result.add(strings[i]);
	    }
	}
	return result.toArray(new String[0]);
    }

    public static String[] toSentence(String paragraph) {
	return paragraph.split("(?<=[.!?]+)");
    }

    public static String[] toSentenceElement(String sentence) {
	return sentence.split("(?<!^)\\b");// "[\\s,]");
    }

    public static String show(Text text) {
	StringBuilder output = new StringBuilder();
	for (Paragraph paragraph : text) {
	    output.append("  ");
	    for (Sentence sentence : paragraph) {
		for (SentenceElement sentenceElement : sentence) {
		    output.append(sentenceElement.getSentenceElement()).append(" ");
		}
	    }
	    output.append("\n");
	}
	return output.toString();
    }

    public static Text replace(Text text, int lengthChange, String substringChange) {
	for (Paragraph paragraph : text) {
	    paragraph.getSize();
	    for (Sentence sentence : paragraph) {
		for (SentenceElement sentenceElement : sentence) {
		    if (!sentenceElement.isPunctuation()
			    && sentenceElement.getSentenceElement().length() == lengthChange) {
			sentenceElement.setData(substringChange, false);
		    }
		}
	    }
	}
	return text;
    }

    public static Text swapFirstLast(Text text) {
	for (Paragraph paragraph : text) {
	    paragraph.getSize();
	    for (Sentence sentence : paragraph) {
		String first = sentence.getData(0).getSentenceElement();
		sentence.getData(0).setData(
			sentence.getData(sentence.getSize()-2).getSentenceElement(), false);
		sentence.getData(sentence.getSize()-2).setData(first, false);
	    }
	}
	return text;
    }

}
