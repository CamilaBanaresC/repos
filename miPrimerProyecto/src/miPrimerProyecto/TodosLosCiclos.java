package miPrimerProyecto;

public class TodosLosCiclos {
	public static void main(String[] args) {
		int i = 0;

		System.out.println("Serie con For ;");
		for (i = 0; i <= 10; i += 1) {
			if (i < 10) {
				System.out.println(i + ",");
			} else {
				System.out.println(i);
			}
		}//llave de cierre for 
		i=1;
		System.out.println("");
		
		System.out.println("Serie con while ;");
		
		while(i<=10) {
			if (i < 10) {
				System.out.println(i + ",");
			} else {
				System.out.println(i);
			}
		i+=1;
		}
		i=1;
		System.out.println("");
		System.out.println("Serie con do while");
		do {
			if (i < 10) {
				System.out.println(i + ",");
			} else {
				System.out.println(i);
				}
				i+=1;
	}while(i<=10);
		}
		

		
	}

