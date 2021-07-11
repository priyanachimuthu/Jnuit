package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assumptions.assumeFalse;
//import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Disabledexample {
	
	@CustomAnnotation
	public void test1()
	{
		assertTrue(StringFunctions.isPalindrome("madam"));
		
	}
	
	@DisplayName("Negative Test")
	@RepeatedTest(5)
	@Test
	public void test2()
	{
		assertFalse(StringFunctions.isPalindrome("priya"));
	}
	

}


