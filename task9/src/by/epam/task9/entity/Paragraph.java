/*
 * Text.java
 *
 * @version 1.00
 *
 * @since 05 March 2018
 *
 * @author Maskim Sardyka
 */


package by.epam.task9.entity;

import java.util.ArrayList;

public class Paragraph {
    /**
     * Class description goes here.
     *
     * @version 1.00
     *
     * @since 05 March 2018
     *
     * @author Maksim Sardyka
     */
    private static ArrayList<Sentence[]> sentences;
    {sentences = new ArrayList<Sentence[]>();} //1 element = 1 paragraph = array of sentences

    /*
     * @param paragraphs - receives a list of paragraphs
     * */
    public Paragraph(String paragraph){
	sentences.add(Parser.splitOnSentence(paragraph));
    }
    
    public Sentence[] getSentence(int index){
	return sentences.get(index);
    }
    
    public int getSize(){
	return sentences.size();
    }
}
