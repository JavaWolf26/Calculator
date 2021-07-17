package Calculator1;

import java.util.Arrays;

public class Massiv {

	static String[] rim = { "null", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
	static String[] arab = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
	static String[] arifmetic = { "+", "-", "*", "/" };

	static int i;

	static int prov_arab(String str) {
		i = Arrays.asList(arab).indexOf(str);
		return i;
	}

	static int prov_rim(String str) {
		i = Arrays.asList(rim).indexOf(str);
		return i;
	}

	static int rechenie(String str, int i1, int i2) {
		if (Arrays.asList(arifmetic).indexOf(str) == 0) {
			i = i1 + i2;
		} else if (Arrays.asList(arifmetic).indexOf(str) == 1) {
			i = i1 - i2;
		} else if (Arrays.asList(arifmetic).indexOf(str) == 2) {
			i = i1 * i2;
		} else if (Arrays.asList(arifmetic).indexOf(str) == 3) {
			i = i1 / i2;
		}
		return i;
	}

	static void ostatok(String str, int i1, int i2) {
		if (i1 % i2 != 0)
			System.out.print("; Ostatoc: " + i1 % i2);
	}
	
}
