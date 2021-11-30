import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		int num1, num2;
		char operation;
		Scanner sc = new Scanner(System.in);
		System.out.print(
				"Dime que operacion quieres hacer y con que nuemeros.\nSuma: S\nResta: S\nMultiplicación: M\nDivision: D\nOpercion:");

		operation = sc.next().charAt(0);
		if (operation == 'S' || operation == 'R' || operation == 'M' || operation == 'D') {
			System.out.print("Numero1: ");
			num1 = sc.nextInt();
			System.out.print("Numero2: ");
			num2 = sc.nextInt();
			System.out.print("\nEl resutado de la operacion elegida es: " + calculator(operation, num1, num2));
		} else {
			System.out.println("EL caracter introducido no es valido, pruebe otra vez.");
		}

	}

	public static int calculator(char operation, int num1, int num2) {

		if (operation == 'S') {
			return num1 + num2;
		} else if (operation == 'R') {
			return num1 - num2;
		} else if (operation == 'M') {
			return num1 * num2;
		} else {
			return num1 / num2;
		}

	}

}
