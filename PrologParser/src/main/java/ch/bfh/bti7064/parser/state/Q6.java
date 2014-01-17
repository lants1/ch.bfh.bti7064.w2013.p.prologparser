package ch.bfh.bti7064.parser.state;

import ch.bfh.bti7064.parser.core.ParserHelper;

public class Q6 implements State {

	private boolean isOutputState = false;
	
	@Override
	public boolean isOutputState() {
		return isOutputState;
	}
	
	@Override
	public State getState(char nextChar) {
		if (ParserHelper.isSpecialCase(nextChar)) {
			return new Q1();
		}
		if (ParserHelper.isNumeric(nextChar)
				|| ParserHelper.isLowercase(nextChar) || ParserHelper.isUppercase(nextChar)
				|| ParserHelper.isUnderline(nextChar)) {
			return this;
		}

		return new Invalid();
	}
}
