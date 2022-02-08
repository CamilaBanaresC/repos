/*Vamos a definir ahora una “Cuenta Joven”, para ello vamos a crear una nueva clase CuentaJoven que deriva de la anterior.
Cuando se crea esta nueva clase, además del titular 
y la cantidad se debe guardar una bonificación que estará expresada en tanto por ciento. 
Construye los siguientes
métodos para la clase:​
Un constructor.​ Los setters y getters para el nuevo atributo.
En esta ocasión los titulares de este tipo de cuenta tienen que ser mayor de edad, 
por lo tanto 
hay que crear un método esTitularValido() que devuelve verdadero si el titular es mayor de edad
pero menor de 25 años y falso en caso contrario.
​
Además la retirada de dinero sólo se podrá hacer si el titular es válido.
​
El método mostrar() debe devolver el mensaje de “Cuenta Joven” 
y la bonificación de la cuenta. 
Piensa los métodos heredados de la clase madre que hay que reescribir. */

//declaracion de atributos
// Contructores
// Get- Set 

public class CuentaJoven extends Cuenta{

	private double bonificacion = 0.25; //Beneficio de cuenta joven
	
	public CuentaJoven(Persona titular, double cantidad) { //Dentro de la cuenta esta titular y cantidad 
		super(titular, cantidad); //Como acceder al constructor de la cuenta
		// TODO Auto-generated constructor stub
	}

	public double getBonificacion() {  
		return bonificacion;
	}

	public boolean esTitularValido() {
		if(super.getTitular().getEdad() <= 25) {  //Validacion para saber si es menor de 25 años, ya que edad ya está validado para mayores de 18
			return true;
		}
			return false;
	}
	
	@Override
	public double retirarCantidad(double dinero) {
		super.retirarCantidad(dinero);
		if(esTitularValido() == false) {           //polimorfismo de retirar cantidad, agregando la validacion de titular.
			System.out.println("Titular inválido");
			System.exit(0);
		}	
		return dinero;
	}
	
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Cuenta Joven");             // Polimorfismo del metodo mostrar, agregando cuenta joven y bonificacion
		System.out.println("Bonificación: " + this.getBonificacion());
	}
}