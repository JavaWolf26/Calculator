package Calculator1;

import java.util.Arrays;

public class Calculator extends Massiv {
	
	public static void main(String[] args) throws Exception {

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
		String result_rim;

		try {
			if(prov_arab(str1, str2, arif)) {
				i1 = arab(str1);
				i2 = arab(str2);
				result = rechenie(arif, i1, i2);
				System.out.print(result);
				if (Arrays.asList(arifmetic).indexOf(arif) == 3)
					ostatok_arab(arif, i1, i2);
			} else if (prov_rim(str1, str2, arif)) {
				i1 = rim(str1);
				i2 = rim(str2);
				result = rechenie(arif, i1, i2);
				result_rim = otvet_rim(result);
				System.out.print(result_rim);
				if (Arrays.asList(arifmetic).indexOf(arif) == 3)
					ostatok_rim(arif, i1, i2);
			} else
				System.out.println("Nevernii format arifmeti4eskogo virazenia");
		} catch (ArithmeticException e) {
			System.out.println("Delit' na 0 nelza!");
		}
	}	
}
