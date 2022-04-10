package miPrimerProyecto;

public class CiclosDos {
	public static void main(String[] args) {
		int i = 1, j = 99;
		System.out.println("Serie con For");
		for (i = 1; i <= 5; i++) {
				if (i < 5) {
					System.out.println(i + ",");
					System.out.println(j + ",");
				} else {
					System.out.println(i + ",");
					System.out.println(j);
				}
				j--;
			}
			System.out.println("");
			i = 1;
			j = 99;
		}
	}

