package miPrimerProyecto;

import java.util.Scanner;

public class Operaciones2 {
	public static void main(String[] args) {
		int nUno = 8;
		int nDos = 4;
		int suma = 0;
		int resta = 0;
		int multimplicacion = 0;
		int divicion = 0;
		int dato = 0;
		suma = (nUno + nDos);
		resta = (nUno - nDos);
		multimplicacion = (nUno * nDos);
		divicion = (nUno / nDos);

		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Ingrese la opcion a elegir");
			System.out.println("1 Suma ");
			System.out.println("2 Resta");
			System.out.println("3 Multiplicacion");
			System.out.println("4 Divicion");
			dato = scan.nextInt();

			if (dato == 1) {
				System.out.println("El resultado de la suma es; " + suma);
			} else if (dato == 2) {
				System.out.println("El resultado de la resta es; " + resta);

			} else if (dato == 3) {
				System.out.println("El resultado de la multiplicacion es; " + multimplicacion);

			} else if (dato == 4) {
				System.out.println("El resultado de la divicion  es; " + divicion);

			} else {
				System.out.println("Ingrese una opcion valida");
			}
		} while (dato != 0);
	}
}
