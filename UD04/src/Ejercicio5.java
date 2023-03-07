
public class Ejercicio5 {
	public static void main(String args[]) {
		
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		int t;
		
		t = b;
		b = c;
		c = a;
		a = d;
		d = t;
						
		System.out.println(a + " " + b + " " + c + " " + d);
	}
}