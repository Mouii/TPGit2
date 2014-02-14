package DecouvreTDD;

import static org.junit.Assert.*;
import org.junit.*;

public class Addition_Test {

	Addition add;

	@Before
	public void setUp() throws Exception {
		add = new Addition();
	}

	@Test
	public void testexe() {
		assertEquals(5, add.exe(3,2));
	}

}
