package JUnit.Junit09_Geometria.dto;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class GeometriaTest {
	
	private Geometria g;

	@BeforeEach
	public void before() {
		g = new Geometria();
	}

	@AfterEach
	public void after() {
		g = new Geometria();

	}
	
	// Void contructor
	@Test
	public void testGettersSetters() {
		
		// Set values
		int id = 0;
		String figura = "Cuadrado";
		double area = 25.0;
		g.setId(id);
		g.setNom(figura);
		g.setArea(area);
				
		// Comprove
		assertEquals(id, g.getId());
		assertEquals(figura, g.getNom());
		assertEquals(area, g.getArea(), 0.00001);
	}
	
	// Constructor
	private static Stream<Arguments> getTypeGeometria() {
		return Stream.of(Arguments.of(1, "Cuadrado"),
						 Arguments.of(2, "Circulo"),
						 Arguments.of(3, "Triangulo"),
						 Arguments.of(4, "Rectangulo"),
						 Arguments.of(5, "Pentagono"),
						 Arguments.of(6, "Rombo"),
						 Arguments.of(7, "Romboide"),
						 Arguments.of(8, "Trapecio"),
						 Arguments.of(9, "Default"));
	}
	
	@ParameterizedTest
	@MethodSource("getTypeGeometria")
	public void testCheckConstructor(int id, String name) {
		
		// Set values
		g = new Geometria(id);
		String rName = g.getNom();
		int rId = g.getId();
		
		// Comprove
		assertEquals(rId, id);
		assertEquals(rName, name);
	}
	
	// Square area
	@Test
	public void testAreaCuadrado() {
		
		// Set values
		int l = 2;
		int r = g.areacuadrado(l);
		
		// Comprove
		assertEquals(4, r);
	}
	
	// Circle area
	@Test
	public void testAreaCirculo() {
		
		// Set values
		int radius = 2;
		double r = g.areaCirculo(radius);
		
		// Comprove
		assertEquals(12.5664, r, 0.001);
	}
	
	// Tiangle area
	@Test
	public void testAreaTriangulo() {
		
		// Set values
		int height = 10;
		int base = 2;
		int r = g.areatriangulo(height, base);

		// Comprove
		assertEquals(10, r);
	}
	
	// Rectangle area
	@Test
	public void testAreaRectangulo() {
		
		// Set values
		int height = 2;
		int base = 10;
		int resultado = g.arearectangulo(height, base);
		
		// Compare
		assertEquals(20, resultado);
	}
	
	// Pentagon area
	@Test
	public void testAreaPentagono() {
		
		// Set values
		int perimeter = 50;
		int center = 10;
		int r = g.areapentagono(perimeter, center);
		
		// Compare
		assertEquals(250, r);
	}
	
	// Rhombus area
	@Test
	public void testAreaRombo() {
		
		// Set values
		int greaterDiagonal = 6;
		int lessDiagonal = 8;
		int r = g.arearombo(greaterDiagonal, lessDiagonal);
		
		// Comprove
		assertEquals(24, r);
	}

	// Rhomboid area
	@Test
	public void testAreaRomboide() {
		
		// Set values
		int height = 8;
		int base = 6;
		int r = g.arearomboide(base, height);

		// Comprove
		assertEquals(48, r);
	}

	// Trapezium area
	@Test
	public void testAreaTrapecio() {
		
		// Set values
		int graterBase = 8;
		int lessBase = 2;
		int height = 5;
		int r = g.areatrapecio(graterBase, lessBase, height);
		
		// Comprove
		assertEquals(25, r);
	}

	// To String
	@Test
	public void testToString() {
		
		// Set values
		g.setId(1);
		g.setNom("Cuadrado");
		g.setArea(4);
		String r = "Geometria [id=1, nom=Cuadrado, area=4.0]";

		// Comprove
		assertEquals(g.toString(), r);
	} 
}
