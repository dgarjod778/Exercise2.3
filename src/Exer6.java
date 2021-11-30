import java.util.Scanner;

public class Exer6 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println(fibonachi(num));

	}

	public static int fibonachi(int num) {
		int i, resultado = 1, num1 = 0, num2 = 1;
		System.out.println(num1);
		for (i = 1; i < num; i++) {
			System.out.println(resultado);
			resultado = num1 + num2;
			num1 = num2;
			num2 = resultado;

		}

		return resultado;
	}
}
