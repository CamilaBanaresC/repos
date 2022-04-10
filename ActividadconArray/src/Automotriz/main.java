package Automotriz;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class main {
	
	// Instancia del servicio automotriz
	static ServicioAutomotriz servicio = new ServicioAutomotriz();
	
	public static void main(String[] args) {

		// 1) Se crean los vehiculos
		crearVehiculos();
		
		// 2) Mostrar menu
		menu();
	
	}
	
	public static void crearVehiculos() {
		
		// 3 camionetas
		Camioneta cam1 = new Camioneta("Ford", 70000, "CM-76-34", true);
		Camioneta cam2 = new Camioneta("Changan", 70000, "CM-43-23", true);
		Camioneta cam3 = new Camioneta("MG", 70000, "CM-65-66", true);
		
		// Camionetas a la lista
		servicio.getCamionetaArrayList().add(cam1);
		servicio.getCamionetaArrayList().add(cam2);
		servicio.getCamionetaArrayList().add(cam3);
		
		// 7 SUV
		SUV suv1 = new SUV("Ford", 50000, "SV-76-87", true);
		SUV suv2 = new SUV("MG", 50000, "SV-32-56", true);
		SUV suv3 = new SUV("Toyota", 50000, "SV-66-55", true);
		SUV suv4 = new SUV("MG", 50000, "SV-56-67", true);
		SUV suv5 = new SUV("Ford", 50000, "SV-11-86", true);
		SUV suv6 = new SUV("Audi", 50000, "SV-44-35", true);
		SUV suv7 = new SUV("Ferrari", 50000, "SV-88-77", true);
		
		// SUV a la lista
		servicio.getSuvArrayList().add(suv1);
		servicio.getSuvArrayList().add(suv2);
		servicio.getSuvArrayList().add(suv3);
		servicio.getSuvArrayList().add(suv4);
		servicio.getSuvArrayList().add(suv5);
		servicio.getSuvArrayList().add(suv6);
		servicio.getSuvArrayList().add(suv7);
		
		// 4 Sedan
		Sedan sedan1 = new Sedan("Ford", 30000, "CD-22-33", true);
		Sedan sedan2 = new Sedan("Audi", 30000, "CD-34-56", true);
		Sedan sedan3 = new Sedan("Toyota", 30000, "CD-66-54", true);
		Sedan sedan4 = new Sedan("MG", 30000, "CD-11-43", true);

		// Sedan a la lista
		servicio.getSedanArrayList().add(sedan1);
		servicio.getSedanArrayList().add(sedan2);
		servicio.getSedanArrayList().add(sedan3);
		servicio.getSedanArrayList().add(sedan4);
		
		// 1 Coupe
		Coupe coupe = new Coupe("MG", 100000, "CP-35-65", true);
		
		// Coupe a la lista
		servicio.getCoupeArrayList().add(coupe);
	}
	
	
	
	public static void menu() {
		int opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la opción del Menú a elegir:  \n"
				+ "1) Arrendar\n" 
				+ "2) Devolver\n" 
				+ "3) Verificar\n" 
				+ "4) Monto Total\n"));
		
		switch (opc) {
		case 1:
			arrendar();
			break;

		case 2:
			devolver();
			break;
			
		case 3:
			disponible();
			break;
			
		case 4:
			montoTotal();
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Opción inválida. Favor ingresar la opción correcta [1 - 4]");
			menu();
		}
		
		
	}
	
	public static void arrendar() {
		
		// ver si tengo vehiculos disponibles
		if(!servicio.getListaVehiculosDisponibles().isEmpty()) {
			
			
		} else {
			JOptionPane.showMessageDialog(null, "No tiene vehiculos");
		}
		// preguntar cuantos vehiculos quiere arrendar
		// preguntar qué vehiculos quiere arrendar
		// revisar si esos vehiculos estan disponibles
		// si estan disponibles, arrendarlos
		
	}
	
	public static void devolver() {
		
	}

	public static void disponible() {
	
		if(!servicio.getListaVehiculosDisponibles().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Tiene vehiculos disponibles");
		} else {
			JOptionPane.showMessageDialog(null, "No tiene vehiculos disponibles");
		}
	}

	public static void montoTotal() {
		JOptionPane.showMessageDialog(null, String.format("El monto total recaudado hasta ahora es de $%d", servicio.getMontoRecaudado()));
	}
}
