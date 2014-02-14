package DecouvreTDD;

import static org.junit.Assert.*;
import org.junit.*;

public class Soustraction_Test {

	Soustraction sous;
	
	@Before
	public void setUp() throws Exception {
		sous = new Soustraction();
	}

	@Test
	public void testexe() {
		assertEquals(37, sous.exe(42,5));
	}

}
