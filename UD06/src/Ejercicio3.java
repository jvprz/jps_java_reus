import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		print("Introduce un número para compobar si es un número primo o no: ");
		int n = Integer.parseInt(read(sc));
		
		print(prime(n) ? "Es primo" : "No es primo");
	}
	
	//Print any message
	public static void print(String m) {
		System.out.print(m);
	}
			
	//Read any message
	public static String read(Scanner sc) {			
		return sc.next();		
	}
	
	//Prime number
	public static boolean prime(int n) {
		if (n==0 || n==1 || n==4) {			//Discarding 0, 1 and 4
			return false;
		} else {
			for (int i = 2; i < n; i++) {	//Checking if it is divisible
				if (n%i==0) {
					return false;
				}
			}
		}
		return true;
	}
}
