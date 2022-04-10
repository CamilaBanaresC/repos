package miPrimerProyecto;

import java.util.Scanner;

public class CalcularpromedioNotas {
	//Ingrese por teclado 5 notas y calcule el promedio.
	
	Scanner scan= new Scanner(System.in);
	float nota[] = new float[5];

	for(int i=0; i<nota.length; i+=1) {
	System.out.println("Ingrese una nota");
	nota[i] = scan.nextFloat();

	}
	float suma=0;
	for(int i=0; i<nota.length; i+=1) {
	suma+= nota[i];

	}
	System.out.println("el promedio es: "+ (suma / nota.length));
	}
	}

