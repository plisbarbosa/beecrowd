package com.plisbarbosa;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	/**
	 * @param input
	 * @return
	 */
	public static String getAnswer(String input) {
		String inputWithoutSpaces = input.replaceAll("\\s", "");

		String opCharacter = inputWithoutSpaces.replaceAll("\\d", "").substring(1, 2);

		String[] numbers = inputWithoutSpaces.split("\\D");

		// numerators[2] = result; numerators[3] = simplified result
		int[] numerators = new int[] { Integer.parseInt(numbers[0]), Integer.parseInt(numbers[2]), 0, 0 };

		// denominators[2] = result; denominators[3] = simplified result
		int[] denominators = new int[] { Integer.parseInt(numbers[1]), Integer.parseInt(numbers[3]), 0, 0 };

		// Calculation
		switch (opCharacter) {
			case "+":
				numerators[2] = numerators[0] * denominators[1] + numerators[1] * denominators[0];

				denominators[2] = denominators[0] * denominators[1];

				break;
			case "-":
				numerators[2] = numerators[0] * denominators[1] - numerators[1] * denominators[0];

				denominators[2] = denominators[0] * denominators[1];

				break;
			case "*":
				numerators[2] = numerators[0] * numerators[1];

				denominators[2] = denominators[0] * denominators[1];

				break;
			case "/":
				numerators[2] = numerators[0] * denominators[1];

				denominators[2] = numerators[1] * denominators[0];

				break;
		}

		// Simplification
		int gcd = new BigInteger(Integer.toString(numerators[2])).gcd(new BigInteger(Integer.toString(denominators[2])))
				.intValue();

		if (gcd > 1) {
			numerators[3] = numerators[2] / gcd;

			denominators[3] = denominators[2] / gcd;
			// Avoid division by 0.
		} else {
			numerators[3] = numerators[2];

			denominators[3] = denominators[2];
		}

		return numerators[2] + "/" + denominators[2] + " = " + numerators[3] + "/" + denominators[3]
				+ System.getProperty("line.separator");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String input = scanner.nextLine();

			int linesQty = Integer.valueOf(input);

			for (int i = 1; i <= linesQty; i++) {
				input = scanner.nextLine();

				System.out.print(getAnswer(input));
			}
		}

		scanner.close();
	}
}
