package Classe;

import java.util.Scanner;

public class GestorActividades {

	static Scanner scan = new Scanner(System.in);
	static String[] catalogo;

	public static void actividades() {

		catalogo = crearCatalogo();
		mostrarMenu();
	}

	public static void mostrarMenu() {
		System.out.println("¿Quiere agregar un producto. SI - NO?\n");
		String opc = scan.nextLine();

		if (opc == "SI") {
			agregarProducto();
		} else {
			System.out.println("¿Quiere listar los productos. SI - NO?");
			opc = scan.nextLine();

			if (opc == "SI") {
				listarProductos();
			} else {
				System.out.println("¿Quiere editar un producto. SI - NO?\n");
				opc = scan.nextLine();

				if (opc == "SI") {
					editarProducto();
				} else {
					System.out.println("¿Quiere eliminar un producto. SI - NO?\n");
					opc = scan.nextLine();

					if (opc == "SI") {
						eliminarProducto();
					} else {
						mostrarMenu();
					}
				}
			}
		}
	}

	public static String[] crearCatalogo() {

		String[] catalogo = new String[6];

		catalogo[0] = "Aseo";
		catalogo[1] = "Ropa";
		catalogo[2] = "Aseo personal";
		catalogo[3] = "Bebé";
		catalogo[4] = "Bebestibles";
		catalogo[5] = "Aceite";

		return catalogo;
	}

	public static void agregarProducto() {
		
		
	};

	public static void listarProductos() {
	};

	public static void eliminarProducto() {
	};

	public static void editarProducto() {
	};

}
