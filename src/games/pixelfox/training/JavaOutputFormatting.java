package games.pixelfox.training;

import java.util.Scanner;

public class JavaOutputFormatting {
	/**
	 * INPUT
	 * java 100
	 * cpp 65
	 * python 50
	 * <p>
	 * OUTPUT
	 * ================================
	 * java           100
	 * cpp            065
	 * python         050
	 * ================================
	 * <p>
	 * EXPLANATION
	 * Each String is left-justified with trailing whitespace through the first 15 characters.
	 * The leading digit of the integer is the 16 character, and each integer that was less than
	 * 3 digits now has leading zeroes.
	 */
	public static void main(final String[] args) {
		try (final Scanner scanner = new Scanner(System.in)) {
			final String[] line1 = scanner.nextLine().split(" ");
			final String[] line2 = scanner.nextLine().split(" ");
			final String[] line3 = scanner.nextLine().split(" ");

			System.out.println("================================");
			System.out.printf("%-14s %03d%n", line1[0], Integer.parseInt(line1[1]));
			System.out.printf("%-14s %03d%n", line2[0], Integer.parseInt(line2[1]));
			System.out.printf("%-14s %03d%n", line3[0], Integer.parseInt(line3[1]));
			System.out.println("================================");
		}
	}
}
