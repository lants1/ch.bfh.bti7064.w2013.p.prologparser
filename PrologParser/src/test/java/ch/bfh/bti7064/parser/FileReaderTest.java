package ch.bfh.bti7064.parser;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FileReaderTest {

	@Test
	public void testFillLevelWithElement() {
		FileReader reader = new FileReader("/blocksworld.pl");
		reader.read();
		assertTrue(reader.getProcessedString().length() > 0);
	}

}
