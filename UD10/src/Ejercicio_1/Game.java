package Ejercicio_1;

public class Game {
	
	//Attributes
	private int number;
    private int attempts;

    //Constructor
    public Game() {
    	this.number = (int) (Math.random() * 500) + 1;
    	this.attempts = 1;
    }
  
    //Getters & Setters
	public int getNumber() {
		return number;
	}

	public int getAttempts() {
		return attempts;
	}
	
	//Methods
	public boolean guess(int n) {
		
		this.attempts++;
		
		if (n == this.number) {
			return true;
		} else if (n < this.number) {
			System.out.println("El número es mayor...");
		} else {
			System.out.println("El núemro es menor...");
		}
		
		return false;
	}
}
