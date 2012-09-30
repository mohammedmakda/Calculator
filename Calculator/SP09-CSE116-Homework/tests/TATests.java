package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Calculator;

public class TATests {

	// ------------- Written by Mohammed ------------
	@Test
	public void test12Plus34Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 46;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressPlusKey();
		calculator.pressDigitKey(3);
		calculator.pressDigitKey(4);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 + 3 4 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	@Test
	public void test12Minus4Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 8;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressMinusKey();
		calculator.pressDigitKey(4);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 - 4 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	@Test
	public void test12Times3Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 36;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressTimesKey();
		calculator.pressDigitKey(3);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 * 3 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	@Test
	public void test3Divides12Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 4;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressDivideKey();
		calculator.pressDigitKey(3);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 / 3 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	// -------------
	@Test
	public void test12Plus3Plus4Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 19;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressPlusKey();
		calculator.pressDigitKey(3);
		calculator.pressPlusKey();
		calculator.pressDigitKey(4);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 + 3 + 4 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	@Test
	public void test12Plus4Minus3Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 13;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressPlusKey();
		calculator.pressDigitKey(4);
		calculator.pressMinusKey();
		calculator.pressDigitKey(3);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 + 4 - 3 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	@Test
	public void test12Plus4Times3Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 24;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressPlusKey();
		calculator.pressDigitKey(4);
		calculator.pressTimesKey();
		calculator.pressDigitKey(3);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 + 4 * 3 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	@Test
	public void test12Plus3Divides4Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 13;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressPlusKey();
		calculator.pressDigitKey(4);
		calculator.pressDivideKey();
		calculator.pressDigitKey(3);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 + 4 / 3 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	// ----------------
	@Test
	public void test12Minus3Plus4Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 13;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressMinusKey();
		calculator.pressDigitKey(3);
		calculator.pressPlusKey();
		calculator.pressDigitKey(4);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 - 3 + 4 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	@Test
	public void test12Minus4Minus3Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 5;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressMinusKey();
		calculator.pressDigitKey(4);
		calculator.pressMinusKey();
		calculator.pressDigitKey(3);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 - 4 - 3 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	@Test
	public void test12Minus4Times3Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 0;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressMinusKey();
		calculator.pressDigitKey(4);
		calculator.pressTimesKey();
		calculator.pressDigitKey(3);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 - 4 * 3 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	@Test
	public void test12Minus3Divides4Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 11;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressMinusKey();
		calculator.pressDigitKey(4);
		calculator.pressDivideKey();
		calculator.pressDigitKey(3);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 - 4 / 3 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	// -------------------
	@Test
	public void test12Times3Plus4Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 40;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressTimesKey();
		calculator.pressDigitKey(3);
		calculator.pressPlusKey();
		calculator.pressDigitKey(4);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 * 3 + 4 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	@Test
	public void test12Times4Minus3Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 45;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressTimesKey();
		calculator.pressDigitKey(4);
		calculator.pressMinusKey();
		calculator.pressDigitKey(3);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 * 4 - 3 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	@Test
	public void test12Times4Times3Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 144;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressTimesKey();
		calculator.pressDigitKey(4);
		calculator.pressTimesKey();
		calculator.pressDigitKey(3);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 * 4 * 3 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	@Test
	public void test12Times3Divides4Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 16;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressTimesKey();
		calculator.pressDigitKey(4);
		calculator.pressDivideKey();
		calculator.pressDigitKey(3);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 * 4 / 3 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	// -------------------
	@Test
	public void test4Divides12Plus3Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 6;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressDivideKey();
		calculator.pressDigitKey(4);
		calculator.pressPlusKey();
		calculator.pressDigitKey(3);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 / 4 + 3 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	@Test
	public void test4Divides12Minus3Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 0;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressDivideKey();
		calculator.pressDigitKey(4);
		calculator.pressMinusKey();
		calculator.pressDigitKey(3);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 / 4 - 3 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	@Test
	public void test4Divides12Times3Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 9;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressDivideKey();
		calculator.pressDigitKey(4);
		calculator.pressTimesKey();
		calculator.pressDigitKey(3);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 / 4 * 3 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	@Test
	public void test3Divides4Divides12quals() {
		Calculator calculator = new Calculator();
		int expectedValue = 1;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressDivideKey();
		calculator.pressDigitKey(4);
		calculator.pressDivideKey();
		calculator.pressDigitKey(3);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 / 4 / 3 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}

	// The following two cases test getting into and out of the Error State
	@Test
	public void transitionToError() {
		Calculator calculator = new Calculator();
		int expectedValue = -99999999;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressDivideKey();
		calculator.pressPlusKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 / + expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	@Test
	public void transitionOutOfError() {
		Calculator calculator = new Calculator();
		int expectedValue = 0;
		calculator.pressDigitKey(1);
		calculator.pressDivideKey();
		calculator.pressPlusKey();
		calculator.pressClearKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 / + C = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
	
	
	// ------------------------------
	
}
