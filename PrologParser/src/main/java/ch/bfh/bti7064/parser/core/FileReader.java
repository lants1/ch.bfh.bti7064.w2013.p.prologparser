package ch.bfh.bti7064.parser.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
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
	private File file = null;

	/**
	 * FileReader constructor
	 * 
	 * @param filePath
	 */
	public FileReader(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * FileReader constructor
	 * 
	 * @param filePath
	 */
	public FileReader(File file) {
		this.file = file;
	}

	/**
	 * reads a line file for file..
	 */
	public void read() {
		BufferedReader br = null;
		StringBuffer processedStringBf = new StringBuffer();
		try {
			// Get BufferedReader from file
			if (file != null) {
				br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			} else {
				br = new BufferedReader(new InputStreamReader(this.getClass()
						.getResourceAsStream(filePath)));
			}
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
		setProcessedString(processedStringBf.toString());
	}

	public String getProcessedString() {
		return processedString;
	}

	private void setProcessedString(String processedString) {
		this.processedString = processedString;
	}
}