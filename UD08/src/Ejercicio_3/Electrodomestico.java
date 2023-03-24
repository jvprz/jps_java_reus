package Ejercicio_3;

class Electrodomestico {

	// Por defecto
	private final char CONSUMO_DEFAULT = 'F';
	private final String COLOR_DEFAULT = "BLANCO";
	private final int PESO_DEFAULT = 5;

	// Atributos
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;

	// Constructores
	public Electrodomestico() {
		this.precioBase = 0;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_DEFAULT;
		this.peso = PESO_DEFAULT;
	}

	public Electrodomestico(double precio, int peso) {
		this.precioBase = precio;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_DEFAULT;
		this.peso = peso;
	}

	public Electrodomestico(double precio, String color, char consumo, int peso) {
		this.precioBase = precio;
		this.color = color;
		this.consumoEnergetico = consumo;
		this.peso = peso;
	}
	
	
}
