package ch.bfh.bti7064.parser.state;

/**
 * Interface for each parser State
 * 
 * @author Swen Lanthemann
 *
 */
public interface State {
	
	/**
	 * The current token is only outputed when theFlag is OutputState is setted.
	 * 
	 * @return true if outputState
	 */
	public boolean isOutputState();
	
	/**
	 * Get the following state according to the currentState and the nextChar from the String to parse.
	 * 
	 * @param nextChar
	 * @return
	 */
	public State getState(char nextChar);
}
