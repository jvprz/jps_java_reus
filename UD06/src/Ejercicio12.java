import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 									//Scanner
		
		print("Inserta el número de posiciones que tendrá el array 1: \n");
		int n1[] = new int[Integer.parseInt(read(sc))];							//Array one
		
		random(n1);
		
		print(Arrays.toString(n1));

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
			n[i] = (int)(Math.random() * (300-1) + 1);
		}
	}
	
}
