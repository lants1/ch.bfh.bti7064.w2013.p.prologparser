package ch.bfh.bti7064.parser.state;

import ch.bfh.bti7064.parser.ParserHelper;

public class Start implements State {

	public State getState(char nextChar) {
		// goToQ1
		if (ParserHelper.isSpecialCase(nextChar)) {
			return new Q1();
		}

		// goToQ2
		if (ParserHelper.isUnderline(nextChar)
				|| ParserHelper.isUppercase(nextChar)) {
			return new Q2();
		}

		// goToQ3 NEA Part entweder sich selber oder Q3
		if (ParserHelper.isNumeric(nextChar)
				|| ParserHelper.isLowercase(nextChar)) {
			return new Q3();

		}
		return new Invalid();
	}
}
