package Calculator1;

import java.util.Arrays;

public class Calculator extends Massiv {

	public static void main(String[] args) {

		System.out.println("Vvedite arifmeti4eskoe virazenie,");
		System.out.println("neobhodimi arabskie 4isla ot 0 do 9");
		System.out.println("ili rimskie 4isla ot I do IX");
		System.out.println("i arifmeti4eskie operacii +, -, * ili /.");
		System.out.println("Vvedite 4isla i operacii 4erez probel:");

		Consol s = new Consol();
		String str1 = s.scan();
		String arif = s.scan();
		String str2 = s.scan();

		int i1;
		int i2;
		int result;

		try {
			if (Arrays.asList(arab).contains(str1) && Arrays.asList(arab).contains(str2)
					&& Arrays.asList(arifmetic).contains(arif)) {
				i1 = prov_arab(str1);
				i2 = prov_arab(str2);
				result = rechenie(arif, i1, i2);
				System.out.print(result);
				if (Arrays.asList(arifmetic).indexOf(arif) == 3)
					ostatok(arif, i1, i2);
			} else if (Arrays.asList(rim).contains(str1) && Arrays.asList(rim).contains(str2)
					&& Arrays.asList(arifmetic).contains(arif)) {
				i1 = prov_rim(str1);
				i2 = prov_rim(str2);
				result = rechenie(arif, i1, i2);
				System.out.print(result);
				if (Arrays.asList(arifmetic).indexOf(arif) == 3)
					ostatok(arif, i1, i2);
			} else
				System.out.println("Nevernii format arifmeti4eskogo virazenia");
		} catch (ArithmeticException e) {
			System.out.println("Delit' na 0 nelza!");
		}

	}
	
}