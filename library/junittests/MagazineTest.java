package junittests;
import static org.junit.Assert.*;

import org.junit.Test;

import librarytask.Magazine;

public class MagazineTest {

	@Test
	public void testNotNull() {
		Magazine m = new Magazine(2, "Linux Format", 124, 2, 5.60, 2016, true, true, 123);
		assertNotNull(m);
	}

	@Test
	public void testSetFreebiesMissing(){
		Magazine m = new Magazine(2, "Linux Format", 124, 2, 5.60, 2016, true, true, 123);
		m.setFreebiesMissing(false);
		boolean expected = false;
		boolean result = m.containsFreebies();
		
		assertTrue(expected == result);
	}
	
	@Test
	public void testSetFreebiesMissing2(){
		Magazine m = new Magazine(2, "Linux Format", 124, 2, 5.60, 2016, true, true, 123);
		m.setFreebiesMissing(true);
		boolean expected = true;
		boolean result = m.containsFreebies();
		
		assertFalse(expected != result);
	}
	
	
	
}
