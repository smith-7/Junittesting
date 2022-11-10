public class testing {
    

class divideTest {

	@Test
	void negativeTest() {
		JunitTesting test = new JunitTesting();
		Exception exception = assertThrows(
		ArithmeticException.class, 
		() -> test.divide(1, 0));
	    
		assertEquals("/ by zero", exception.getMessage());
	    assertTrue(exception.getMessage().contains("zero"));
		}
	
	/**
	 * Positive Testing
	 * Normal Scenario
	 */
	@Test
	void positiveTest() {
		JunitTesting test = new JunitTesting();		
		double positiveOutput = test.divide(20, 2);
		assertEquals(10,positiveOutput);
	}
}
}
