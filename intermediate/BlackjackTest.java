import static org.junit.Assert.*;

import org.junit.Test;

public class BlackjackTest {

	@Test
	public void testCreateBlackjackObject() {
		Blackjack bjk = new Blackjack();
		assertNotNull(bjk);
		
	}
	
	@Test
	public void testCard1Highest(){
		Blackjack bjk = new Blackjack();
		int card1 = 19;
		int card2 = 10;
		int test = bjk.returnValue(card1, card2);
		int expectedResult = card1;
		assertTrue(test == expectedResult);
		
	}
	
	@Test
	public void testCard2Highest(){
		Blackjack bjk = new Blackjack();
		int card1 = 19;
		int card2 = 20;
		int test = bjk.returnValue(card1, card2);
		int expectedResult = card2;
		assertTrue(test == expectedResult);
		
	}

	@Test
	public void testBothCardsSame(){
		Blackjack bjk = new Blackjack();
		int card1 = 20;
		int card2 = 20;
		int test = bjk.returnValue(card1, card2);
		int expectedResult = card1;
		assertTrue(test == expectedResult);
		
	}
	
	@Test
	public void testCard1Over21(){
		Blackjack bjk = new Blackjack();
		int card1 = 22;
		int card2 = 21;
		int test = bjk.returnValue(card1, card2);
		int expectedResult = card2;
		assertTrue(test == expectedResult);
		
	}
	
	
	@Test
	public void testCard2Over21(){
		Blackjack bjk = new Blackjack();
		int card1 = 21;
		int card2 = 22;
		int test = bjk.returnValue(card1, card2);
		int expectedResult = card1;
		assertTrue(test == expectedResult);
		
	}
	
	@Test
	public void testBothCardsOver21(){
		Blackjack bjk = new Blackjack();
		int card1 = 22;
		int card2 = 22;
		int test = bjk.returnValue(card1, card2);
		int expectedResult = 0;
		assertTrue(test == expectedResult);
		
	}
	
	
	
}
