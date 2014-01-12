package ch.bfh.bti7064.parser.state;

import ch.bfh.bti7064.parser.ParserHelper;

public class Q4 implements State {

	private boolean isOutputState = false;
	
	public boolean isOutputState() {
		return isOutputState;
	}

	public State getState(char nextChar) {
		if (ParserHelper.isSpecialCase(nextChar)) {
			return new Q1();
		} else if (ParserHelper.isNumeric(nextChar)
				|| ParserHelper.isLowercase(nextChar)
				|| ParserHelper.isUppercase(nextChar)
				|| ParserHelper.isUnderline(nextChar)) {
			return this;
		}

		return new Invalid();
	}
}
