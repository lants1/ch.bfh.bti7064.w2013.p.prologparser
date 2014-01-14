package ch.bfh.bti7064.parser.state;

import ch.bfh.bti7064.parser.ParserHelper;

public class Q5 implements State {

	private boolean isOutputState = false;
	
	@Override
	public boolean isOutputState() {
		return isOutputState;
	}
	
	@Override
	public State getState(char nextChar) {
		if ('-' == nextChar) {
			return this;
		}
		if (ParserHelper.isNumeric(nextChar)
				|| ParserHelper.isLowercase(nextChar)) {
			return new Q3();
		}

		if (ParserHelper.isUppercase(nextChar)
				|| ParserHelper.isUnderline(nextChar)) {
			return new Q2();
		}
		return new Invalid();
	}
}
