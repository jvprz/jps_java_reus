import java.util.Scanner;

public class Ejercicio5 {	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(num%2 == 0 ? "Divisible entre 2" : "No divisible entre 2");
		
		sc.close();
	}
}
