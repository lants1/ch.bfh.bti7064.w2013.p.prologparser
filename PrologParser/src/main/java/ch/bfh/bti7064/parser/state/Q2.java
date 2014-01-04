package ch.bfh.bti7064.parser.state;

import ch.bfh.bti7064.parser.ParserHelper;

public class Q2 implements State{

	public State getState(char nextChar){
		// goToQ1
		// goToQ1
		if (ParserHelper.isNumeric(nextChar)
				|| ParserHelper.isUppercase(nextChar)
				|| ParserHelper.isLowercase(nextChar)
				|| ParserHelper.isUnderline(nextChar)) {
			return this;
		}

		// goToQ2
		if (ParserHelper.isSpecialCase(nextChar)) {
			return new Q1();
		}

		return new Invalid();
	}
}
