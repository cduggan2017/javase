package junittests;
import static org.junit.Assert.*;
import org.junit.Test;
import librarytask.*;

public class BookTest {

	@Test
	public void testBookIsNotNull(){
		Book b = new Book(1, "Bourne Identity", 300, 1, 19.99d, 1982, "Robert Ludlow", CoverType.HARDBACK);
		assertNotNull(b);
	}
	
	@Test
	public void testGetters(){
		Book b = new Book(1, "Bourne Identity", 300, 1, 19.99d, 1982, "Robert Ludlow", CoverType.HARDBACK);
		
		int returnId = b.getId();
		String returnName = b.getName();
		int returnNoPages = b.getNoPages();
		int returnEdition = b.getEdition();
		double returnPrice = b.getPrice();
		int returnPublicationYear = b.getPublicationYear();
		String returnAuthor = b.getAuthor();
		CoverType returnCoverType = b.getCoverType();
		
		int expectedId = 1;
		String expectedName = "Bourne Identity";
		int expectedNoPages = 300;
		int expectedEdition = 1;
		double expectedPrice = 19.99d;
		int expectedPublicationYear = 1982;
		String expectedAuthor = "Robert Ludlow";
		CoverType expectedCoverType = CoverType.HARDBACK;
		
		assertTrue(expectedId == returnId);
		assertTrue(expectedName == returnName);
		assertTrue(expectedNoPages == returnNoPages);
		assertTrue(expectedEdition == returnEdition);		
		assertTrue(expectedPrice == returnPrice);
		assertTrue(expectedPublicationYear == returnPublicationYear);
		assertTrue(expectedAuthor == returnAuthor);
		assertTrue(expectedCoverType == returnCoverType);
		
	}

	@Test
	public void testSetCoverType(){
		Book b = new Book(1, "Bourne Identity", 300, 1, 19.99d, 1982, "Robert Ludlow", CoverType.HARDBACK);
		b.setCoverType(CoverType.PAPERBACK);
		CoverType expectedResult = CoverType.PAPERBACK;
		CoverType result = b.getCoverType();
		assertTrue(expectedResult == result);
		
		

	}
	
}


