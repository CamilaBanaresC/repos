package miPrimerProyecto;

public class Promedionotas {
	public static void main(String[] args) {

		/* Utilizando arreglos, calcule y muestre el promedio de notas, considerando que tiene 3 notas distintas.*/

		float [] calificaciones = {6.5f, 4.9f, 6.7f};

		float suma = 0;

		for( int i = 0; i < calificaciones.length; i += 1) {
		suma += calificaciones[i];
		}

		System.out.println(String.format("El promedio es %.1f", (suma / calificaciones.length)));

		}
	
}
