import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 									//Scanner
		
		print("Inserta el número de posiciones que tendrá el array 1: \n");
		int n1[] = new int[Integer.parseInt(read(sc))];							//Array one
		int n2[] = n1;															//Array two
		
		random(n1);
		random(n2);

		int[] r = result(n1,n2);
		
		print(Arrays.toString(n1));
		print(Arrays.toString(n2));
		print(Arrays.toString(r));
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
	
	//Result
	public static int[] result(int[] n1, int[] n2) {
		
		int r[] = n1;
		
		for(int i = 0; i < r.length; i++) {
			r[i] = n1[i] * n2[i];
		}
		return r;
	}
}
