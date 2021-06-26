package games.pixelfox.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoops1 {
	public static void main(final String[] args) {
		try {
			final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			final int N = Integer.parseInt(bufferedReader.readLine().trim());

			for (int i = 1; i <= 10; i++)
				System.out.println(N + " x " + i + " = " + N * i);

			bufferedReader.close();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
