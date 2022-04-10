import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AgregarVehiculos {

	public static void main(String[] args) {

		// Con arreglos de objetos, agregue vehículos manualmente,
		// luego calcule la cantidad de ruedas, ventanas y puertas de todos los
		// vehículos. (Sebastian Morales)
		
		
		Scanner scanner= new Scanner(System.in);   
		ArrayList<String> Autos = new ArrayList<String>();

		String[] AutoChico = { "AutoRojo" };
		int[] Cantidad = { 4, 6, 5, };

		System.out.println( "Ingrese un auto");
		for (int i = 0; i < AutoChico.length; i++) {
			Autos.add(scanner.nextLine().toUpperCase());                            
			System.out.println("Aqui estoy"+AutoChico[i]);
		for (int i1 = 0; i1 < Autos.size(); i1++) {
			System.out.println("Aqui estoy"+ Autos);
		}
		}

	}

}
