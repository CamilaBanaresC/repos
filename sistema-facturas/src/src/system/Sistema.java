package src.system;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import src.models.Articulo;
import src.models.Factura;

public class Sistema {
	
	static ArrayList<Articulo> articulos = new ArrayList<>();
	static int cantArticulos;
	static int montoTotal = 0;
	
	public static void main(String[] args) {
		
		int articulo = 0;
		
		while(articulo != 11) {
			articulo = mostrarMenuArticulos();
			if(articulo != 11) {
				cantArticulos = mostrarMenuCantArt();
				crearListaDeCompra(articulo, cantArticulos);
			}					
		} 
		
		crearFactura();
		
	}
	
	public static int mostrarMenuArticulos() {
		
		int menu_articulo = Integer.parseInt(JOptionPane.showInputDialog(null, ":::INVENTARIO:::\n"
				+ "ID: 1 - Nombre: Cepillo\n"
				+ "ID: 2 - Nombre: Bicicleta\n"
				+ "ID: 3 - Nombre: Volantín\n"
				+ "ID: 4 - Nombre: Televisión\n"
				+ "ID: 5 - Nombre: PC\n"
				+ "ID: 6 - Nombre: Notebook\n"
				+ "ID: 7 - Nombre: Mouse\n"
				+ "ID: 8 - Nombre: Teclado\n"
				+ "ID: 9 - Nombre: Monitor\n"
				+ "ID: 10 - Nombre: Silla\n"
				+ ":::PRESIONE 11 PARA SALIR:::\n"
				+ "Ingrese el ID correspondiente al artículo"));
		
		return menu_articulo;
	}
	
	public static int mostrarMenuCantArt() {
		
		int menuCantArt = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las unidades de este artículo que desea comprar:"));
		
		return menuCantArt;
	}
	
	public static void crearListaDeCompra(int articulo, int cantidad) {
		
		switch (articulo) {
		case 1: {
			Articulo cepillo = new Articulo(1, 1200, cantidad, "Cepillo");
			articulos.add(cepillo);
			montoTotal += (1200 * cantidad);
			break;
		}
		case 2: {
			Articulo bicicleta = new Articulo(2, 12000, cantidad, "bicicleta");
			articulos.add(bicicleta);
			montoTotal += (12000 * cantidad);
			break;
		}
		case 3: {
			Articulo volantin = new Articulo(3, 600, cantidad, "volantin");
			articulos.add(volantin);
			montoTotal += (600 * cantidad);
			break;
		}
		case 4: {
			Articulo television = new Articulo(4, 350000, cantidad, "television");
			articulos.add(television);
			montoTotal += (350000 * cantidad);
			break;
		}
		case 5: {
			Articulo pc = new Articulo(5, 780000, cantidad, "pc");
			articulos.add(pc);
			montoTotal += (780000 * cantidad);
			break;
		}
		case 6: {
			Articulo notebook = new Articulo(6, 1200000, cantidad, "notebook");
			articulos.add(notebook);
			montoTotal += (1200000 * cantidad);
			break;
		}
		case 7: {
			Articulo mouse = new Articulo(7, 23000, cantidad, "mouse");
			articulos.add(mouse);
			montoTotal += (23000 * cantidad);
			break;
		}
		case 8: {
			Articulo teclado = new Articulo(8, 9000, cantidad, "teclado");
			articulos.add(teclado);
			montoTotal += (9000 * cantidad);
			break;
		}
		case 9: {
			Articulo monitor = new Articulo(9, 220000, cantidad, "monitor");
			articulos.add(monitor);
			montoTotal += (220000 * cantidad);
			break;
		}
		case 10: {
			Articulo silla = new Articulo(10, 120000, cantidad, "silla");
			articulos.add(silla);
			montoTotal += (120000 * cantidad);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + articulo);
		}
		
	}
	
	public static void crearFactura() {
		
		Factura factura = new Factura(1, montoTotal, articulos);
		
		String mensaje = "::: FACTURA NRO: " + factura.getFacturaNumero() + ":::\n"
				+ "Lista de artículos:\n";
		
		for(Articulo articulo: articulos) {		
			mensaje += "::" + articulo.getNombre().toString() + " - Precio unitario: $ " + articulo.getPrecio() + " x" + articulo.getCantidad() + " ; subTotal = $ " + articulo.getCantidad() * articulo.getPrecio() + "\n";
		}
		
		mensaje += "Monto Total: $ " +factura.getFacturaValor();
		
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
