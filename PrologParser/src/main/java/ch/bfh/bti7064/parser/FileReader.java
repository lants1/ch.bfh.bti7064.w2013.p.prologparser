package ch.bfh.bti7064.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * FileReader witch reads a prolog file
 * 
 * @author Swen Lanthemann
 * 
 */
public class FileReader {

	private Logger log = Logger.getLogger("ch.bfh.bti7064.parser.FileReader");
	private String filePath;
	private String processedString;

	public FileReader(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * reads a line file for file..
	 */
	public void read() {
		BufferedReader br = null;
		StringBuffer processedStringBf = new StringBuffer();
		try {
			// Get BufferedReader from file
			br = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(filePath)));
			String line = br.readLine();

			while (line != null) {
				// Call to PrologPreprocessor to remove lines
				processedStringBf.append(PrologPreprocessor.process(line));
				line = br.readLine();
			}

		} catch (IOException e) {
			log.log(Level.SEVERE, "ReaderException", e);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				log.log(Level.SEVERE, "ReaderException", e);
			}
		}
		processedString = processedStringBf.toString();
	}
	
	public String getProcessedString() {
		return processedString;
	}

	public void setProcessedString(String processedString) {
		this.processedString = processedString;
	}
}