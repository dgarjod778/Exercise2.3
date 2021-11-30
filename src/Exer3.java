import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		int num1, num2, type;
		double dou1,dou2;
		char operation;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quires usar numeros enteros(E) o decimales(D).");
		type = sc.next().charAt(0);
		System.out.print(
				"Dime que operacion quieres hacer y con que nuemeros.\nSuma: S\nResta: S\nMultiplicación: M\nDivision: D\nOpercion:");

		operation = sc.next().charAt(0);
		if (operation == 'S' || operation == 'R' || operation == 'M' || operation == 'D') {
			if (type == 'E') {
				System.out.print("Numero1: ");
				num1 = sc.nextInt();
				System.out.print("Numero2: ");
				num2 = sc.nextInt();
			

			System.out.print("\nEl resutado de la operacion elegida es: " + calculator(operation, num1, num2));
			}else {
				System.out.print("Numero1: ");
				dou1 = sc.nextInt();
				System.out.print("Numero2: ");
				dou2 = sc.nextInt();
			

			System.out.print("\nEl resutado de la operacion elegida es: " + calculator(operation, dou1, dou2));
			}

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
	
	public static int calculator(char operation, double dou1, double dou2) {

		if (operation == 'S') {
			return dou1 + dou2;
		} else if (operation == 'R') {
			return dou1 - dou2;
		} else if (operation == 'M') {
			return dou1 * dou2;
		} else {
			return dou1 / dou2;
		}

	}

}
