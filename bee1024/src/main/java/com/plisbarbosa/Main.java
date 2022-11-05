package com.plisbarbosa;

import java.util.Scanner;

public class Main {
	/**
	 * @param text
	 * @return
	 */
	public static String encryptLastHalf(String text) {
		char[] encryptedCharacters = text.toCharArray();

		int length = encryptedCharacters.length;

		// Last half
		for (int i = length / 2; i < length; i++) {
			int characterDecimal = encryptedCharacters[i];

			characterDecimal--;

			encryptedCharacters[i] = (char) characterDecimal;
		}

		return new String(encryptedCharacters);
	}

	/**
	 * @param text
	 * @return
	 */
	public static String encryptLetters(String text) {
		char[] encryptedCharacters = text.toCharArray();

		int length = encryptedCharacters.length;

		for (int i = 0; i < length; i++) {
			int characterDecimal = encryptedCharacters[i];

			// Capital letters
			if ((characterDecimal >= 65 && characterDecimal <= 90)
					// Small letters
					|| (characterDecimal >= 97 && characterDecimal <= 122)) {
				characterDecimal = characterDecimal + 3;

				encryptedCharacters[i] = (char) characterDecimal;
			}
		}

		return new String(encryptedCharacters);
	}

	/**
	 * @param text
	 * @return
	 */
	public static String getAnswer(String text) {
		return text + System.getProperty("line.separator");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String input = scanner.nextLine();

			if (input.chars().allMatch(character -> Character.isDigit(character))) {
				int linesNumber = Integer.valueOf(input);

				for (int i = 1; i <= linesNumber; i++) {
					String text = scanner.nextLine();

					text = encryptLetters(text);

					text = reverseString(text);

					text = encryptLastHalf(text);

					System.out.print(getAnswer(text));
				}
			}
		}

		scanner.close();
	}

	/**
	 * @param text
	 * @return
	 */
	public static String reverseString(String text) {
		return new StringBuilder(text).reverse().toString();
	}
}
