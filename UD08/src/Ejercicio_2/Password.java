package Ejercicio_2;

public class Password {
	
	//Attributes
	private int length = 8;
	private String pass;
 	
	//Constructors
	public Password() {
		this.pass = "";
	}
	public Password(int lenght) {
		this.length = lenght;
		this.pass = generator(lenght);
	}
	
	//Method
	public static String generator(int l) {
		
		String c = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=";	//All posible characters
		
		int n;
		
		String p = "";
		
		for (int i = 0; i < l; i++) {
			n = (int)Math.random() * (76 - 1) + 76;
			p += c.charAt(n) + "";
		}
		
		return p;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Password [length=" + length + ", pass=" + pass + "]";
	}
	
	
}
