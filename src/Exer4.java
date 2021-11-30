import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime dos números enteros y te dire el mcd\nNumero1: ");
		num1 = sc.nextInt();
		System.out.print("\nNumero2: ");
		num2 = sc.nextInt();

		System.out.println("El resultado es: " + mcd(num1, num2));

	}

	public static int mcd(int num1, int num2) {
		int rest1, rest2, min, numG, munP;
		/*
		 * if(num1<num2){ mun1=munG; mun2=munP;
		 * 
		 * }else{ mun2=numG; mun1=munP; } munP=min;
		 */
		min=Math.min(num1, num2);
		
		do {
			rest1 = num1 % min;
			rest2 = num2 % min;
			min--;
		} while (rest1 != 0 || rest2 != 0);// La unica manera que se salga del bucle es que los dos sean 0.

		return min+1;

	}
}
