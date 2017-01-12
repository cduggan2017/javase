package junittests;

import static org.junit.Assert.*;

import org.junit.Test;

import librarytask.*;

public class LibraryTest {

	@Test
	public void testNotNull() {
		Library l = new Library();
		assertNotNull(l);
	}
		
	@Test
	public void testAddAndFindItem1() {
		Library l = new Library();
		Newspaper np1 = new Newspaper(2, "The Sun", 50, 1, 0.50, "The World Is Doomed!!", 2016);
		Newspaper np2 = new Newspaper(22, "The Sun", 50, 1, 0.50, "The World Is Doomed!!", 2016);
		l.addItem(np1);
		l.addItem(np2);
		int expected = 1;
		int result = l.getItemLocation(22);
		assertTrue(expected == result);		
	}
	
	@Test
	public void testAddAndFindItem2() {
		Library l = new Library();
		Newspaper np1 = new Newspaper(2, "The Sun", 50, 1, 0.50, "The World Is Doomed!!", 2016);
		Newspaper np2 = new Newspaper(22, "The Sun", 50, 1, 0.50, "The World Is Doomed!!", 2016);
		l.addItem(np1);
		l.addItem(np2);
		int expected = 1;
		int result = l.getItemLocation(np2);
		assertTrue(expected == result);		
	}
	
	@Test
	public void testItemRemoved() {
		Library l = new Library();
		Newspaper np1 = new Newspaper(2, "The Sun", 50, 1, 0.50, "The World Is Doomed!!", 2016);
		Newspaper np2 = new Newspaper(22, "The Sun", 50, 1, 0.50, "The World Is Doomed!!", 2016);
		l.addItem(np1);
		l.addItem(np2);
		
		boolean expected = true;
		boolean result = l.removeItem(np1);
				
		assertTrue(expected == result);
		
	}
	
	@Test
	public void testItemNotRemoved() {
		Library l = new Library();
		Newspaper np1 = new Newspaper(2, "The Sun", 50, 1, 0.50, "The World Is Doomed!!", 2016);
		Newspaper np2 = new Newspaper(22, "The Sun", 50, 1, 0.50, "The World Is Doomed!!", 2016);
		l.addItem(np1);
		
		boolean expected = false;
		boolean result = l.removeItem(np2);
				
		assertTrue(expected == result);
		
	}

	@Test
	public void testRegisterPersonAndFindRegisterPerson(){
		Library l = new Library();
		Person p1 = new Person("Billy Bodderworth", 32);
		String personName = p1.getName();
		l.registerPerson(p1,100);
		int expected = 100;
		int result = l.findRegisteredPerson(personName);
		assertTrue(expected == result);
		
	}
	
	@Test
	public void testUnregisterPerson(){
		Library l = new Library();
		Person p1 = new Person("Billy Bodderworth", 32);
		
		l.registerPerson(p1,1);
		
		boolean expected = true;
		boolean result = l.unregisterPerson(p1,1);
		assertTrue(expected == result);
	}
	
	@Test
	public void testRegisterPersonNotFound(){
		Library l = new Library();
		Person p1 = new Person("Billy Bodderworth", 32);
		Person p2 = new Person("Ted Bodderworth", 34);
		// add person to membership with membershipNo 1
		l.registerPerson(p1,1);
		
		boolean expected = false;
		boolean result = l.unregisterPerson(p2,2);
		assertTrue(expected == result);
	}

	@Test
	public void updateRegisteredPerson(){
		Library l = new Library();
		Person p1 = new Person("Billy Bodderworth", 32);
		l.registerPerson(p1,1);
		String personName = p1.getName();
		l.updateRegisteredPerson(personName,"Ms B");
		
		boolean expected = true;
		boolean result = true;
		assertTrue(expected == result);
	}
	
	@Test
	public void updateItem(){
		Library l = new Library();
		Newspaper np1 = new Newspaper(2, "The Sun", 50, 1, 0.50, "The World Is Doomed!!", 2016);
		l.addItem(np1);
		l.updateItemPrice("The Sun",6.2d);
		np1.setPrice(6.2d);
		double expected = 6.2d;
		double result = np1.getPrice();
		assertTrue(expected == result);
		
	}
}
