import java.util.Scanner;

/*  Vamos a crear una clase llamada Persona. Sus atributos son: nombre, edad y rut. Construye los siguientes métodos para la clase:​
	Un constructor, donde los datos pueden estar vacíos.​
	Los setters y getters para cada uno de los atributos.
	 Hay que validar las entradas de datos.​
	mostrar(): Muestra los datos de la persona.​
	esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad. */

public class Persona{
	// Bloque de declaración de variables globales.
	private  String nombre = "", rut = "";
	private  int edad = 0;
	private Scanner entrada;
	private Scanner entrada2;
	
	/**
	 * @param nombre
	 * @param rut
	 * @param edad
	 */
	Persona(String nombre, String rut, int edad) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void mostrarDatos() {                             // Println 
		System.out.println("Nombre: " + this.getNombre().toString());
		System.out.println("Rut: " + this.getRut().toString());
		System.out.println("Edad: " + this.getEdad());	
	}
	
	//Metodo es mayor de edad 
	public boolean esMayorDeEdad() {
		if (this.getEdad() >= 18) {
			return true;
		} else                                                                       // Metodo para validar que persona sea mayor de edad 
			return false;
	}
	
	// Validacion nombre
		public String validarNombre(String nombre) {        //Validar que nombre no sea igual a un numero
			int aux = 0;
			entrada = new Scanner(System.in);
			
			if (nombre.length() == 0) {
				System.out.println("El nombre es inválido\n");
				setNombre(entrada.nextLine());
			}
			
			try {
				aux = Integer.parseInt(nombre);
			} catch (Exception e) {
				
			}
					
			if(aux > 0) {
				System.out.println("El nombre es inválido\n");
				setNombre(entrada.nextLine());
			}
			
			return nombre;
		}

		public String validarRut(String rut) {
			// Desarrollar validación.                            // Nunca validamos el Rut por que es muy peludo 
			return rut;
		} 
		
		public int validarEdad(int edad) {
			entrada2 = new Scanner(System.in);
			if(edad <= 0) {
				System.out.println("Edad inválida");                  //Validacion que edad no sea <= 0
				setEdad(entrada2.nextInt());
			
			}
			return edad;
		}

}// Cierra Persona.