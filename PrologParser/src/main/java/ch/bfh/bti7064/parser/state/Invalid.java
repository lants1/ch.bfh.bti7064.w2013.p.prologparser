package ch.bfh.bti7064.parser.state;

/**
 * Invalid State indicates that something goes wrong with parsing the file. The syntax of the
 * parsed string is wrong according to the prolog syntax.
 * 
 * @author Swen Lanthemann
 *
 */
public class Invalid implements State{

	private boolean isOutputState = false;
	
	public boolean isOutputState() {
		return isOutputState;
	}
	
	public State getState(char nextChar){
		return this;
	}
}
