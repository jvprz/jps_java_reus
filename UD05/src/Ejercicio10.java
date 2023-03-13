import java.util.Scanner;

public class Ejercicio10 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		double v = 0; 									//ventas
		
		System.out.print("Ventas a introducir: ");
		int n = sc.nextInt();							//num de ventas
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Venta " + i + ": ");
			v = v + sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("Total ventas: " + v);
	}
}
