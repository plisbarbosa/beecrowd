package com.plisbarbosa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * 
 */
public class MainTest {
	@Test
	void shouldPrintCorrectAnswers() {
		assertEquals("10/8 = 5/4" + System.getProperty("line.separator"), Main.getAnswer("1 / 2 + 3 / 4"));
		assertEquals("-2/8 = -1/4" + System.getProperty("line.separator"), Main.getAnswer("1 / 2 - 3 / 4"));
		assertEquals("12/18 = 2/3" + System.getProperty("line.separator"), Main.getAnswer("2 / 3 * 6 / 6"));
		assertEquals("4/6 = 2/3" + System.getProperty("line.separator"), Main.getAnswer("1 / 2 / 3 / 4"));
		assertEquals("220/330 = 2/3" + System.getProperty("line.separator"), Main.getAnswer("22 / 10 * 10 / 33"));
	}
}
