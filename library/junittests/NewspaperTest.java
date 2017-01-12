package junittests;
import static org.junit.Assert.*;

import org.junit.Test;

import librarytask.*;

public class NewspaperTest {

	@Test
	public void testNotNull() {
		Newspaper np = new Newspaper(2, "The Sun", 50, 1, 0.50, "The World Is Doomed!!", 2016);
		assertNotNull(np);
	}

	@Test
	public void testGetFrontPage() {
		Newspaper np = new Newspaper(2, "The Sun", 50, 1, 0.50, "The World Is Doomed!!", 2016);
		String headline = np.getFrontPageHeadline();
		String expected = "The World Is Doomed!!" ;
		assertSame(expected, headline);
		
	}
	
}
