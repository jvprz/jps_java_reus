package Ejercico_1;

public class Persona {

	//Attributes
	private final char DEFAULT_SEX = 'H';
	
	private String name;
	private int age;
	private String dni;
	private char sex;
	private double weight;
	private double height;
	
	//Constructors
	public Persona(String dni) {
		this.name = "";
		this.age = 0;
		this.dni = dni;
		this.sex = DEFAULT_SEX;
		this.weight = 0.0;
		this.height = 0.0;
	}
	public Persona(String name, int age, String dni, char sex) {
		this.name = name;
		this.age = age;
		this.dni = dni;
		this.sex = sex;
		this.weight = 0.0;
		this.height = 0.0;
	}
	public Persona(String name, int age, String dni, char sex, double weight, double height) {
		this.name = name;
		this.age = age;
		this.dni = dni;
		this.sex = sex;
		this.weight = weight;
		this.height = height;
		
	//Setters and getters
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Persona [name=" + name + ", age=" + age + ", dni=" + dni + ", sex=" + sex + ", weight=" + weight
				+ ", height=" + height + "]";
	}
	
	
	
}
