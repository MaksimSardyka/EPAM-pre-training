/*
 * Paragraph.java
 *
 * @version 1.00
 *
 * @since 09 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task9.parser;
public class Paragraph extends Container<Sentence> implements Iterable<Sentence> {
    /**
     * Class description goes here.
     *
     * @version 1.00
     *
     * @since 09 March 2018
     *
     * @author Maksim Sardyka
     */
    /* Init constructor */
    Paragraph(){
    }
    
    /* Convert from solid paragraph to [] of sentences */
    Paragraph(String paragraph) {
	String[] sentences = Parser.toSentence(paragraph);
	this.data = new Sentence[sentences.length];
	for (int i = 0; i < sentences.length; i++) {
	    this.data[i] = new Sentence(sentences[i]);
	}
    }

    /* Copy constructor */
    Paragraph(Paragraph data) {
	this.data = new Sentence[data.getSize()];
	for (int i = data.getSize() - 1; i >= 0; i--) {
	    this.data[i] = new Sentence(data.getData(i));
	}
    }
}