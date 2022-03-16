package challenge;

import java.util.Random;
import java.util.Scanner;

public class Aleatorio {

	public static void main(String[] args) {

		/*
		 * 4. Generar un n�mero aleatorio comprendido entre 0 y 1000. Pedir, a
		 * continuaci�n, al usuario adivinar el n�mero escogido por el ordenador. Para
		 * ello, debe introducir un n�mero comprendido entre 0 y 1000. Se compara el
		 * n�mero introducido con el calculado por el ordenador y se muestra en la
		 * consola "es mayor" o "es menor" en funci�n del caso. Se repite la operaci�n
		 * hasta que el usuario encuentra el n�mero.
		 */

		Scanner sc = new Scanner(System.in);
		int numeroAleatorio = -1;
		int entrada = 0;
		Random rd = new Random();
		System.out.println("Se genero un numero aleatorio entre 0 y  1000. Intente adivinar cual es: ");
		numeroAleatorio = rd.nextInt(1001);

		// System.out.println(numeroAleatorio);
		while (numeroAleatorio != (entrada = sc.nextInt())) {
			//valido el rango
			if (entrada >= 0 && entrada <= 1000) {

				if (entrada < numeroAleatorio) {

					System.out.println(" es menor ");
				} else {
					System.out.println(" es mayor ");
				}
			} else
				System.out.println(" fuera de rango ");
		}
		System.out.println("ADIVINASTE");
	}
}