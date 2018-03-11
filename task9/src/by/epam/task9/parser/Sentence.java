/*
 * Paragraph.java
 *
 * @version 1.00
 *
 * @since 06 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task9.parser;

public class Sentence extends Container<SentenceElement> implements Iterable<SentenceElement> {
    /**
     * This class is used for working with whole sentence
     *
     * @version 1.00
     *
     * @since 06 March 2018
     *
     * @author Maksim Sardyka
     */

    /* Init constructor */
    Sentence() {
    }

    /* Constructor with parameter */
    Sentence(String sentence) {
	String[] words = Parser.deleteAllStringEqualTo(Parser.toSentenceElement(sentence), " ");
	this.data = new SentenceElement[words.length];
	for (int i = 0; i < this.data.length; i++) {
		this.data[i] = new SentenceElement(words[i], Parser.isPunctuation(words[i]));
	}
    }

    /* Copy constructor */
    Sentence(Sentence data) {
	this.data = new SentenceElement[data.getSize()];
	for (int i = data.getSize() - 1; i >= 0; i--) {
	    this.data[i] = new SentenceElement(data.getData(i));
	}
    }
}
