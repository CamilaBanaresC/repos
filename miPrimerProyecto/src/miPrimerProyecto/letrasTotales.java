package miPrimerProyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class letrasTotales {
	public static void main(String[] args) {
		String palabra = "";
		int Cantidad = 0;
		
		
		  Scanner entrada = new Scanner(System.in);
		  System.out.println("Por favor ingrese una palabra");

		  palabra = entrada.nextLine();
		  
		  char letras [] = new char [palabra.length()];
		  for (int i = 0; i<palabra.length(); i++) {
			  letras [i] = palabra.charAt(i);
			  if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e'  || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
				  Cantidad++;
				  
				  
				  
			  }  
			  
			 
		  }
		  System.out.println("la cantidad de vocales es "+Cantidad+" la cantidad todal de letras es "+palabra.length() );
			System.out.println("La palabra, separa por sus letras es ");
		  for(int i = 0; i<letras.length; i++) {
			System.out.print(" "+letras[i]);
			
			
		  }
		
	}

	
	
	
	}


