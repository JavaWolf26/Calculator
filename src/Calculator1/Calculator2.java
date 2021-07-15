package Calculator1;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) throws java.io.IOException {

		Scanner keyboard = new Scanner(System.in);
		int Num1 = 0;
		int Num2 = 0;
		String Operation = null;

		System.out.print("Vvedite pervoe 4islo ot 0 do 9: ");
		try {
			Num1 = keyboard.nextInt();
			if (Num1 < 0 || Num1 > 9) {
				System.out.print("Nevernoe 4islo");
			} else if (Num1 >= 0 && Num1 < 10) {
				{
					System.out.print("Vvedite vtoroe 4islo ot 0 do 9: ");
					Num2 = keyboard.nextInt();
				}
				if (Num2 < 0 || Num2 > 9) {
					System.out.print("Nevernoe 4islo!");
				} else if (Num2 >= 0 && Num2 < 10) {
					{
						System.out.println("Vvedite arifmeti4eskuu operaciu:");
						System.out.print("'+', '-', '*', '/' ");
						Operation = keyboard.next();
						if (Operation.equals("+")) {
							int NumRez = Num1 + Num2;
							System.out.println(NumRez);
						} else if (Operation.equals("-")) {
							int NumRez = Num1 - Num2;
							System.out.println(NumRez);
						} else if (Operation.equals("*")) {
							int NumRez = Num1 * Num2;
							System.out.println(NumRez);
						} else if (Operation.equals("/")) {
							try {
								int NumRez = Num1 / Num2;
								if (Num1 % Num2 == 0) {
									System.out.print(NumRez);
								} else {
									System.out.print(NumRez + "; ");
									System.out.print("Ostatoc: " + Num1 % Num2);
								}
							} catch (ArithmeticException e) {
								System.out.println("Delit' na 0 nelza!");
							}
						} else
							System.out.print("Neverna' operacia");
					}
				}
			}
		} catch (Exception e) {
			System.out.print("Neobhodimo vvesti 4islo");
		}
		keyboard.close();
	}
}
