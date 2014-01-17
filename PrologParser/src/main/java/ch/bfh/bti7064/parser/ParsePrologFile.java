package ch.bfh.bti7064.parser;

import ch.bfh.bti7064.parser.gui.OpenFileDialog;

/**
 * Mainapplikation welcher mit Argumenten ein File übergeben werden kann.
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
