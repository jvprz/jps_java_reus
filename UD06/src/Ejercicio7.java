import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);			//Scanner
		DecimalFormat f = new DecimalFormat("#.00");	//Format
		String e;										//Money
		
		print("Introduce una cantidad de euros: ");
		e = read(sc);
		
		if(validator(e)) {
			print("¿A qué moneda quieres convertir?\n1 - Dolares\n2 - Yenes\n3 - Libras");
			switch(read(sc)) {
				case "1":
					dollar(Integer.parseInt(e), f);
					break;
				case "2":
					yen(Integer.parseInt(e), f);
					break;
				case "3":
					pound(Integer.parseInt(e), f);
					break;
				default:
					print("Opción no válida.");
			}
		}
			
		sc.close();
	}
	
	//Read method
	public static String read(Scanner sc) {
		return sc.next();
	}
	
	//Print method
	public static void print(String m) {
		System.out.println(m);
	}
	
	//Valid integer method
	public static boolean validator(String m) {
		try {
			if(Integer.parseInt(m) >= 0) {
				return true;
			} else {
				print("Cantidad introducida no válida.");
				return false;
			}
		} catch (Exception e) {
			print("Valor introducido no válido.");
			return false;
		}
	}
	
	//Dollar method
	public static void dollar(int e, DecimalFormat f) {
		print(e + " son " + f.format(e*1.28611) + " dolares.");
	}
	
	//Yen method
	public static void yen(int e, DecimalFormat f) {
		print(e + " son " + f.format(e*129.852) + " yenes.");
	}
	
	//Pound method
	public static void pound(int e, DecimalFormat f) {
		print(e + " son " + f.format(e*0.86) + " libras.");
	}
	
}
