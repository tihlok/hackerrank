package games.pixelfox.training;

import java.util.Arrays;
import java.util.Scanner;

public class JavaLoops2 {
	public static void main(String[] args) {
		try (final var scanner = new Scanner(System.in)) {
			final var linesAmount = Integer.parseInt(scanner.nextLine());
			final var lines = new int[linesAmount][3];
			for (var i = 0; i < linesAmount; i++) {
				final var line = scanner.nextLine().split(" ");
				lines[i][0] = Integer.parseInt(line[0]);
				lines[i][1] = Integer.parseInt(line[1]);
				lines[i][2] = Integer.parseInt(line[2]);
			}

			Arrays.stream(lines)
					.map(line -> calculate(line[0], line[1], line[2]))
					.forEach(values -> {
						for (var value : values)
							System.out.print(value + " ");
						System.out.println();
					});
		}
	}

	private static int[] calculate(final int a, final int b, final int n) {
		return calculate(a, b, n, 1, new int[n]);
	}

	private static int[] calculate(final int a, final int b, final int n, final int pow, final int[] numbers) {
		numbers[pow - 1] = a + calculateNext(1, b, pow);
		if (pow < n) return calculate(a, b, n, pow + 1, numbers);
		return numbers;
	}

	private static int calculateNext(final int multiplier, final int b, final int pow) {
		if (multiplier <= pow)
			return ((int) Math.pow(2, multiplier - 1) * b) + calculateNext(multiplier + 1, b, pow);
		return 0;
	}
}
