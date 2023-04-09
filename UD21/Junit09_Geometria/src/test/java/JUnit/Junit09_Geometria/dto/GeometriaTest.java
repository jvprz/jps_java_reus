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
	
	@Test
	public void testGettersSetters() {
		g.setId(0);
		int id = g.getId();
		g.setNom("Rectangulo");
		String figura = g.getNom();
		g.setArea(22.55);
		double area = g.getArea();
		assertEquals(id, 0);
		assertEquals(figura, "Rectangulo");
		assertEquals(area, 22.55, 0.00001);
	}

}
