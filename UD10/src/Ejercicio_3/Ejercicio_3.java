package Ejercicio_3;

import java.util.Random;

public class Ejercicio_3 {

	public static void main(String[] args) {

		Random r = new Random();		
		int n = r.nextInt(1000);

		 System.out.println("Generando número aleatorio...");
		 System.out.println("El número aleatorio generado es: " + n);
		 
		 try {
	            if(n % 2 != 0) {
	                throw new Exception("El número es impar.");
	            } else {
	                System.out.println("El número es par.");
	            }
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	}

}
