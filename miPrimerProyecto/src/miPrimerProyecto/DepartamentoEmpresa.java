package miPrimerProyecto;

import java.util.Scanner;

public class DepartamentoEmpresa {
	public static void main(String[] args) {
		// Variable
		String nombre = "";
		int clave = 0;
		int añosDeServicio = 0;
		int departamento = 0;
		String respuesta= "";

		Scanner scan = new Scanner(System.in);
		do {
		System.out.println("*************************************");
		System.out.println("*Bienvenido al sistema de vacaciones*");
		System.out.println("Por favor ingrese su nombre");
		System.out.println("*************************************");
		nombre = scan.nextLine();
		System.out.println("*************************************");
		System.out.println("Hola " + nombre + " por favor ingrese sus años de servicio");
		System.out.println("*************************************");
		añosDeServicio = scan.nextInt();
		System.out.println("*************************************");
		System.out.println(nombre + " Un gusto,  ahora necesito saber ¿a que departamento pertenece?");
		
		System.out.println("_______________________________________________________");
		System.out.println("[1]  Departamento de Atencion al Cliente");
		System.out.println("[2]  Departamento de Logistica");
		System.out.println("[3]  Departamento de Gerencia");
		System.out.println("[4]  Salir");
		System.out.println("*************************************");
		departamento = scan.nextInt();
	
		if (departamento == 1 && añosDeServicio == 1) {
			System.out.println(nombre + "  Usted tiene derecho a 6 dias de vacaciones");

		} else if (departamento == 1 && (añosDeServicio + 1) <= 6) {
			System.out.println(nombre + "  Usted tiene derecho a 14 dias de vacaciones");
		} else if (departamento == 1 && (añosDeServicio) >= 7) {
			System.out.println(nombre + "  Usted tiene derecho a 20 dias de vacaciones");
		}
		
		else if (departamento == 2 && añosDeServicio == 1) {
			System.out.println(nombre + "  Usted tiene derecho a 7 dias de vacaciones");
		} else if (departamento == 3 && añosDeServicio == 1) {
			System.out.println(nombre + "  Usted tiene derecho a 8 dias de vacaciones");
		}

		else if (departamento == 2 && añosDeServicio == 1) {
			System.out.println(nombre + "  Usted tiene derecho a 7 dias de vacaciones");
		} else if (departamento == 2 && (añosDeServicio + 1) <= 6) {
			System.out.println(nombre + "  Usted tiene derecho a 15 dias de vacaciones");
		} else if (departamento == 2 && (añosDeServicio) >= 7) {
			System.out.println(nombre + "  Usted tiene derecho a 22 dias de vacaciones");
		}

		else if (departamento == 3 && añosDeServicio == 1) {
			System.out.println(nombre + "  Usted tiene derecho a 10 dias de vacaciones");
		} else if (departamento == 3 && (añosDeServicio + 1) <= 6) {
			System.out.println(nombre + "  Usted tiene derecho a 20 dias de vacaciones");
		} else if (departamento == 3 && (añosDeServicio) >= 7) {
			System.out.println(nombre + "  Usted tiene derecho a 30 dias de vacaciones");
		} else {
			System.out.println("Elija una opcion valida por favor");
		}
		} while (departamento != 0);

	}

	
	
}
