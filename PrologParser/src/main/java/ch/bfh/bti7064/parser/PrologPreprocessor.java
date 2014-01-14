package ch.bfh.bti7064.parser;

/**
 * PrologPreprocessor removes whitespaceses, invisible things and comments from a prolog file...
 * 
 * @author Swen Lanthemann
 *
 */
public class PrologPreprocessor {
		
		public static String process(String lineToPreprocess){
			// Removes all Whitespaces and invisible things..
			lineToPreprocess = lineToPreprocess.replaceAll("\\s+","");
			
			// Removes all prolog comments which occure
			// an % indicates the beginning of a comment
			char[] eachSymbols = new char[lineToPreprocess.length()];
			lineToPreprocess.getChars(0, lineToPreprocess.length(), eachSymbols, 0);
			StringBuffer resultBuffer = new StringBuffer();
			for (char posChar : eachSymbols) {
				if(posChar == '%'){
					return resultBuffer.toString();
				}
				resultBuffer.append(posChar);
			}
			return lineToPreprocess;
		}
}
