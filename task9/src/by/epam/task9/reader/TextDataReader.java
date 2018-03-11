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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

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
     * 
     * @param filename - this is source file path
     */

    public String [] readDate(String filename) {
	File file = new File(filename);
	if (!file.exists() || !file.isFile()) {
	    filename = DEFAULT_FILENAME;
	}
	List<String> list = new ArrayList<>();

	InputStreamReader isr;
	try {
	    isr = new InputStreamReader(new FileInputStream(filename),"CP1251");
		BufferedReader br = new BufferedReader(isr);
		String cur;
		
		while((cur=br.readLine()) != null) {
		    list.add(cur.trim());
		};
	} catch (UnsupportedEncodingException | FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
	/*
	try (Scanner scanner = new Scanner(file)) {
	    while (scanner.hasNextLine()) {
		list.add(scanner.nextLine());
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}
	*/
	return list.toArray(new String[0]);
    }
}
