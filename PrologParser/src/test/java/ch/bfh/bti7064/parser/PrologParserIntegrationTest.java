package ch.bfh.bti7064.parser;

import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import ch.bfh.bti7064.parser.core.FileReader;
import ch.bfh.bti7064.parser.core.PrologParser;

/**
 * Test's the combination FileReader>PrologPreprocessor>Prologparser --> output
 * 
 * @author Swen Lanthemann
 * 
 */
public class PrologParserIntegrationTest {
	
	@Test
	public void testAccordingToParsedOutput() {
		// Soloution handout from teacher was wrong so 
		// i need to change the solution to the correct one...
		FileReader reader = new FileReader("/blocksworld.pl");
		reader.read();
		PrologParser parser = new PrologParser(reader.getProcessedString());
		parser.parse();
		
		assertTrue(StringUtils.equals(parser.getTokens().get(0), "member"));
		assertTrue(StringUtils.equals(parser.getTokens().get(1), "("));
		assertTrue(StringUtils.equals(parser.getTokens().get(2), "X"));
		assertTrue(StringUtils.equals(parser.getTokens().get(3), ","));
		assertTrue(StringUtils.equals(parser.getTokens().get(4), "["));
		assertTrue(StringUtils.equals(parser.getTokens().get(5), "X"));
		assertTrue(StringUtils.equals(parser.getTokens().get(6), "|"));
		assertTrue(StringUtils.equals(parser.getTokens().get(7), "_"));
		assertTrue(StringUtils.equals(parser.getTokens().get(8), "]"));
		assertTrue(StringUtils.equals(parser.getTokens().get(9), ")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(10), "."));

		assertTrue(StringUtils.equals(parser.getTokens().get(11), "member"));
		assertTrue(StringUtils.equals(parser.getTokens().get(12), "("));
		assertTrue(StringUtils.equals(parser.getTokens().get(13), "X"));
		assertTrue(StringUtils.equals(parser.getTokens().get(14), ","));
		assertTrue(StringUtils.equals(parser.getTokens().get(15), "["));
		assertTrue(StringUtils.equals(parser.getTokens().get(16), "_"));
		assertTrue(StringUtils.equals(parser.getTokens().get(17), "|"));
		assertTrue(StringUtils.equals(parser.getTokens().get(18), "T"));
		assertTrue(StringUtils.equals(parser.getTokens().get(19), "]"));
		assertTrue(StringUtils.equals(parser.getTokens().get(20), ")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(21), ":-"));

		assertTrue(StringUtils.equals(parser.getTokens().get(22), "member"));
		assertTrue(StringUtils.equals(parser.getTokens().get(23), "("));
		assertTrue(StringUtils.equals(parser.getTokens().get(24), "X"));
		assertTrue(StringUtils.equals(parser.getTokens().get(25), ","));
		assertTrue(StringUtils.equals(parser.getTokens().get(26), "T"));
		assertTrue(StringUtils.equals(parser.getTokens().get(27), ")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(28), "."));
		assertTrue(StringUtils
				.equals(parser.getTokens().get(29), "empty_stack"));
		assertTrue(StringUtils.equals(parser.getTokens().get(30), "("));
		assertTrue(StringUtils.equals(parser.getTokens().get(31), "["));
		assertTrue(StringUtils.equals(parser.getTokens().get(32), "]"));
		assertTrue(StringUtils.equals(parser.getTokens().get(33), ")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(34), "."));
		assertTrue(StringUtils.equals(parser.getTokens().get(35),
				"member_stack"));
		assertTrue(StringUtils.equals(parser.getTokens().get(36), "("));
		assertTrue(StringUtils.equals(parser.getTokens().get(37), "E"));
		assertTrue(StringUtils.equals(parser.getTokens().get(38), ","));
		assertTrue(StringUtils.equals(parser.getTokens().get(39), "S"));
		assertTrue(StringUtils.equals(parser.getTokens().get(40), ")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(41), ":-"));
		assertTrue(StringUtils.equals(parser.getTokens().get(42), "member"));
		assertTrue(StringUtils.equals(parser.getTokens().get(43), "("));
		assertTrue(StringUtils.equals(parser.getTokens().get(44), "E"));
		assertTrue(StringUtils.equals(parser.getTokens().get(45), ","));
		assertTrue(StringUtils.equals(parser.getTokens().get(46), "S"));
		assertTrue(StringUtils.equals(parser.getTokens().get(47), ")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(48), "."));
		assertTrue(StringUtils.equals(parser.getTokens().get(49), "stack"));
		assertTrue(StringUtils.equals(parser.getTokens().get(50), "("));
		assertTrue(StringUtils.equals(parser.getTokens().get(51), "E"));
		assertTrue(StringUtils.equals(parser.getTokens().get(52), ","));
		assertTrue(StringUtils.equals(parser.getTokens().get(53), "S"));
		assertTrue(StringUtils.equals(parser.getTokens().get(54), ","));
		assertTrue(StringUtils.equals(parser.getTokens().get(55), "["));
		assertTrue(StringUtils.equals(parser.getTokens().get(56), "E"));
System.out.println(parser.getTokens().get(57));
		assertTrue(StringUtils.equals(parser.getTokens().get(57), "|"));
		assertTrue(StringUtils.equals(parser.getTokens().get(58), "S"));
		assertTrue(StringUtils.equals(parser.getTokens().get(59), "]"));
		assertTrue(StringUtils.equals(parser.getTokens().get(60), ")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(61), "."));
		assertTrue(StringUtils
				.equals(parser.getTokens().get(62), "empty_queue"));
		assertTrue(StringUtils.equals(parser.getTokens().get(63), "("));
		assertTrue(StringUtils.equals(parser.getTokens().get(64), "["));
		assertTrue(StringUtils.equals(parser.getTokens().get(65), "]"));
		assertTrue(StringUtils.equals(parser.getTokens().get(66), ")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(67), "."));
		assertTrue(StringUtils.equals(parser.getTokens().get(68),
				"member_queue"));
		assertTrue(StringUtils.equals(parser.getTokens().get(69), "("));
		assertTrue(StringUtils.equals(parser.getTokens().get(70), "E"));
		assertTrue(StringUtils.equals(parser.getTokens().get(71), ","));
		assertTrue(StringUtils.equals(parser.getTokens().get(72), "S"));
		assertTrue(StringUtils.equals(parser.getTokens().get(73), ")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(74), ":-"));
		assertTrue(StringUtils.equals(parser.getTokens().get(75), "member"));
		assertTrue(StringUtils.equals(parser.getTokens().get(76), "("));
		assertTrue(StringUtils.equals(parser.getTokens().get(77), "E"));
		assertTrue(StringUtils.equals(parser.getTokens().get(78), ","));
		assertTrue(StringUtils.equals(parser.getTokens().get(79), "S"));
		assertTrue(StringUtils.equals(parser.getTokens().get(80), ")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(81), "."));
	}

}
