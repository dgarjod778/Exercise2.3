import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		int num1, num2;

		Scanner sc = new Scanner(System.in);
		System.out.print("Dime dos numeros para cualcular la potencia\nBase: ");
		num1 = sc.nextInt();
		System.out.print("Exponente: ");
		num2 = sc.nextInt();
		System.out.println("El resultado es: " + potencia(num1, num2));

	}

	static int potencia(int num1, int num2) {
		int i, constante=num1; 
		for(i=num2;i>1;i--){
			num1 = num1 * constante;
			num2--;
		}

		return num1;
	}

}
