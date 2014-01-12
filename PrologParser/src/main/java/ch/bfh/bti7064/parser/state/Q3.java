package ch.bfh.bti7064.parser.state;

import ch.bfh.bti7064.parser.ParserHelper;

public class Q3 implements State {

	private boolean isOutputState = true;
	
	public boolean isOutputState() {
		return isOutputState;
	}
	
	public State getState(char nextChar) {
		// goToQ1
		if (ParserHelper.isNumeric(nextChar)
				|| ParserHelper.isUppercase(nextChar)
				|| ParserHelper.isLowercase(nextChar)) {
			return new Q4();
		}

		// goToQ2
		if (ParserHelper.isSpecialCase(nextChar)) {
			return new Q1();
		}

		return new Invalid();
	}
}
