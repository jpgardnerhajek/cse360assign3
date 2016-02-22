package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		//meant to test constructor
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	
	@Test
	public void testGetTotal() {
		//meant to test getTotal
		Calculator calc = new Calculator();
		calc.add(3);
		assertTrue(calc.getTotal()==3);
	}
	
	@Test
	public void testAdd() {
		//meant to test add
		Calculator calc = new Calculator();
		calc.add(3);
		calc.add(6);
		assertTrue(calc.getTotal()==9);
	}
	
	@Test
	public void testSubtract() {
		//meant to test subtract
		Calculator calc = new Calculator();
		calc.subtract(5);
		assertTrue(calc.getTotal()==-5);
	}
	
	@Test
	public void testMultiply() {
		//meant to test multiply
		Calculator calc = new Calculator();
		calc.add(4);
		calc.multiply(3);
		assertTrue(calc.getTotal()==12);
	}
	
	@Test
	public void testDivide() {
		//meant to test divide
		Calculator calc = new Calculator();
		calc.add(6);
		calc.divide(3);
		assertTrue(calc.getTotal()==2);
	}
	
	@Test
	public void testDivide2() {
		//meant to test divide by 0
		Calculator calc = new Calculator();
		calc.add(6);
		calc.divide(0);
		assertTrue(calc.getTotal()==0);
	}
	
	@Test
	public void testGetHistory() {
		//meant to test getHistory
		Calculator calc = new Calculator();
		calc.add(6);
		calc.divide(3);
		calc.multiply(8);
		assertTrue(calc.getHistory().equals("0 + 6 / 3 * 8"));
	}

}
