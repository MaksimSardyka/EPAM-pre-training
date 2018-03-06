/*
 * TextDataReader.java
 *
 * @version 1.00
 *
 * @since 05 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task9.reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextDataReader {
    /**
     * This class is used for reading text from file
     *
     * @version 1.00
     *
     * @since 05 March 2018
     *
     * @author Maksim Sardyka
     */
    public static final String DEFAULT_FILENAME = "data" + File.separatorChar + "text.txt";
    
    /*
     * this method return List of paragraphs
     * @param filename - this is source file path
     * */
    public List<String> readDate(String filename) {
	File file = new File(filename);
	if (!file.exists() || !file.isFile()) {
	    filename = DEFAULT_FILENAME;
	}
	List<String> list = new ArrayList<>();
	try (Scanner scanner = new Scanner(file).useDelimiter("\n")) {
	    while (scanner.hasNext()) {
		String paragraph = scanner.next().trim();
		list.add(paragraph);
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}
	return list;
    }
}
