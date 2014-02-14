package DecouvreTDD;

import static org.junit.Assert.*;
import org.junit.*;

public class Multiplication_Test {

	Multiplication multi;
	
	@Before
	public void setUp() throws Exception {
		multi = new Multiplication();
	}

	@Test
	public void testexe() {
		assertEquals(22, multi.exe(11,2));
	}

}
