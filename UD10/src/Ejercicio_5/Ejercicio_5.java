package Ejercicio_5;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la longitud: ");
		int l = sc.nextInt();
		
		System.out.print("Introduce el tamaño del array de Passwords: ");
		int n = sc.nextInt();
		
		Password[] p = new Password[n];
		boolean[] s = new boolean[n];	//is strong
		
		for (int i = 0; i < n; i++) {
			p[i] = new Password(l);
		}
		
		for (int i = 0; i < n; i++) {
            System.out.println(p[i].getPass());
        }

	}

}
