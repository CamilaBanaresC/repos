package src.models;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import src.system.Articulo;
import src.system.Factura;

public class SistemaMain {

	static ArrayList<Articulo> articulos = new ArrayList<>();
	static int cantidadArticulos;
	static int listadeCompras;
	static int montoTotal = 0;

	public static void main(String[] args) {

		int articulo = 0;

		while (articulo != 7) {
			articulo = mostrarMenuArticulos();
			if (articulo != 7) {
				cantidadArticulos= mostrarMenu_Cantidad_Articulos();
				crearListaDeCompras(articulo, cantidadArticulos);
				
			}
		}//Aqui termina el while 
      crearFactura();
	}// -------Aqui el metodo Main

	public static int mostrarMenuArticulos() {
		int menu_articulo = Integer.parseInt(JOptionPane.showInputDialog(null,
				"::::::: Inventario:::::::\n" + "Bienvenido::: Por favor ingrese el Id corresponiente al articulo\n"
						+ "id 1 = Nombre:  Cepillo \n" + "id 2 = Nombre:  Bicibleta\n" + "id 3 = Nombre:  Auto\n"
						+ "id 4 = Nombre:  Notebook\n" + "id 5 = Nombre:  Monitor\n" + "id 6 = Nombre:  Avion\n"
						+ "Precione 7 para salir\n" + "_____________________"));
		return menu_articulo;

	}// --------Aqui termina MostrarMenuArticulos

	public static int mostrarMenu_Cantidad_Articulos() {
		int MenuCantidadArticulos = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Ingrese las unidades a comprar"));
		return MenuCantidadArticulos;

	}// --------Aqui termina mostrarMenu_Cantidad_Articulos
	
	
	public static void crearListaDeCompras(int articulo, int cantidad) {
		
		
		switch (articulo) {
		case 1: {Articulo cepillo = new Articulo(1,1200,cantidad,"cepillo");
		}
		case 2: {Articulo bicicleta = new Articulo(1,50000,cantidad,"bicicleta");
		}
		case 3: {Articulo auto = new Articulo(1,1200000,cantidad,"auto");
		}
		case 4: {Articulo notebook = new Articulo(1,12000,cantidad,"notebook");
		}
		case 5: {Articulo monitor = new Articulo(1,12000,cantidad,"monitor");
		}
		case 6: {Articulo avion = new Articulo(1,1200000000,cantidad,"avion");
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + articulo);
		}
	} //Aqui termina el metodo crearListaDeCompras
	
	public static void crearFactura() {
	
	Factura factura = new Factura (1,montoTotal,articulos);
	String mensaje = ":::::::::::::Factura::::::::::."+factura.getFacturaNumero()+":::\n"+"lista de articulos:\n";
	for(Articulo articulo: articulos) {
		mensaje+= "::"+ articulo.getNombre().toString()+"-precio unitario $"+ articulo.getPrecio() + "x"+ articulo.getCantidad()
		+ "montototal"+articulo.getCantidad() + articulo.getPrecio();
				
	
	
	}//Aqui termina el for 
	}//Aqui termina el metodo crearfactura
	

}// --------Aqui termina la classe SistemaMain