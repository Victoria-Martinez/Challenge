package challenge;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2. Escribe una aplicaci�n que solicite al usuario que ingrese una contrase�a
		 * cualquiera. Despu�s se le pedir� que ingrese nuevamente la contrase�a, con 3
		 * intentos. Cuando acierte ya no pedir� m�s la contrase�a y mostrar� un mensaje
		 * diciendo �Felicitaciones, record�s tu contrase�a�. Si falla luego de 3
		 * intentos se mostrar� el mensaje �Tenes que ejercitar la memoria�. Los
		 * mensajes quedar�n en pantalla a la espera que el usuario presione una tecla,
		 * luego de esto se cerrar� el programa.
		 */
		Scanner passwordPrimera = new Scanner(System.in);

		System.out.println("Ingrese una contrase�a: ");

		String claveUno = passwordPrimera.nextLine();

		Scanner passwordSegunda = new Scanner(System.in);

		System.out.println("Ingresa de vuelta la  contrase�a");

		String claveDos = passwordSegunda.nextLine();

		if (claveUno.equals(claveDos)) {
			System.out.println("Felicitaciones,record�s tu contrase�a");
		} else
			System.out.println("Ingrese por tercera vez");

		Scanner passwordTerc = new Scanner(System.in);

		String claveTres = passwordTerc.nextLine();

		if (claveUno.equals(claveTres)) {
			System.out.println("Felicitaciones,record�s tu contrase�a");
			System.exit(0);

		} else
			System.out.println("Ten�s que ejercitar la memoria");
		System.exit(0);
	}
}
