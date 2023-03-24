package Ejercicio_2;

public class Ejercicio_2 {

	public static void main(String[] args) {
		try {
			System.out.println("Mostrando mensaje por pantalla...");
			throw new CustomException("Esta es una excepción personalizada");
		} catch (CustomException e) {
			System.out.println("Excepcion capturada con mensaje: " + e.getMessage());
		} finally {
            System.out.println("Programa terminado.");
        }

	}

}
