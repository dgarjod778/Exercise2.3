import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un número y te dire si es primo o no: ");
		num = sc.nextInt();
		if ((primo(num) == true)) {
			System.out.println("El número el numero es primo");
		} else {
			System.out.println("El número no es primo");
		}
		
		//muchosPrimos();
		descomponerNumero(num);
		
	}
//Apartado1-->Decir si un número es primo.
	
	
	public static Boolean primo(int num) {
		int divisor = num-1;
		if (num == 2 || num == 1) {//compruebo que no es ni 1 ni 2.
			return true;
		}else {
			while ((num % divisor != 0) && (divisor > 1)) {//Voy comprobando numero a numero si se puede dividir con otro numero distinto a 1 y si mismo.
				divisor--;
			}

			if (divisor == 1) {
				return true;
			} else {
				return false;
			}
		}


	}
	
	//Apartado2-->Decir Todos los numeros impares del uno al 10000.
	
	public static String muchosPrimos() {
		int i;
		for(i=1;i<=10000;i++) {
			if ((primo(i) == true)) {//llama a la funcion primo para comprobar si un numero es primo, si
				System.out.printf("\nEl numero %d es primo",i);
			}else {
				System.out.printf("\nEl numero %d no es primo",i);
			}
		}
		
		return null;
	}
	
	public static String descomponerNumero(int num) {
		int divisor=2;
		while((primo(num))==false){
			if (num%divisor==0) {
				System.out.println(divisor);
				num=num/divisor;
			}else {
				divisor++;
			}
		}
	
		System.out.println(num);	
//		do {
//			if (num%divisor==0) {
//				System.out.println(divisor);
//				num=num/divisor;
//			}else {
//				divisor++;
//			}
//		}while((primo(num))==false);
//	
//		System.out.println(divisor);
		
		return null;
	}
	
	//Apartado3-->descomponer un número en numeros primos.
}
