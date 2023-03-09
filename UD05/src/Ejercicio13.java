import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el primer numero: ");
		int n1 = sc.nextInt();
		
		System.out.print("Intoduce el segundo numero: ");
		int n2 = sc.nextInt();
		
		System.out.print("Introduce un signo aritmético (+, -, *, /, ^ o %): ");
		String o = sc.next();
		
		sc.close();
		
		switch(o) {
			case "+":
				System.out.println(n1+n2);
				break;
			case "-":
				System.out.println(n1-n2);
				break;
			case "*":
				System.out.println(n1*n2);
				break;
			case "/":
				System.out.println(n1/n2);
				break;
			case "^":
				System.out.println(Math.pow(n1, n2));
				break;
			case "%":
				System.out.println(n1%n2);
				break;
			default:
				System.out.println("Singo intrducido no válido.");
		}		
	}
}
