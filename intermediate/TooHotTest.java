import static org.junit.Assert.*;

import org.junit.Test;

public class TooHotTest {

	@Test
	public void testNotInSummer() {
		TooHot isItHot = new TooHot();
		boolean actual = isItHot.isTooHot(68, false);
		boolean expected = true;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIsSummer() {
		TooHot isItHot = new TooHot();
		boolean actual = isItHot.isTooHot(68, true);
		boolean expected = true;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIfTooHotInSummer() {
		TooHot isItHot = new TooHot();
		boolean actual = isItHot.isTooHot(98, true);
		boolean expected = true;
		
		assertEquals(expected, actual);
	}

	@Test
	public void testIfNotTooHotInSummer(){
		TooHot isItHot = new TooHot();
		boolean actual = isItHot.isTooHot(59, true);
		boolean expected = false;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIfTooHotNotInSummer() {
		TooHot isItHot = new TooHot();
		boolean actual = isItHot.isTooHot(78, false);
		boolean expected = true;
		
		assertEquals(expected, actual);
	}

	@Test
	public void testIfNotTooHotNotInSummer(){
		TooHot isItHot = new TooHot();
		boolean actual = isItHot.isTooHot(59, false);
		boolean expected = false;
		
		assertEquals(expected, actual);
	}
}
