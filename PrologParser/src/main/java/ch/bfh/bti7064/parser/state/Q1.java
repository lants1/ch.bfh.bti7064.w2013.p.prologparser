package ch.bfh.bti7064.parser.state;

import ch.bfh.bti7064.parser.ParserHelper;

public class Q1 implements State {

	public State getState(char nextChar) {
		if (ParserHelper.isSpecialCase(nextChar)) {
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
