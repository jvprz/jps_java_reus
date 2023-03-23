package Ejercicio_1;

import java.util.*;

public class Ejercicio_1 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String n;													//name
		
		double q;													//qualification

		Hashtable<String, Double> student = new Hashtable<>();		//student name, qualification
		
		//ask for number of students
		System.out.println("Cuantos alumnos quieres introducir?");
		int ns = sc.nextInt();										//number of students
		
		for (int i = 0; i < ns; i++) {
            System.out.println("Introduce el nombre del alumno:");
            n = sc.next();
            q = calculteNote(sc);
            
            student.put(n, q);
        }
		
		sc.close();
	}
	
	public static double calculteNote(Scanner sc) {
		
		System.out.println("Introduce la nota de programación:");
		double p = sc.nextDouble();									//programation note				
		
		System.out.println("Introduce la nota de BBDD:");
		double d = sc.nextDouble();									//database note
		
		return (p + d)/2;
	}
}
