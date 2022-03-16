package challenge;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2. Escribe una aplicación que solicite al usuario que ingrese una contraseña
		 * cualquiera. Después se le pedirá que ingrese nuevamente la contraseña, con 3
		 * intentos. Cuando acierte ya no pedirá más la contraseña y mostrará un mensaje
		 * diciendo “Felicitaciones, recordás tu contraseña”. Si falla luego de 3
		 * intentos se mostrará el mensaje “Tenes que ejercitar la memoria”. Los
		 * mensajes quedarán en pantalla a la espera que el usuario presione una tecla,
		 * luego de esto se cerrará el programa.
		 */
		Scanner passwordPrimera = new Scanner(System.in);

		System.out.println("Ingrese una contraseña: ");

		String claveUno = passwordPrimera.nextLine();

		Scanner passwordSegunda = new Scanner(System.in);

		System.out.println("Ingresa de vuelta la  contraseña");

		String claveDos = passwordSegunda.nextLine();

		if (claveUno.equals(claveDos)) {
			System.out.println("Felicitaciones,recordás tu contraseña");
		} else
			System.out.println("Ingrese por tercera vez");

		Scanner passwordTerc = new Scanner(System.in);

		String claveTres = passwordTerc.nextLine();

		if (claveUno.equals(claveTres)) {
			System.out.println("Felicitaciones,recordás tu contraseña");
			System.exit(0);

		} else
			System.out.println("Tenés que ejercitar la memoria");
		System.exit(0);
	}
}
