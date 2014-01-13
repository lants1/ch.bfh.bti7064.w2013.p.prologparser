package ch.bfh.bti7064.parser;

import java.util.ArrayList;
import java.util.List;

import ch.bfh.bti7064.parser.state.Start;
import ch.bfh.bti7064.parser.state.State;

/**
 * Prolog Parser
 * 
 * @author Swen Lanthemann
 * 
 */
public class PrologParser {

	String stringToParse;
	State currentState;
	String currentToken = "";
	List<String> tokens = new ArrayList<String>();

	public PrologParser(String stringToParse) {
		this.stringToParse = stringToParse;
		this.currentState = new Start();
	}

	/**
	 * Iterate through a string and parse the string according to the state
	 * engine...
	 * 
	 */
	public void parse() {
		char[] eachSymbols = new char[stringToParse.length()];
		getStringToParse().getChars(0, stringToParse.length(), eachSymbols, 0);
		int counter = 0;
		for (char posChar : eachSymbols) {
			State newState = getCurrentState().getState(posChar);
			// no output token
			if (newState.equals(getCurrentState()) && (!newState.isOutputState())) {
				setCurrentToken(getCurrentToken() + posChar);
			}
			// statechanges...
			else {
				setCurrentState(newState);
				// save and reset token
				if ( (newState.isOutputState()) && counter > 1) {
					addToken(getCurrentToken());
					setCurrentToken(""+posChar);
				}
				else{
					setCurrentToken(getCurrentToken()+posChar);
				}
			}
			counter++;
		}
		// add final token...
		addToken(getCurrentToken());
	}

	
	public String getStringToParse() {
		return stringToParse;
	}

	public void setStringToParse(String stringToParse) {
		this.stringToParse = stringToParse;
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public String getCurrentToken() {
		return currentToken;
	}

	public void setCurrentToken(String currentToken) {
		this.currentToken = currentToken;
	}

	public List<String> getTokens() {
		return tokens;
	}

	public void setTokens(List<String> tokens) {
		this.tokens = tokens;
	}
	
	public void addToken(String token){
		this.tokens.add(token);
	}
}