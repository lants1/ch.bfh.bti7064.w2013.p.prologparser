package ch.bfh.bti7064.parser;

import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Test's the Preprocessor's functionality -> remove whitespaces and invisible things...
 * 
 * @author SwenLanthemann
 *
 */
public class PrologPreprocessorTest {

	@Test
	public void testLineCommentsRemovement() {
		assertTrue(StringUtils.equals(PrologPreprocessor.process("%%%asfdasfdasfsafssfd"),""));
		assertTrue(StringUtils.equals(PrologPreprocessor.process("asfasfda%%%asfdasfdasfsafssfd"),"asfasfda"));
	}
	
	@Test
	public void testWhitespaceRemovement() {
		assertTrue(StringUtils.equals(PrologPreprocessor.process(" a sf    asfd a%%%asfdasfdasfsafssfd"),"asfasfda"));
		assertTrue(StringUtils.equals(PrologPreprocessor.process(" a sf    asfd a% %as %asfdasfdas  fsafssfd"),"asfasfda"));
	}
}