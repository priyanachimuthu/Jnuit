package test;

//import static org.junit.jupiter.api.Assertions.AssertJUnit.assertTrue;
//import static org.junit.jupiter.api.Assertions.AssertJUnit.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import  static org.junit.jupiter.api.Assertions.*;
import  org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertionExample {
	
	@Test
	public void test1() {
		
		String expected ="Hi There";
		String actual = "Hello There";
		
		assertEquals(expected,actual);
		
		String[] expectedArray = {"one","two","three"};
		String[] resultArray = {"one","two","three"};
		
		assertArrayEquals(expectedArray,resultArray);
		
		boolean falg= true;
		
		assertTrue(falg);
		
	}
	
}
