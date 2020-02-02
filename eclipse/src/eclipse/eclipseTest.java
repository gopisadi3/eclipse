package eclipse;

import static org.junit.Assert.*;

import org.junit.Test;

public class eclipseTest {

	@Test
	public void testAdd() {
		eclipse e = new eclipse();
		int output = e.add(2,2);
		
		assertEquals(4 , output);
	}

}
