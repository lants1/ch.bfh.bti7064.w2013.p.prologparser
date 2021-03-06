package ch.bfh.bti7064.parser.state;

import ch.bfh.bti7064.parser.core.ParserHelper;

/**
 * The beginning State of the PrologParser
 * 
 * @author Swen Lanthemann
 *
 */
public class Start implements State {

	private boolean isOutputState = false;
	
	@Override
	public boolean isOutputState() {
		return isOutputState;
	}
	
	@Override
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
