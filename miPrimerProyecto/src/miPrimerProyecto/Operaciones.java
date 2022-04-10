package miPrimerProyecto;

public class Operaciones {
	public static void main(String[] args) {
		int numeroUno = 4;
		int numeroDos = 4;
		int resultado =0;
		int resultadosinparentesis=0;
		resultado = (numeroUno + numeroDos) / 2;
		resultadosinparentesis = numeroUno + numeroDos / 2;

		System.out.println(resultado+" Con parentesis");
		System.out.println(resultadosinparentesis+" Sin parentesis");

	}

}
