package junittests;
import static org.junit.Assert.*;

import org.junit.Test;

import librarytask.Book;
import librarytask.Library;
import librarytask.Person;

public class PersonTest {

	@Test
	public void testNotNull() {
		Person p = new Person("Fred West", 65);
		assertNotNull(p);
	}
	
	@Test
	public void testIsNull() {
		Person p = new Person("Fred West", 65);
		p = null;
		assertNull("Person is Null", p);
	}

	@Test
	public void testCheckItemOut() {
		Book b = new Book(1, "Bourne Identity", 300, 1, 19.99d, 1982, "Robert Ludlow", CoverType.HARDBACK);
		Library l = new Library();
		l.addItem(b);
		boolean expected = true;
		boolean result = l.removeItem(b);
		assertTrue(expected == result);
	
	}

	@Test
	public void testGetMembershipNo(){
		Library l = new Library();
		Person p = new Person("Fred West", 65);
		l.registerPerson(p,100);
		String personName = p.getName();
		l.findRegisteredPerson(personName);
		int expected = 0;
		int result = p.getMembershipNo();
		assertTrue(expected == result);
	}
	
	
}
