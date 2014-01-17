package ch.bfh.bti7064.parser;

import ch.bfh.bti7064.parser.gui.OpenFileDialog;

/**
 * Mainapplikation welche ein mini Swing GUI öffnet wo man ein Prolog File auswählen kann dass dann geparsed wird.
 * 
 * @author Swen Lanthemann
 *
 */
public class ParsePrologFile {

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
				// creating and showing this application's GUI.
				javax.swing.SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						OpenFileDialog.createAndShowGUI();
					}
				});
	}

}
