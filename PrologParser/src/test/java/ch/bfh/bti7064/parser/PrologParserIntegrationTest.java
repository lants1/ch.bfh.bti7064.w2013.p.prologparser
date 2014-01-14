package ch.bfh.bti7064.parser;

import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Test's the combination FileReader>PrologPreprocessor>Prologparser  --> output
 * 
 * @author Swen Lanthemann
 *
 */
public class PrologParserIntegrationTest {
	@Test
	public void test() {
		FileReader reader = new FileReader("/blocksworld.pl");
		reader.read();
		PrologParser parser = new PrologParser(reader.getProcessedString());
		parser.parse();
		
		System.out.println(parser.getTokens().toString());
		assertTrue(StringUtils.equals(parser.getTokens().get(0),"member"));
		assertTrue(StringUtils.equals(parser.getTokens().get(1),"("));
		assertTrue(StringUtils.equals(parser.getTokens().get(2),"X"));
		assertTrue(StringUtils.equals(parser.getTokens().get(3),","));
		assertTrue(StringUtils.equals(parser.getTokens().get(4),"["));
		assertTrue(StringUtils.equals(parser.getTokens().get(5),"X"));
		assertTrue(StringUtils.equals(parser.getTokens().get(6),"|"));
		assertTrue(StringUtils.equals(parser.getTokens().get(7),"_"));
		assertTrue(StringUtils.equals(parser.getTokens().get(8),"]"));
		assertTrue(StringUtils.equals(parser.getTokens().get(9),")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(10),"."));
		
		assertTrue(StringUtils.equals(parser.getTokens().get(11),"member"));
		assertTrue(StringUtils.equals(parser.getTokens().get(12),"("));
		assertTrue(StringUtils.equals(parser.getTokens().get(13),"X"));
		assertTrue(StringUtils.equals(parser.getTokens().get(14),","));
		assertTrue(StringUtils.equals(parser.getTokens().get(15),"["));
		assertTrue(StringUtils.equals(parser.getTokens().get(16),"_"));
		assertTrue(StringUtils.equals(parser.getTokens().get(17),"|"));
		assertTrue(StringUtils.equals(parser.getTokens().get(18),"T"));
		assertTrue(StringUtils.equals(parser.getTokens().get(19),"]"));
		assertTrue(StringUtils.equals(parser.getTokens().get(20),")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(21),":-"));
		
		/*
		_
		|
		T
		]
		)
		:-
		member
		(
		X
		,
		T
		)
		.
		empty_stack
		(
		[
		]
		)
		.
		member_stack
		(
		X
		,
		S
		)
		:-
		member
		(E
		,
		S
		)
		.
		stack
		(
		E
		,
		S
		,
		[
		E
		,
		S
		]
		)
		.
		empty_queue
		(
		[
		]
		)
		.
		member_queue
		(
		E
		,
		S
		)
		:-
		member
		(
		E
		,
		S
		)
		.*/
	}

}
