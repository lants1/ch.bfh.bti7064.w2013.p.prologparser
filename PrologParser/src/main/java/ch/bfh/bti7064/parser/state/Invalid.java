package ch.bfh.bti7064.parser.state;

import ch.bfh.bti7064.parser.ParserHelper;

public class Invalid implements State{

	public State getState(char nextChar){
		return this;
	}
}
