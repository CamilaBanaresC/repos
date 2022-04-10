package miPrimerProyecto;

import java.text.BreakIterator;
import java.util.Scanner;

public class Operacione3 {
	public static void main(String[] args) {
	int numUno = 5;
	int numDos = 3;
	int resultado = 0;
	int parametro =0;  
	
	Scanner scan = new Scanner(System.in);
	System.out.println("*************************************");
	System.out.println("*Bienvenido a la calculadora de 2 digitos*");
	System.out.println("Por favor elija una opcion");
	System.out.println("[1]Suma");
	System.out.println("[2]Multiplicacion");
	System.out.println("[3]Resta");
	System.out.println("[4]Division");
	System.out.println("[5]Resto");
	System.out.println("*************************************");
	parametro = scan.nextInt();

	
	switch(parametro) {
	case 1:  resultado = (numUno + numDos);
	System.out.println("El resultado de la suma es :"+ resultado);
		break;
	case 2:  resultado = (numUno * numDos);
	System.out.println("El resultado de la multiplicacion es :"+ resultado);
		break;
	case 3:  resultado = (numUno - numDos);
	System.out.println("El resultado de la resta es :"+ resultado);
		break;
	case 4:  resultado = (numUno / numDos);
	System.out.println("El resultado de la divicion es :"+ resultado);
		break;
	case 5:  resultado = (numUno % numDos);
	System.out.println("El resto de la operacion es :"+ resultado);
		break;
	default: System.out.println("Inbesil!!!");
	} 
	

	}
}
