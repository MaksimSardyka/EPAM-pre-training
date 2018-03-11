/*
 * SentenceElements.java
 *
 * @version 1.00
 *
 * @since 10 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task9.parser;

public class SentenceElement {
    /**
     * This class contains sentence elements
     *
     * @version 1.00
     *
     * @since 10 March 2018
     *
     * @author Maksim Sardyka
     */
    private String sentenceElement;
    private boolean isPunctuation;

    SentenceElement(String sentenceElement, boolean isPunctuation) {
	this.sentenceElement = sentenceElement;
	this.isPunctuation = isPunctuation;
    }

    public SentenceElement(SentenceElement data) {
	this.sentenceElement = data.getData().sentenceElement;
	this.isPunctuation = data.getData().isPunctuation;
    }

    public boolean isPunctuation() {
	return isPunctuation;
    }

    public String getSentenceElement() {
	return sentenceElement;
    }
    
    SentenceElement getData() {
	return this;
    }

    void setData(String sentenceElement, boolean isPunctuation) {
	this.sentenceElement = sentenceElement;
	this.isPunctuation = isPunctuation;
    }
}
