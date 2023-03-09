import java.util.Scanner;

public class Ejercicio11 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un día de la semana: ");
		String d = sc.next();									//Día de la semana
		
		switch(d.toUpperCase()) {
			case "LUNES":
				System.out.println("Laboral");
				break;
			case "MARTES":
				System.out.println("Laboral");
				break;
			case "MIERCOLES":
				System.out.println("Laboral");
				break;
			case "JUEVES":
				System.out.println("Laboral");
				break;
			case "VIERNES":
				System.out.println("Laboral");
				break;
			case "SABADO":
				System.out.println("No Laboral");
				break;
			case "DOMINGO":
				System.out.println("No Laboral");
				break;
			default:
				System.out.println("Día introducido no válido");
		}
		
		sc.close();
	}
}
