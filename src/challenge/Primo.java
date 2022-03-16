package challenge;

import java.util.Scanner;

public class Primo {
	/*
	 * 1. Pide un número por teclado e indica si es un número primo o no. Un número
	 * primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25
	 * no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa un numero: ");
		int numero = sc.nextInt();
		boolean esPrimo = true;
		int divisor = 2;
		// todos los divisibles por 2 menos el 2, no son primos.
		while ((esPrimo) && (divisor != numero)) {
			if (numero % divisor == 0) {
				esPrimo = false;
				System.out.println("no es primo");
			} else {
				divisor++;
			}
		}
		System.out.println("es primo");

	}

}
