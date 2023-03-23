package Ejercicio_2;

import java.util.*;

public class Ejercicio_2 {

	public static void mian(String args[]) {
		
		ArrayList<Double> c = new ArrayList<Double>();				//shopping list
		double p = 0;												//price
		double pt = 0;												//total price
		int n = 0;													//number of products
		double dp = 0;												//paid
		double r = 0;												//returned
		int iva;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el precio de cada articulo: (introduce un numero 0 o negativo para acabar la compra)");

		while(true) {
			p = sc.nextDouble();
			if(p <= 0) {
				break;
			}
			c.add(p);
		}
		
		n = c.size();
		
		for(Double i : c) {
			pt+=i;
		}
		
		System.out.println("Introduce el IVA, 21 o 4?");
		
		while(true) {
			iva = sc.nextInt();
			if(iva == 21 || iva == 4) {
				break;
			}
			System.out.println("Introduce una opción válida.");
		}
		
		double iva_a = 1 + (iva/100);								//iva ready
		double pwiva = pt * iva_a;									//price with IVA
		
		System.out.println("Número de articulos: " + n);
		System.out.println("Precio bruto: " + pt);
		System.out.println("Precio más IVA: " + pwiva);
		
		System.out.println("Introduce la cantidad pagada:");
		dp = sc.nextDouble();
		
		while(dp < pwiva) {
			System.out.println("La cantidad no es suficiente.");
			dp = sc.nextDouble();
		}
		r = dp - pwiva;
		
		System.out.println("Cantidad pagada: " + dp);
		System.out.println("Cambio: " + r);
		
		sc.close();
	}
}
