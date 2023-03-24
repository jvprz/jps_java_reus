package Ejercicio_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Game j = new Game();
		
		int o = 0;
		boolean b = false;
		
		System.out.println("Intenta adivinar el número del 1 al 500.");
		
		while(!b) {
			try {
				System.out.println("Intento número: " + j.getAttempts());
				System.out.println("Introduce un número: ");
				o = sc.nextInt();
				
				b = j.guess(o);
				
			} catch(InputMismatchException e) {
				System.out.println("Numero no válido.");
				o = sc.nextInt();
				continue;
			}
		}
	
		System.out.println("Fin del juego.");
        sc.close();
	}
}
