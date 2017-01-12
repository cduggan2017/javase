package junittests;

import static org.junit.Assert.*;

import org.junit.Test;

import librarytask.*;

public class MembershipTest {

	@Test
	public void testGetMembershipNo(){
		Membership m = new Membership(1, "bob");
		
		int expected = 1; 
		int result = m.getMembershipNo();
		assertTrue(expected == result);
	}
	
	@Test
	public void testGetMembershipName(){
		Membership m = new Membership(1, "bob");
		
		String expected = "bob"; 
		String result = m.getMemberName();
		assertTrue(expected == result);
	}
	
	@Test
	public void testSetMembershipName(){
		Membership m = new Membership(1, "bob");
		m.setMemberName("charlie");
		String expected = "charlie"; 
		String result = m.getMemberName();
		assertTrue(expected == result);
	}
	
	
	
}
