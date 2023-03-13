import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		print("Introduce un número para pasar a binario: ");
		int n = Integer.parseInt(read(sc));
		
		binary(n);
		
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
	
	//Binary
	public static void binary(int n) {
		print(Integer.toBinaryString(n));
	}

}