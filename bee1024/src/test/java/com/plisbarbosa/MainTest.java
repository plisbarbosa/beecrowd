package com.plisbarbosa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * 
 */
public class MainTest {
	@Test
	void shouldPrintCorrectAnswers() {
		String output = Main.encryptLetters("Texto #3");

		assertEquals("Wh{wr #3", output);

		output = Main.reverseString(output);

		assertEquals("3# rw{hW", output);

		output = Main.encryptLastHalf(output);

		assertEquals("3# rvzgV", output);
	}
}
