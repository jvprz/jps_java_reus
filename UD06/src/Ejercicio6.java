import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		print("Introduce un número positivo: ");
		String n = read(sc);
		
		if (positive(n)) {
			counter(Integer.parseInt(n));
		}	
		sc.close();
	}
	
	//Filter positive integer
	public static boolean positive(String n) {
		try {
			if (Integer.parseInt(n)>=0) {
				return true;
			} else {
				print("Introduce un número válido.");
				return false;
			}
		} catch(Exception e) {
			print("Valor introducido no válido.");
			return false;
		}
	}
	
	//Figure counter
	public static void counter(int n) {
		
		int c = 0;		//Counter
		int n2 = n;
		
		if (n == 0) {	//0 not divisible
			c = 1;
			print(n + " tiene " + c + " cifra.");
		} else {
			while(n2 != 0) {
				n2 = n2/10;
				c++;
			}
			print(c==1 ? n + " tiene " + c + " cifra." : n + " tiene " + c + " cifras.");
		}	
	}
	
	//Print any message
	public static void print(String m) {
		System.out.print(m);
	}
			
	//Read any message
	public static String read(Scanner sc) {			
		return sc.next();		
	}
}
