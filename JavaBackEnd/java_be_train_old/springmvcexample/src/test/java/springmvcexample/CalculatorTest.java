package springmvcexample;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

import springmvcexample.utility.Calculator;

public class CalculatorTest {

	

	@Test
	public void testAdd() {
		
		Calculator c=new Calculator();
		assertTrue(c.add(2, 5)==7);
	}

	@Test
	public void testSub() {
		
		Calculator c=new Calculator();
		assertTrue(c.sub(5, 2)==2);
	}
	
	@Test
	public void testMul() {
		
		Calculator c=new Calculator();
		assertTrue(c.mul(5, 2)==10);
	}
}
