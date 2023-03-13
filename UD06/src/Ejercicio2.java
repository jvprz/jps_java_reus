import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		print("¿Cuantos números quieres generar? ");
		int n = Integer.parseInt(read(sc));
		
		print("Introduce entre que números quieres que se generen.\nIntroduce primero el número más pequeño: ");
		int p = Integer.parseInt(read(sc));
		
		print("Ahora el número mas grande: ");
		int g = Integer.parseInt(read(sc));	
		
		generator(n, p, g);
		
		sc.close();
	}
	
	//Print any message
	public static void print(String m) {
		System.out.print(m);
	}
			
	//Read any message
	public static String read(Scanner sc) {			
		return sc.next();		
	}

	//Random generator
	public static void generator(int n, int p, int g) {
		print("Los números generados son: ");
		for(int i = 0; i < n; i++) {
			print((int)(Math.random() * g - p) + " ");
		}
	}
}
