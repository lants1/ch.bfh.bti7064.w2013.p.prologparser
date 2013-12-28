import org.apache.commons.lang3.CharUtils;

/**
 * Prolog Parser
 * 
 * @author Swen Lanthemann
 * 
 */
public class PrologParser {

	String stringToParse;
	State state;

	public PrologParser(String stringToParse) {
		this.stringToParse = stringToParse;
		this.state = State.START;
	}

	/**
	 * Iterate through a string and parse the string according to the state
	 * engine...
	 * 
	 * @throws java.lang.Exception
	 */
	public void parse() throws Exception {
		char[] eachSymbol = new char[stringToParse.length()];
		stringToParse.getChars(0, stringToParse.length(), eachSymbol, 0);
		for (char posChar : eachSymbol) {
			// goToQ1
			if (this.isSpecialCase(posChar)) {
				if (state.possibleFollowUps().contains(State.Q1)) {
					state = State.Q1;
					continue;
				}

			}

			// goToQ2
			if (this.isUnderline(posChar) || this.isUppercase(posChar)) {
				if (state.possibleFollowUps().contains(State.Q2)) {
					state = State.Q2;
					continue;
				}

			}

			// goToQ3 NEA Part entweder sich selber oder Q3
			if (this.isNumeric(posChar) || this.isLowercase(posChar)) {
				if (state.possibleFollowUps().contains(State.Q3)) {
					state = State.Q3;
					continue;
				}

			}

			throw new Exception("State Transition not possible");
			// eachSymbol
		}
	}

	public boolean isNumeric(char checkChar) {
		return CharUtils.isAsciiNumeric(checkChar);
	}

	public boolean isLowercase(char checkChar) {
		return CharUtils.isAsciiAlphaLower(checkChar);
	}

	public boolean isUppercase(char checkChar) {
		return CharUtils.isAsciiAlphaUpper(checkChar);
	}

	public boolean isUnderline(char checkChar) {
		return (checkChar == '_');
	}

	public boolean isSpecialCase(char checkChar) {
		char[] specialCh = { '<', '>', '!', '@', '[', ']', '#', '$', '%', '^',
				'&', '*' };

		for (Character current : specialCh) {
			if (current == checkChar)
				return true;
		}
		return false;
	}
}