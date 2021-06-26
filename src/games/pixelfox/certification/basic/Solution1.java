package games.pixelfox.certification.basic;

import java.util.Scanner;

class Comparator {
	public boolean compare(final String s1, final String s2) {
		return s1.equals(s2);
	}

	public boolean compare(final int i1, final int i2) {
		return i1 == i2;
	}

	public boolean compare(final int[] array1, final int[] array2) {
		if (array1.length != array2.length) return false;
		for (int i = 0; i < array1.length; i++)
			if (array1[i] != array2[i])
				return false;
		return true;
	}
}

class Solution1 {
	public static void main(final String[] args) {
		final Scanner scan = new Scanner(System.in);
		final Comparator comp = new Comparator();

		int testCases = Integer.parseInt(scan.nextLine());
		while (testCases-- > 0) {
			int condition = Integer.parseInt(scan.nextLine());
			switch (condition) {
				case 1:
					final String s1 = scan.nextLine().trim();
					final String s2 = scan.nextLine().trim();
					System.out.println((comp.compare(s1, s2)) ? "Same" : "Different");
					break;
				case 2:
					final int num1 = scan.nextInt();
					final int num2 = scan.nextInt();

					System.out.println((comp.compare(num1, num2)) ? "Same" : "Different");
					if (scan.hasNext()) scan.nextLine();
					break;
				case 3:
					int[] array1 = new int[scan.nextInt()];
					int[] array2 = new int[scan.nextInt()];
					for (int i = 0; i < array1.length; i++) array1[i] = scan.nextInt();
					for (int i = 0; i < array2.length; i++) array2[i] = scan.nextInt();

					System.out.println(comp.compare(array1, array2) ? "Same" : "Different");
					if (scan.hasNext()) scan.nextLine();
					break;
				default:
					System.err.println("Invalid input.");
			}
		}
		scan.close();
	}
}
