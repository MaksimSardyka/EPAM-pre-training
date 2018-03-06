/*
 * Paragraph.java
 *
 * @version 1.00
 *
 * @since 06 March 2018
 *
 * @author Maskim Sardyka
 */


package by.epam.task9.entity;

public class Sentence {
    /**
     * Class description goes here.
     *
     * @version 1.00
     *
     * @since 06 March 2018
     *
     * @author Maksim Sardyka
     */
    private String[] words;
    
    Sentence (String sentence){
	this.words = Parser.splitOnWord(sentence);
    }
    
    public int getSize(){
	return words.length;
    }
    
    public String getWord(int index){
	return words[index];
    }
    
    public void setWord(int index, String newWord){
	this.words[index] = newWord;
    }
    
}
