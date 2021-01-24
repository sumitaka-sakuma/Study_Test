package test;

import static org.junit.Assert.*;

import org.junit.Test;

import test_practice.Calculator;

public class CalculatorTest {

	@Test
	public void multiplyTest() {

		Calculator cal = new Calculator();
		int expected = 20;
		int actual = cal.multiply(4, 5);
		assertEquals(expected, actual);
	}

	@Test
	public void divideTest(){

		Calculator cal = new Calculator();
		int expected = 5;
		int actual = cal.divide(20, 4);
		assertEquals(expected, actual);
	}
}
