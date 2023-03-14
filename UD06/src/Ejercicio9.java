import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 	//Scanner
		
		print("Inserta el número de posiciones que tendrá el array: \n");
		int n[] = new int[Integer.parseInt(read(sc))];
		
		random(n);
		add(n);
		
		sc.close();
	}
	
	//Read method
	public static String read(Scanner sc) {
		return sc.next();
	}
		
	//Print method
	public static void print(String m) {
		System.out.print(m);
	}
	
	//Random integers generator
	public static void random(int[] n) {
		for(int i = 0; i < n.length; i++) {
			n[i] = (int)(Math.random() * (9-0) + 0);
		}
	}
	
	//Addition
	public static void add(int[] n) {
		
		int r = 0;
		
		for(int i = 0; i < n.length; i++) {
			r = r + n[i];
		}
		
		print(r+"");
	}

}
