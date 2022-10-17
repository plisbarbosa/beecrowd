package com.plisbarbosa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * 
 */
public class Bee1001Test {
	@Test
	void shouldPrintCorrectAnswers() {
		assertEquals("X = 19" + System.getProperty("new.line"), Bee1001.generateAnswer(Bee1001.sum(10, 9)));
		assertEquals("X = -6" + System.getProperty("new.line"), Bee1001.generateAnswer(Bee1001.sum(-10, 4)));
		assertEquals("X = 8" + System.getProperty("new.line"), Bee1001.generateAnswer(Bee1001.sum(15, -7)));
	}
}
