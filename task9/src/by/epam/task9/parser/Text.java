/*
 * Text.java
 *
 * @version 1.00
 *
 * @since 09 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task9.parser;

public class Text extends Container<Paragraph> implements Iterable<Paragraph> {
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
    Text() {
    }

    /* Converts from solid text to [] of paragraph */
    public Text(String[] lines) {
	data = new Paragraph[lines.length];
	for (int i = 0; i < lines.length; i++) {
	    data[i] = new Paragraph(lines[i]);
	}
    }

    /* Copy constructor */
    public Text(Text text) {
	this.data = new Paragraph[text.getSize()];
	for (int i = 0; i < text.getSize(); i++) {
	    this.data[i] = new Paragraph(text.getData(i));
	}
    }

}