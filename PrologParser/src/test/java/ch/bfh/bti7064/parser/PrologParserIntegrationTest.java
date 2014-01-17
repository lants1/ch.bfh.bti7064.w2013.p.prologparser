package ch.bfh.bti7064.parser;

import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Test's the combination FileReader>PrologPreprocessor>Prologparser --> output
 * 
 * @author Swen Lanthemann
 * 
 */
public class PrologParserIntegrationTest {
	@Test
	public void testAccordingToParsedOutput() {
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
		System.out.println(parser.getTokens().get(29));
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
		assertTrue(StringUtils.equals(parser.getTokens().get(37), "X"));
		assertTrue(StringUtils.equals(parser.getTokens().get(38), ","));
		assertTrue(StringUtils.equals(parser.getTokens().get(39), "S"));
		assertTrue(StringUtils.equals(parser.getTokens().get(40), ")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(41), ":-"));
		assertTrue(StringUtils.equals(parser.getTokens().get(42), "member"));
		assertTrue(StringUtils.equals(parser.getTokens().get(43), "(E"));
		assertTrue(StringUtils.equals(parser.getTokens().get(44), ","));
		assertTrue(StringUtils.equals(parser.getTokens().get(45), "S"));
		assertTrue(StringUtils.equals(parser.getTokens().get(46), ")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(47), "."));
		assertTrue(StringUtils.equals(parser.getTokens().get(48), "stack"));
		assertTrue(StringUtils.equals(parser.getTokens().get(49), "("));
		assertTrue(StringUtils.equals(parser.getTokens().get(50), "E"));
		assertTrue(StringUtils.equals(parser.getTokens().get(51), ","));
		assertTrue(StringUtils.equals(parser.getTokens().get(52), "S"));
		assertTrue(StringUtils.equals(parser.getTokens().get(53), ","));
		assertTrue(StringUtils.equals(parser.getTokens().get(54), "["));
		assertTrue(StringUtils.equals(parser.getTokens().get(55), "E"));
		assertTrue(StringUtils.equals(parser.getTokens().get(56), ","));
		assertTrue(StringUtils.equals(parser.getTokens().get(57), "S"));
		assertTrue(StringUtils.equals(parser.getTokens().get(58), "]"));
		assertTrue(StringUtils.equals(parser.getTokens().get(59), ")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(60), "."));
		assertTrue(StringUtils
				.equals(parser.getTokens().get(61), "empty_queue"));
		assertTrue(StringUtils.equals(parser.getTokens().get(62), "("));
		assertTrue(StringUtils.equals(parser.getTokens().get(63), "["));
		assertTrue(StringUtils.equals(parser.getTokens().get(64), "]"));
		assertTrue(StringUtils.equals(parser.getTokens().get(65), ")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(66), "."));
		assertTrue(StringUtils.equals(parser.getTokens().get(67),
				"member_queue"));
		assertTrue(StringUtils.equals(parser.getTokens().get(68), "("));
		assertTrue(StringUtils.equals(parser.getTokens().get(69), "E"));
		assertTrue(StringUtils.equals(parser.getTokens().get(70), ","));
		assertTrue(StringUtils.equals(parser.getTokens().get(71), "S"));
		assertTrue(StringUtils.equals(parser.getTokens().get(72), ")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(73), ":-"));
		assertTrue(StringUtils.equals(parser.getTokens().get(74), "member"));
		assertTrue(StringUtils.equals(parser.getTokens().get(75), "("));
		assertTrue(StringUtils.equals(parser.getTokens().get(76), "E"));
		assertTrue(StringUtils.equals(parser.getTokens().get(77), ","));
		assertTrue(StringUtils.equals(parser.getTokens().get(78), "S"));
		assertTrue(StringUtils.equals(parser.getTokens().get(79), ")"));
		assertTrue(StringUtils.equals(parser.getTokens().get(80), "."));
	}

}
