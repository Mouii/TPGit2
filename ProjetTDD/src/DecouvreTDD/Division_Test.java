package DecouvreTDD;

import static org.junit.Assert.*;
import org.junit.*;

public class Division_Test {

	Division div;
	
	@Before
	public void setUp() throws Exception {
		div = new Division();
	}

	@Test
	public void testexe() throws Exception {
			assertEquals(23, div.exe(46,2));
	}
	
	@Test(expected = RuntimeException.class)
	public void testexe2() throws Exception {
		assertEquals(2, div.exe(2,0));
	}

}
