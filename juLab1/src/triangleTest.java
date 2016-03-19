import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class triangleTest {

	private static triangle triangle = new triangle();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLongest() {
		triangle.longest(3, 4, 5);
		assertEquals(5, triangle.getResult());
	}

	@Test
	public void testEquilateral() {
		triangle.equilateral(3, 5, 5);
		assertEquals(1, triangle.getResult());
	}

	@Test
	public void testIsosceles() {
		triangle.isosceles(5, 5, 5);
		assertEquals(1, triangle.getResult());
	}

	@Test
	public void testScalene() {
		triangle.scalene(3, 5, 5);
		assertEquals(1, triangle.getResult());
	}

}
