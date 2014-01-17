package ch.bfh.bti7064.parser.state;

import ch.bfh.bti7064.parser.ParserHelper;

public class Q7 implements State {

	private boolean isOutputState = true;
	
	@Override
	public boolean isOutputState() {
		return isOutputState;
	}
	
	@Override
	public State getState(char nextChar) {
		if ('-' == nextChar)
		{
			return new Q5();
		}
		
		return new Invalid();
	}
}
