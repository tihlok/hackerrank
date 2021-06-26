package games.pixelfox.certification.basic;

import java.util.Scanner;

interface Calculator {
	int add(final int a, final int b);
}

class Adder implements Calculator {
	public int add(final int a, final int b) {
		return a + b;
	}
}

class Solution2 {
	public static void main(final String[] args) {
		try (final Scanner scan = new Scanner(System.in)) {
			final int a = scan.nextInt();
			final int b = scan.nextInt();

			final Calculator adderObject = new Adder();
			System.out.println("The sum is: " + adderObject.add(a, b));
		}
	}
}
