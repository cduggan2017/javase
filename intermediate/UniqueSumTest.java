import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueSumTest {

	@Test
	public void testUniqueSumNotNull() {
		UniqueSum us = new UniqueSum();
		assertNotNull(us);
	}
	
	@Test
	public void testUniqueNumbers() {
		UniqueSum us = new UniqueSum();
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int test = us.retrunUniqueSum(num1, num2, num3);
		int expectedResult = 6;
		assertEquals(expectedResult,test);
	}
	
	@Test
	public void testNum1SameNum2() {
		UniqueSum us = new UniqueSum();
		int num1 = 1;
		int num2 = 1;
		int num3 = 2;
		int test = us.retrunUniqueSum(num1, num2, num3);
		int expectedResult = 2;
		assertEquals(expectedResult,test);
	}
	
	@Test
	public void testNum2SameNum3() {
		UniqueSum us = new UniqueSum();
		int num1 = 1;
		int num2 = 2;
		int num3 = 2;
		int test = us.retrunUniqueSum(num1, num2, num3);
		int expectedResult = 1;
		assertEquals(expectedResult,test);
	}
	
	@Test
	public void testNum1SameNum3() {
		UniqueSum us = new UniqueSum();
		int num1 = 1;
		int num2 = 2;
		int num3 = 1;
		int test = us.retrunUniqueSum(num1, num2, num3);
		int expectedResult = 2;
		assertEquals(expectedResult,test);
	}
	
	@Test
	public void testNumAllSame() {
		UniqueSum us = new UniqueSum();
		int num1 = 3;
		int num2 = 3;
		int num3 = 3;
		int test = us.retrunUniqueSum(num1, num2, num3);
		int expectedResult = 0;
		assertEquals(expectedResult,test);
	}

}
