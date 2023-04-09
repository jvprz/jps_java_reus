package JUnit.Junit09_Geometria.dto;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.*;

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

}
