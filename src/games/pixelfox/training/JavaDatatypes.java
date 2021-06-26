package games.pixelfox.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class JavaDatatypes {
	/**
	 * -150 can be fitted in:
	 * * short
	 * * int
	 * * long
	 * 150000 can be fitted in:
	 * * int
	 * * long
	 * 1500000000 can be fitted in:
	 * * int
	 * * long
	 * 213333333333333333333333333333333333 can't be fitted anywhere.
	 * -100000000000000 can be fitted in:
	 * * long
	 */
	public static void main(final String[] args) {
		final var lines = readLines();
		Arrays.stream(lines)
				.forEach(JavaDatatypes::checkFit);
	}

	private static void checkFit(final String line) {
		final var fits = new ArrayList<>();
		try {
			Long.parseLong(line);
			fits.add("* long");
			Integer.parseInt(line);
			fits.add("* int");
			Short.parseShort(line);
			fits.add("* short");
			Byte.parseByte(line);
			fits.add("* byte");
		} catch (final NumberFormatException ignored) {
		}

		if (fits.isEmpty()) {
			System.out.println(line + " can't be fitted anywhere.");
			return;
		}

		Collections.reverse(fits);
		System.out.println(line + " can be fitted in:");
		fits.stream().forEach(System.out::println);
	}

	private static String[] readLines() {
		try (final var scanner = new Scanner(System.in)) {
			final var lines = new String[Integer.parseInt(scanner.nextLine())];
			for (var i = 0; i < lines.length; i++) {
				lines[i] = scanner.nextLine();
			}
			return lines;
		}
	}
}
