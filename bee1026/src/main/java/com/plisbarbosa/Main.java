package com.plisbarbosa;

import java.util.Scanner;

public class Main {
	/**
	 * @param x
	 * @return
	 */
	public static String generateAnswer(int x) {
		return x + System.getProperty("line.separator");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();

		int b = scanner.nextInt();

		scanner.close();

		System.out.print(generateAnswer(doLogicalOperationEclusiveOr(a, b)));
	}

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public static int doLogicalOperationEclusiveOr(int a, int b) {
		return a ^ b;
	}
}
