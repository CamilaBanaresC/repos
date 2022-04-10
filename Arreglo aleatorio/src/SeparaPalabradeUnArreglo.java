import java.util.Scanner;

public class SeparaPalabradeUnArreglo {

	public static class Main {

		public static void main(String[] args) {
			//Separe una frase agregada por un usuario en palabras de un arreglo, luego indique la suma del tamaño de palabras totales.
			Scanner scan = new Scanner(System.in);
			String contenido;
			String[] cadena;
			int suma =0;

			contenido = scan.nextLine();
			cadena = contenido.split(" ");
			for (int i=0; i<cadena.length; i++){
			System.out.println( cadena[i]);
			suma+=cadena[i].length();


			}
			System.out.println(suma);

			scan.close();

		}

	}
	
	
}
