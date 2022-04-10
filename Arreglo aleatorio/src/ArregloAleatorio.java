import java.util.ArrayList;
import java.util.Random;

public class ArregloAleatorio {

	//Cree un arreglo de números aleatorios entre 0 y 100, sin repetir los números y que el tamaño máximo del arreglo sea aleatorio.
	
	public static void main(String[] args) {

		// Cree un arreglo con números aleatorios y sume sus números.

		Random rand = new Random();
		ArrayList<Integer> numerosList = new ArrayList<Integer>();

		int max = rand.nextInt(100);

		for (int n=0; n<max; n+=1) {
			numerosList.add(rand.nextInt(100));
		}

		//String.format("primer numero %d y el segundo numero %d, hola mundo!", numerosList.get(1), numerosList.get(2));
		//String nuevoString = "primer numero" +numerosList.get(1)+ " y el segundo numero "+ numerosList.get(2) +", hola mundo!";

		System.out.printf("Suma: %d", sumaArreglos(numerosList));

	}

	public static int sumaArreglos( ArrayList<Integer> _numeros ) {

		int suma = 0;
		for (int i=0; i<_numeros.size(); i+=1) {
			suma += _numeros.get(i);
		}
		

		return suma;
	}

	}
	
	

