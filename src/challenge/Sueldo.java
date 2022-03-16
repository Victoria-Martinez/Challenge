
package challenge;

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {

		/*
		 * 3. Por teclado se ingresa el valor hora de un empleado. Posteriormente se
		 * ingresa el nombre del empleado, la antigüedad y la cantidad de horas
		 * trabajadas en el mes. Se pide calcular el importe a cobrar teniendo en cuenta
		 * que al total que resulta de multiplicar el valor hora por la cantidad de
		 * horas trabajadas. Además, si el empleado tiene más de 10 años de antigüedad
		 * hay que sumarle la cantidad de años trabajados multiplicados por $30.
		 * Imprimir en pantalla el nombre, la antigüedad y el total a cobrar.
		 */

		System.out.println("Ingrese el valor hora de un empleado: ");
		Scanner valorIngresado = new Scanner(System.in);
		float valorHora = valorIngresado.nextFloat();

		System.out.println("Ingrese el nombre del empleado: ");
		Scanner nombreIngresado = new Scanner(System.in);
		String nombreEmpleado = nombreIngresado.nextLine();

		System.out.println("Ingrese antiguedad del empleado: ");
		Scanner antiguedadIngresada = new Scanner(System.in);
		int antiguedadEmpleado = antiguedadIngresada.nextInt();

		System.out.println("Ingrese la cantidad de horas trabajadas en el mes: ");
		Scanner horasIngresadas = new Scanner(System.in);
		int horasTrabajadas = horasIngresadas.nextInt();

		System.out.println("  IMPORTE A COBRAR: ");

		float sueldo = valorHora * horasTrabajadas;

		if (antiguedadEmpleado >= 10) {

			float plus = antiguedadEmpleado * 30;
			sueldo = sueldo + plus;
		} else {
			sueldo = sueldo;
		}

		System.out.print("  Empleado : " + nombreEmpleado + "\n" + "  antiguedad: " + antiguedadEmpleado + "  años  "
				+ "\n" + "  sueldo: " + sueldo);
	}

}
