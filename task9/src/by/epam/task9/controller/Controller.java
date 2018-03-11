package by.epam.task9.controller;

import by.epam.task9.parser.Parser;
import by.epam.task9.parser.Text;
import by.epam.task9.reader.TextDataReader;
import by.epam.task9.view.View;

import java.io.IOException;

public class Controller {
    public static void main(String[] args) throws IOException {

	String filename = "data\\text.txt";

	/* Read data from file */
	TextDataReader textReader = new TextDataReader();
	String[] data = textReader.readDate(filename);

	/* Convert to Object */
	Text originalText = new Text(data);
	View.print("This is original text:\n");
	View.print(Parser.show(originalText));

	/* Task 17 */
	int lengthChange = 2;
	String substringChange = "Another";
	/*
	 * Replace string of given length with another string(length of string can be
	 * unequal)
	 */
	Text text = new Text(originalText);
	Parser.replace(text, lengthChange, substringChange);
	View.print("This is our result:\n");
	View.print(Parser.show(text));

	/*
	 * Task 5 
	 * Show result Swap first and last word in each sentence without changing
	 * sentence length
	 */
	Text text2 = new Text(originalText);
	View.print("Swap first and last words in each sentence:\n");
	Parser.swapFirstLast(text2);
	View.print(Parser.show(text2));
    }
}
