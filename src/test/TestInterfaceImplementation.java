package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestInterfaceImplementation implements TestInterface{
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("INSIDE CLASS");
		
	}
	
	@Test
	public void test2() {
		
		assertTrue(StringFunctions.isPalindrome("madam"));
	}

}
