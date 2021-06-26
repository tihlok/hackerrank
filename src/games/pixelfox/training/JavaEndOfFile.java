package games.pixelfox.training;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaEndOfFile {
	public static void main(final String[] args) {
		try (final var scanner = new Scanner(System.in)) {
			final var lines = new ArrayList<>();
			while (scanner.hasNext()) {
				lines.add(scanner.nextLine());
			}

			for (var i = 0; i < lines.size(); i++) {
				System.out.println((i + 1) + " " + lines.get(i));
			}
		}
	}
}
