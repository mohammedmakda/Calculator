package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Calculator;

public class KeyPressTests {

	@Test
	public void testPressingADigitKey() {
		Calculator calculator = new Calculator();
		int expectedValue = 9;
		calculator.pressDigitKey(9);
		int actualValue = calculator.getValue();
		assertTrue("I pressed the "+expectedValue +" key, but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}

	@Test
	public void testPressing9Then8() {
		Calculator calculator = new Calculator();
		int expectedValue = 98;
		calculator.pressDigitKey(9);
		calculator.pressDigitKey(8);
		int actualValue = calculator.getValue();
		assertTrue("I pressed 9 8, expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}

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
	public void test12Plus34() {
		Calculator calculator = new Calculator();
		int expectedValue = 34;
		calculator.pressDigitKey(1);
		calculator.pressDigitKey(2);
		calculator.pressPlusKey();
		calculator.pressDigitKey(3);
		calculator.pressDigitKey(4);
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 2 + 3 4 expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}

	@Test
	public void test1Plus3Times5Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 16;
		calculator.pressDigitKey(1);
		calculator.pressPlusKey();
		calculator.pressDigitKey(3);
		calculator.pressTimesKey();
		calculator.pressDigitKey(5);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 + 3 * 5 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}

	@Test
	public void test4Plus6Divide2Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 7;
		calculator.pressDigitKey(4);
		calculator.pressPlusKey();
		calculator.pressDigitKey(6);
		calculator.pressDivideKey();
		calculator.pressDigitKey(2);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 4 + 6 / 2 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}


	@Test
	public void test4Minus6Divide2Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 1;
		calculator.pressDigitKey(4);
		calculator.pressMinusKey();
		calculator.pressDigitKey(6);
		calculator.pressDivideKey();
		calculator.pressDigitKey(2);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 4 - 6 / 2 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}

	@Test
	public void test7Divide3Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 2;
		calculator.pressDigitKey(7);
		calculator.pressDivideKey();
		calculator.pressDigitKey(3);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 7 / 3 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}

	public void test8Divide3Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 2;
		calculator.pressDigitKey(8);
		calculator.pressDivideKey();
		calculator.pressDigitKey(3);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 8 / 3 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}

	public void test9Divide3Equals() {
		Calculator calculator = new Calculator();
		int expectedValue = 3;
		calculator.pressDigitKey(9);
		calculator.pressDivideKey();
		calculator.pressDigitKey(3);
		calculator.pressEqualsKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 9 / 3 = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}

	@Test
	public void test1Plus3TimesClear() {
		Calculator calculator = new Calculator();
		int expectedValue = 0;
		calculator.pressDigitKey(1);
		calculator.pressPlusKey();
		calculator.pressDigitKey(3);
		calculator.pressTimesKey();
		calculator.pressClearKey();
		int actualValue = calculator.getValue();
		assertTrue("I pressed 1 + 3 * C = expecting the answer to be "+expectedValue +", but the value in the calculator is "+actualValue,
				   actualValue == expectedValue);
	}
}
