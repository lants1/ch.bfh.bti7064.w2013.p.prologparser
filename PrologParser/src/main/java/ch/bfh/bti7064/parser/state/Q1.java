package ch.bfh.bti7064.parser.state;

import ch.bfh.bti7064.parser.ParserHelper;

public class Q1 implements State {

	private boolean isOutputState = true;
	
	@Override
	public boolean isOutputState() {
		return isOutputState;
	}
	
	@Override
	public State getState(char nextChar) {
		if(':' == nextChar){
			return new Q5();
		}
		if (ParserHelper.isSpecialCase(nextChar)) {
			return this;
		}
		if (ParserHelper.isNumeric(nextChar)
				|| ParserHelper.isLowercase(nextChar)) {
			return new Q3();
		}
		if (ParserHelper.isUnderline(nextChar)
				|| ParserHelper.isUppercase(nextChar)) {
			return new Q2();
		}

		return new Invalid();
	}
}
