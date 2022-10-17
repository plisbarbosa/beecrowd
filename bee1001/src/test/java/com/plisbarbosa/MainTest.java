package com.plisbarbosa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * 
 */
public class MainTest {
	@Test
	void shouldPrintCorrectAnswers() {
		assertEquals("X = 19" + System.getProperty("line.separator"), Main.generateAnswer(Main.sum(10, 9)));
		assertEquals("X = -6" + System.getProperty("line.separator"), Main.generateAnswer(Main.sum(-10, 4)));
		assertEquals("X = 8" + System.getProperty("line.separator"), Main.generateAnswer(Main.sum(15, -7)));
	}
}
