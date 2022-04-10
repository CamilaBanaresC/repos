package miPrimerProyecto;

public class Promedio {
public static void main(String[] args) {
	int biologia = 4;
	int matematicas = 2;
	int quimica = 1;
	int promedio = 0;
	
	promedio = (biologia + matematicas + quimica)/3;
		if (promedio >=6){
		System.out.println("El alumno aprobo " + promedio );
		} else {
			System.out.println("El alumno reprobo "+ promedio );

		}
	}
}
