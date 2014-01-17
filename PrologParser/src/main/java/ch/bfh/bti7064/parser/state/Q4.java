package ch.bfh.bti7064.parser.state;

import ch.bfh.bti7064.parser.ParserHelper;

public class Q4 implements State {

	private boolean isOutputState = false;
	
	@Override
	public boolean isOutputState() {
		return isOutputState;
	}

	@Override
	public State getState(char nextChar) {
		if (ParserHelper.isNumeric(nextChar)
				|| ParserHelper.isLowercase(nextChar)
				|| ParserHelper.isUppercase(nextChar)
				|| ParserHelper.isUnderline(nextChar)) {
			return this;
		}
		else if (ParserHelper.isSpecialCase(nextChar)) {
			return new Q1();
		}

		return new Invalid();
	}
}
