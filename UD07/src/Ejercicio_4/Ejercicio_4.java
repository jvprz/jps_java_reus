package Ejercicio_4;

import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {

		Hashtable<String, Double> d = start();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una opción: 1)Añadir 2)Consultar 3)Listar");
		String o = sc.next();
	
		switch(o) {
			case "1":
				addArticle(d, sc);
				break;
			case "2":
				selectPrice(d, sc);
				break;
			case "3":
				list(d);
				break;
			default:
				System.out.println("Valor introducido no válido.");
		}
	}
	
	public static Hashtable<String, Double> start() {
		
		Hashtable<String, Double> d = new Hashtable<String, Double>();
		
		d.put("Articulo 1",23.50);
		d.put("Articulo 2",10.0);
		d.put("Articulo 3",100.0);
		d.put("Articulo 4",9.99);
		d.put("Articulo 5",2.75);
		d.put("Articulo 6",49.99);
		d.put("Articulo 7",0.05);
		d.put("Articulo 8",4.99);
		d.put("Articulo 9",70.0);
		d.put("Articulo 10",87.60);
		
		return d;
	}

	public static void addArticle(Hashtable<String, Double> d, Scanner sc) {
		
		System.out.println("Nombre del articulo: ");
		String a = sc.next();
		
		System.out.println("Precio: ");
		double p = sc.nextDouble();
		
		d.put(a, p);
		
		System.out.println(a + " añadido correctamente.");
	}
	
	public static void selectPrice(Hashtable<String, Double> d, Scanner sc) {
		
		System.out.println("De que articulo quieres ver el precio? ");
		String a = sc.next();
		
		if(d.containsKey(a)) {
			double p = d.get(a);
			System.out.println(a + " tiene cuesta " + p);
		} else {
			System.out.println(a + "no se ha encontrado.");
		}
	}
	
	public static void list(Hashtable<String, Double> d) {
		for(String a : d.keySet()) {
			double p = d.get(a);
			System.out.println(a + ": " + p);
		}
	}
	
	public static void facture(Hashtable<String, Double> d, Scanner sc) {
		
		double p = 0;												//price
		double pt = 0;												//total price
		int n = 0;													//number of products
		double dp = 0;												//paid
		double r = 0;												//returned
		int iva;
		
		
		/*n = shop(c, p, sc);
		
		for(Double i : d) {
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
		System.out.println("Cambio: " + r); */
	}
}