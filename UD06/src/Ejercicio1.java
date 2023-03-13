import java.util.Scanner;

public class Ejercicio1 {

		public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
			
			print("Elige una figura para calcular el área: (1)-Circulo (2)-Cuadrado (3)-Triangulo");
			String o = read(sc);
			
			switch(o) {
				case "1":
					circle(sc);
					break;
				case "2":
					square(sc);
					break;
				case "3":
					triangle(sc);
					break;
				default:
					print("Valor introducido no válido");
					
			}
			sc.close();
		}
		
		//Print any message
		public static void print(String m) {
			System.out.println(m);
		}
		
		//Read any message
		public static String read(Scanner sc) {			
			return sc.next();		
		}
		
		//Circle area
		public static void circle(Scanner sc) {
			print("Introduce el radio del circulo:");
			int r = Integer.parseInt(read(sc));
			
			print(String.format("El área es %.2f", (Math.pow(r, 2))*Math.PI));
		}
		
		//Square area
		public static void square(Scanner sc) {
			print("Introduce el lado del cuadrado:");
			int l = Integer.parseInt(read(sc));

			print("El área es " + (l*l));
		}
		
		//triangle
		public static void triangle(Scanner sc) {
			print("Introduce la base del trinagulo:");
			int b = Integer.parseInt(read(sc));
			
			print("Introdice la altura del triangulo:");
			int a = Integer.parseInt(read(sc));
			
			print("El área es " + (b*a)/2);
		}
				
}
