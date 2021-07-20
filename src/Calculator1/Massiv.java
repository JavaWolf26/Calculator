package Calculator1;

import java.util.Arrays;

public class Massiv {

	static final String[] rim = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
	static final String[] arab = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
	static final String[] arifmetic = { "+", "-", "*", "/" };

	static String result;
	static String str1;
	static String str2;
	static int i;
	static boolean prov;
	
	static boolean prov_arab(String str1, String str2, String str3) {
		if(Arrays.asList(arab).contains(str1) && Arrays.asList(arab).contains(str2)
				&& Arrays.asList(arifmetic).contains(str3)) {
			prov = true;
		}
		return prov;
	}
	
	static boolean prov_rim(String str1, String str2, String str3) {
		if(Arrays.asList(rim).contains(str1) && Arrays.asList(rim).contains(str2)
				&& Arrays.asList(arifmetic).contains(str3)) {
			prov = true;
		}
		return prov;
	}	
			
	static int arab(String str) {
		i = Arrays.asList(arab).indexOf(str);
		return i;
	}

	static int rim(String str) {
		i = Arrays.asList(rim).indexOf(str);
		return i;
	}

	static int rechenie(String str, int i1, int i2) throws Exception {

		if (Arrays.asList(arifmetic).indexOf(str) == 0) {
			i = i1 + i2;
		} else if (Arrays.asList(arifmetic).indexOf(str) == 1) {
			try {
				if (i1 < i2)
					throw new Exception(str);
				i = i1 - i2;
			} catch (Exception e) {
				System.out.print("Umen'shaemoe men'she vi4itaemogo. "
						+ "Poprobujte drugoe arifmeti4eskoe virazenie.");
				System.exit(0);
			}
		} else if (Arrays.asList(arifmetic).indexOf(str) == 2) {
			i = i1 * i2;
		} else if (Arrays.asList(arifmetic).indexOf(str) == 3) {
			try {
				if (i1 < i2)
				throw new Exception(str);
				i = i1 / i2;
			} catch (Exception e) {
				System.out.print("Delimoe men'she delitela. "
						+ "Poprobujte drugoe arifmeti4eskoe virazenie.");
				System.exit(0);
			}
		}
		return i;
	}

	static void ostatok_arab(String str, int i1, int i2) {
		if (i1 % i2 != 0) 
			System.out.print("; Ostatoc: " + i1 % i2);
	}	
	
	static void ostatok_rim(String str, int i1, int i2) {
		if (i1 % i2 != 0) {
			i = i1 % i2;
			System.out.print("; Ostatoc: " + otvet_rim(i));
		}
	}
	
	static String otvet_rim(int r) {
		if(r>0&&r<10) {
			str1 = "";
			str2 = rim[i];
		}else if(r>=10&&r<20) {
			str1 = "X";
			i = r-10;
			str2 = rim[i];
		}else if(r>=20&&r<30) {
			str1 = "XX";
			i = r-20;
			str2 = rim[i];
		}else if(r>=30&&r<40) {
			str1 = "XXX";
			i = r-30;
			str2 = rim[i];
		}else if(r>=40&&r<50) {
			str1 = "XL";
			i = r-40;
			str2 = rim[i];
		}else if(r>=50&&r<60) {
			str1 = "L";
			i = r-50;
			str2 = rim[i];
		}else if(r>=60&&r<70) {
			str1 = "LX";
			i = r-60;
			str2 = rim[i];
		}else if(r>=70&&r<80) {
			str1 = "LXX";
			i = r-70;
			str2 = rim[i];
		}else if(r>=80&&r<90) {
			str1 = "LXXX";
			i = r-80;
			str2 = rim[i];
		}
		result=str1+str2;
		return result;
	}
	
}
