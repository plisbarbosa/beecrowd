package com.plisbarbosa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * 
 */
public class MainTest {
	@Test
	void shouldPrintCorrectAnswers() {
		assertEquals("2" + System.getProperty("line.separator"),
				Main.generateAnswer(Main.doExclusiveOr(4, 6)));
		assertEquals("15" + System.getProperty("line.separator"),
				Main.generateAnswer(Main.doExclusiveOr(6, 9)));
	}
}
