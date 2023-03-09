import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String r = sc.next();
		
		System.out.println(Math.PI * Math.pow(Double.parseDouble(r), 2));
		
		sc.close();
	}
}
