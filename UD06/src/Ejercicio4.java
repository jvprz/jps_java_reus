import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		print("Introduce un número para calcular su factorial: ");
		int n = Integer.parseInt(read(sc));
		
		factorial(n);
		
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
	
	//Factorial
	public static void factorial(int n) {
		int f = 1;
		
		print("El factorial de " + n + " es ");
		for(int i = n; i >= 1; i--) {
			print(i == 1 ? i + "" : i + "*");
			f = f * i;
		}
		print("="+f);
	}

}
