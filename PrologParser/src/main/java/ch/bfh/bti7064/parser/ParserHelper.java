package ch.bfh.bti7064.parser;

import org.apache.commons.lang3.CharUtils;

/**
 * Helper class that defines the possible parser matching methods.
 * 
 * @author Swen Lanthemann
 *
 */
public final class ParserHelper {

	public static boolean isNumeric(char checkChar) {
		return CharUtils.isAsciiNumeric(checkChar);
	}

	public static boolean isLowercase(char checkChar) {
		return CharUtils.isAsciiAlphaLower(checkChar);
	}

	public static boolean isUppercase(char checkChar) {
		return CharUtils.isAsciiAlphaUpper(checkChar);
	}

	public static boolean isUnderline(char checkChar) {
		return (checkChar == '_');
	}

	public static boolean isSpecialCase(char checkChar) {
		char[] specialCh = { '<', '>', '!', '@', '[', ']', '#', '$', '%', '^',
				'&', '*', '(', ')',',' , ' ', '.','_','|','T'};

		for (Character current : specialCh) {
			if (current == checkChar)
				return true;
		}
		return false;
	}
}
