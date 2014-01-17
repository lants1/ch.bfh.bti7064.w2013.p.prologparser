package ch.bfh.bti7064.parser;

import static org.junit.Assert.*;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import ch.bfh.bti7064.parser.core.PrologParser;

/**
 * Tests the Parser's functionality.
 * 
 * @author Swen Lanthemann
 *
 */
public class PrologParserTest {

	@Test
	public void test() {
		PrologParser parser = new PrologParser("grossvater(Z,mutter(X,Y)).");
		parser.parse();
		assertTrue(StringUtils.equals(parser.getTokens().get(0),"grossvater"));
		assertTrue(StringUtils.equals(parser.getTokens().get(1),"("));
		assertTrue(StringUtils.equals(parser.getTokens().get(2),"Z"));
		assertTrue(StringUtils.equals(parser.getTokens().get(3),","));
		assertTrue(StringUtils.equals(parser.getTokens().get(4),"mutter"));
		assertTrue(StringUtils.equals(parser.getTokens().get(5),"("));
		assertTrue(StringUtils.equals(parser.getTokens().get(6),"X"));
		assertTrue(StringUtils.equals(parser.getTokens().get(7),","));
		assertTrue(StringUtils.equals(parser.getTokens().get(8),"Y"));
		assertTrue(StringUtils.equals(parser.getTokens().get(9),")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(10),")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(11),"."));
	}

}
