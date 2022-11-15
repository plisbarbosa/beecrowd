package com.plisbarbosa;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	/**
	 * @param input
	 * @return
	 */
	public static String getAnswer(String input) {
		String[] cardsQtysTexts = input.split("\\s");

		int gcd = new BigInteger(cardsQtysTexts[0]).gcd(new BigInteger(cardsQtysTexts[1])).intValue();

		int[] cardsQtys = new int[] { Integer.parseInt(cardsQtysTexts[0]), Integer.parseInt(cardsQtysTexts[1]) };

		int stackHeigth = 0;

		if (gcd > 1) {
			stackHeigth = gcd;
		} else if (cardsQtys[0] <= cardsQtys[1]) {
			stackHeigth = cardsQtys[0];
		} else {
			stackHeigth = cardsQtys[1];
		}

		return stackHeigth + System.getProperty("line.separator");
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
