import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String args[]) {
		
		final double IVA = 0.21;
		
		Scanner sc = new Scanner(System.in);
		double p = Double.parseDouble(sc.next());
		
		System.out.println(p*IVA + p);
		
		sc.close();
	}
}
