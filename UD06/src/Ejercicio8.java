import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);	//Scanner
		int n[] = new int[10];					//Integer array with 10 positions
		
		fill(n, sc);
		
		list(n);
		
		sc.close();
	}
	
	//Fill
	public static void fill(int[] n, Scanner sc) {
		print("Rellena todas las posiciones del array con números: \n");
		for(int i=0; i<n.length; i++) {
			print("Posición nº" + (i+1) + ": ");
			n[i] = Integer.parseInt(read(sc));
		}
	}
	
	//Print array
	public static void list(int [] n) {
		print("Resultado del array con números: \n");
		for(int i=0; i<n.length; i++) {
			print("Posición nº" + (i+1) + " = " + n[i] + "\n");
		}
	}
	
	//Read method
	public static String read(Scanner sc) {
		return sc.next();
	}
		
	//Print method
	public static void print(String m) {
		System.out.print(m);
	}
}
