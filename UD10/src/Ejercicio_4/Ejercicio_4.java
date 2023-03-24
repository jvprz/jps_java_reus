package Ejercicio_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean c = true;	//continue 
		
		do {
			System.out.println("Introduce la operación: ");
			System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Raíz cúbica");
            System.out.println("8. Salir");
            
            int o = sc.nextInt();
            
            switch(o) {
            	case 1:
            		sum(sc);
            		break;
            	case 2:
            		res(sc);
            		break;
            	case 3:
            		mul(sc);
            		break;
            	case 4:
            		div(sc);
            		break;
            	case 5:
            		pot(sc);
            		break;
            	case 6:
            		raq(sc);
            		break;
            	case 7:
            		rac(sc);
            		break;
            	case 8:
            		c = false;
            		break;
            	default:
            		System.out.println("Opción no válida.");
            }
		} while (c);
		sc.close();
	}
	
	public static void sum(Scanner sc) {
		try {
			System.out.println("Introduce el primer número: ");
			double a = sc.nextDouble();
			System.out.println("Introduce el segundo número: ");
			double b = sc.nextDouble();
			double resultado = a + b;
            System.out.println("El resultado es: " + resultado);
		} catch (InputMismatchException e) {
            System.out.println("Introduce un número válido");
            sc.nextLine();
        }
	}
	
	public static void res(Scanner sc) {
		try {
			System.out.println("Introduce el primer número: ");
			double a = sc.nextDouble();
			System.out.println("Introduce el segundo número: ");
			double b = sc.nextDouble();
			double resultado = a - b;
            System.out.println("El resultado es: " + resultado);
		} catch (InputMismatchException e) {
            System.out.println("Introduce un número válido");
            sc.nextLine();
        }
	}
	
	public static void mul(Scanner sc) {
		try {
			System.out.println("Introduce el primer número: ");
			double a = sc.nextDouble();
			System.out.println("Introduce el segundo número: ");
			double b = sc.nextDouble();
			double resultado = a * b;
            System.out.println("El resultado es: " + resultado);
		} catch (InputMismatchException e) {
            System.out.println("Introduce un número válido");
            sc.nextLine();
        }
	}
	
	public static void div(Scanner sc) {
		try {
			System.out.println("Introduce el primer número: ");
			double a = sc.nextDouble();
			System.out.println("Introduce el segundo número: ");
			double b = sc.nextDouble();
			double resultado = a / b;
            System.out.println("El resultado es: " + resultado);
		} catch (InputMismatchException e) {
            System.out.println("Introduce un número válido");
            sc.nextLine();
        }
	}
	
	public static void pot(Scanner sc) {
		try {
			System.out.println("Introduce el número base: ");
			double a = sc.nextDouble();
			System.out.println("Introduce el número exponente: ");
			double b = sc.nextDouble();
			double resultado = Math.pow(a, b);
            System.out.println("El resultado es: " + resultado);
		} catch (InputMismatchException e) {
            System.out.println("Introduce un número válido");
            sc.nextLine();
        }
	}
	
	public static void raq(Scanner sc) {
		try {
			System.out.println("Introduce el número: ");
			double a = sc.nextDouble();
			double resultado = Math.sqrt(a);
            System.out.println("El resultado es: " + resultado);
		} catch (InputMismatchException e) {
            System.out.println("Introduce un número válido");
            sc.nextLine();
        }
	}
	
	public static void rac(Scanner sc) {
		try {
			System.out.println("Introduce el número: ");
			double a = sc.nextDouble();
			double resultado = Math.cbrt(a);
            System.out.println("El resultado es: " + resultado);
		} catch (InputMismatchException e) {
            System.out.println("Introduce un número válido");
            sc.nextLine();
        }
	}

}
