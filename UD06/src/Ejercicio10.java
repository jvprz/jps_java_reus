import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 	//Scanner
		
		print("Inserta el número de posiciones que tendrá el array: \n");
		int n[] = new int[Integer.parseInt(read(sc))];
		
		random(n);
		max(n);
		
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
	
	//Random prime integers generator
	public static void random(int[] n) {
		
		int a = 0;
		boolean p = false; 
		
		for (int i = 0; i < n.length; i++) {
			while(p == false) {		
				a = (int)(Math.random() * (100 - 0) + 0);
				p = check(a);
			}
			p = false;
			n[i] = a;
			print(n[i]+"\n");
		}

	}
	
	
	//Check prime integer3
	
	public static boolean check(int n) {
		
		if (n == 0 || n == 1 || n == 4) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	//Max number
	public static void max(int[] n) {
		
		int m = n[0];
		
		for(int i=0; i<n.length; i++) {
			if (n[i] > m) {
				m = n[i];
			}
		}
		print("El número mayor es " + m);
	}

}
