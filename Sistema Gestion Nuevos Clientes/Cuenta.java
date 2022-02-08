import java.util.Scanner;

/*Crea una clase llamada Cuenta que tendrá los siguientes atributos: 
 * titular (que es una persona) y cantidad (puede tener decimales)--.
 *  Construye los siguientes métodos para la clase:​
Un constructor, donde los datos pueden estar vacíos--.​
Los setters y getters para cada uno de los atributos--.
El atributo no se puede modificar directamente, sólo ingresando o retirando dinero.​
mostrar(): Muestra los datos de la cuenta.​
ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.​
retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en números rojos.​
 */

public class Cuenta{
	// Bloque de declaración de variables globales.
	private Persona titular;
	private double cantidad=0;
	private Scanner entrada;
	private Scanner entrada2;
	

	/**
	 * @param titular
	 * @param cantidad
	 */
	public Cuenta(Persona titular, double cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}
	public Persona getTitular() {
		return titular;
	}
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}	
	
	//Ingresar Cantidad
	public double ingresarCantidad(){
		entrada = new Scanner(System.in);
		System.out.println("Cantidad: ");             //Metodo ingresar cantidad
		double cantidad = entrada.nextInt();
		return cantidad;
	}
	
	//Validar cantidad
	public double validarCantidad(double cantidad) {
		if(cantidad <= 0) {
			System.out.println("cantidad inválida");               // Validacion para que la cantidad ingresada no sea 0
		    cantidad = ingresarCantidad();
		}
		return cantidad;
	} 
	
	//Retirar dinero
	public double retirarCantidad(double dinero) {
		if (dinero <= 0) {                                    // Se agrego retirar dinero 
			System.out.println("cantidad inválida");
			retirarCantidad(dinero);	
		}
		return dinero;
	}
	
	public Persona ingresarTitular(){
		entrada2 = new Scanner(System.in);
		Persona titular = new Persona(entrada2.nextLine(), entrada2.nextLine(), entrada2.nextInt());
		return titular;
	} 
	
	public void mostrar() {
		System.out.println("El titular es: " + this.getTitular().getNombre().toString());
		System.out.println("su saldo es de: " + this.getCantidad());
	}
}