package com.plisbarbosa;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main {
	/**
	 * @param x
	 * @return
	 */
	public static String generateAnswer(int x) {
		return "X = " + x + System.getProperty("line.separator");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();

		int b = scanner.nextInt();

		scanner.close();

		System.out.print(generateAnswer(sum(a, b)));
	}

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public static int sum(int a, int b) {
		return a + b;
	}
}
