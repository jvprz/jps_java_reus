import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String p = "Password";					//Contraseña guardada
		String l = "";							//Contraseña para intoducir
		
		for(int i=3; i>0 && !l.equals(p); i--) {
			System.out.println("Introduce la contraseña (intentos restantes: " + i + ")");
			l = sc.next();
			System.out.println(l.equals(p) ? "Enhorabuena" : i==1 ? "Máximos intentos alcanzados." : "Contraseña incorrecta, vuelve a intentarlo");
		}		
		sc.close();
	}
}
