package com.plisbarbosa;

import java.util.Scanner;

public class Main {
	/**
	 * @param x
	 * @return
	 */
	public static String generateAnswer(long x) {
		return x + System.getProperty("line.separator");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			System.out.print(generateAnswer(doExclusiveOr(scanner.nextLong(), scanner.nextLong())));
		}

		scanner.close();
	}

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public static long doExclusiveOr(long a, long b) {
		return a ^ b;
	}
}
