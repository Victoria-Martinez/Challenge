package challenge;

import java.util.Random;
import java.util.Scanner;

public class Aleatorio {

	public static void main(String[] args) {

		/*
		 * 4. Generar un número aleatorio comprendido entre 0 y 1000. Pedir, a
		 * continuación, al usuario adivinar el número escogido por el ordenador. Para
		 * ello, debe introducir un número comprendido entre 0 y 1000. Se compara el
		 * número introducido con el calculado por el ordenador y se muestra en la
		 * consola "es mayor" o "es menor" en función del caso. Se repite la operación
		 * hasta que el usuario encuentra el número.
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