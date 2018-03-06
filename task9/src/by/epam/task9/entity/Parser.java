/*
 * Parser.java
 *
 * @version 1.00
 *
 * @since 06 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task9.entity;

public class Parser {
    /**
     * Class description goes here.
     *
     * @version 1.00
     *
     * @since 06 March 2018
     *
     * @author Maksim Sardyka
     */

    public static Sentence[] splitOnSentence(String paragraph) {
	Sentence[] result;
	String toSentences = "(?<=[.!?]+)";

	String[] sentences = paragraph.split(toSentences);
	result = new Sentence[sentences.length];
	for (int i = 0; i < sentences.length; i++) {
	    result[i] = new Sentence(sentences[i]);
	}
	return result;
    }

    public static String[] splitOnWord(String sentence) {
	String toWord = "[\\s,]";

	String[] words = sentence.split(toWord);
	return words;
    }
}
