package by.epam.task9.main;

import by.epam.task9.entity.Paragraph;
import by.epam.task9.reader.TextDataReader;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
	TextDataReader itemDataReader = new TextDataReader();

	/* Read all paragraphs from .txt */
	List<String> text = itemDataReader.readDate("data\\text.txt");

	/* Send them inside paragraph class */
	Paragraph[] paragraphs = new Paragraph[text.size()];
	for (int i = 0; i < text.size(); i++) {
	    paragraphs[i] = new Paragraph(text.get(i));
	}

	/* Definitely wrong way of doing this: */
	/*
	 * В некотором предложении текста слова заданной длины заменить указанной
	 * подстрокой, длина которой может не совпадать с длиной слова.
	 */
	
	int length = 2;
	String newSubstring = "Another";
	
	for (int i = 0; i < text.size(); i++) {
	    for (int j = 0; j < paragraphs[i].getSize(); j++) {
		for (int k = 0; k < paragraphs[i].getSentence(j).length; k++) {
		    for (int h = 0; h < paragraphs[i].getSentence(j)[k].getSize(); h++) {
			if(paragraphs[i].getSentence(j)[k].getWord(h).length() == length) {
			    paragraphs[i].getSentence(j)[k].setWord(h, newSubstring); 
			}
		    }
		}
	    }
	}
	
	
    }
}
