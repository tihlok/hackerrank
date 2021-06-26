package games.pixelfox.certification.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Solution3 {
	public static void main(final String[] args) {
		// 1.
		final Map<String, String> hashMap = new HashMap<>();
		final Map<String, String> treeMap = new TreeMap<>();

		// 2.
		final int mask = 0x000F;
		final int value = 0x2222;
		System.out.println(value & mask);

		// 3.
		try {
			final Float f = new Float("3.0");
			final int i = f.intValue();
			final byte b = f.byteValue();
			final double d = f.doubleValue();
			System.out.println(i + b + d);
		} catch (final NumberFormatException e) {
			System.out.println("bad number");
		}
	}
}
 // /* COMMENT */
