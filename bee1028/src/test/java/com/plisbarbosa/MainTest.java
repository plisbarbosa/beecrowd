package com.plisbarbosa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * 
 */
public class MainTest {
	@Test
	void shouldPrintCorrectAnswers() {
		assertEquals("4" + System.getProperty("line.separator"), Main.getAnswer("8 12"));
		assertEquals("9" + System.getProperty("line.separator"), Main.getAnswer("9 27"));
		assertEquals("37" + System.getProperty("line.separator"), Main.getAnswer("259 111"));
		assertEquals("10" + System.getProperty("line.separator"), Main.getAnswer("10 11"));
	}
}
