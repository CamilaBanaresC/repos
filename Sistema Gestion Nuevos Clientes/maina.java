import java.util.Scanner;

public class maina {  //Clase principal 
	
	static String nombre = "", rut = "";
	static int edad = 0; 
	static double cantidad = 0.0;
	private static Scanner entrada;
	
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		// Ejercicio 1
		System.out.println("Ingrese nombre");
		nombre = entrada.nextLine();
		System.out.println("Ingrese rut");
		rut = entrada.nextLine();
		System.out.println("Ingrese edad");
		edad = entrada.nextInt();
		Persona persona = new Persona(nombre, rut ,edad);
		persona.validarEdad(persona.getEdad());
		persona.validarNombre(persona.getNombre());
		// No se ha validado el rut.
		persona.mostrarDatos();
		
		 //p1 Es mayor de edad
		if (persona.esMayorDeEdad() == true) {
			System.out.println("Es mayor de edad");
		}  
		else {
			System.out.println("No es mayor de edad");
		} 
		
		// Ejercicio 2
		System.out.println("Ingrese cantidad");
		cantidad = entrada.nextDouble();
		Cuenta cuenta = new Cuenta(persona, cantidad);
		cuenta.validarCantidad(cuenta.getCantidad());
		cuenta.mostrar();
		
		// Retirar cantidad (debe ingresarse)
		System.out.println("Ingrese la cantidad a retirar.");	
		cuenta.setCantidad(cuenta.getCantidad() - cuenta.retirarCantidad(cuenta.ingresarCantidad()));
		//cuenta.mostrar();
		
		
		// Ejercicio 3
		CuentaJoven cuentaJoven = new CuentaJoven(persona, cuenta.getCantidad());
		cuentaJoven.validarCantidad(cuentaJoven.getCantidad());
		cuentaJoven.mostrar();
		
	}
} // esta llave cierra maina


