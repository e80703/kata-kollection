package kata.test;

import kata.implementation.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_FizzBuzz {

	@Test
	public void returnValueIsString() {
		Object o = FizzBuzz.getValue(1);
		assertTrue(o instanceof String);
	}

	@Test
	public void oneIsOne() {
		assertEquals(FizzBuzz.getValue(1), "1");
	}

	@Test
	public void twoIsTwo() {
		assertEquals(FizzBuzz.getValue(2), "2");
	}

	@Test
	public void threeIsFizz() {
		assertEquals(FizzBuzz.getValue(3), "Fizz");
	}

	@Test
	public void fourIsFour() {
		assertEquals(FizzBuzz.getValue(4), "4");
	}

	@Test
	public void fiveIsBuzz() {
		assertEquals(FizzBuzz.getValue(5), "Buzz");
	}

	@Test
	public void sixIsFizz() {
		assertEquals(FizzBuzz.getValue(6), "Fizz");
	}

	@Test
	public void sevenIsSeven() {
		assertEquals(FizzBuzz.getValue(7), "7");
	}

	@Test
	public void eightIsEight() {
		assertEquals(FizzBuzz.getValue(8), "8");
	}

	@Test
	public void nineIsFizz() {
		assertEquals(FizzBuzz.getValue(9), "Fizz");
	}

	@Test
	public void tenIsBuzz() {
		assertEquals(FizzBuzz.getValue(10), "Buzz");
	}

	@Test
	public void thirteenIs13() {
		assertEquals(FizzBuzz.getValue(13), "13");
	}

	@Test
	public void fifteenIsFizzBuzz() {
		assertEquals(FizzBuzz.getValue(15), "FizzBuzz");
	}

	@Test
	public void eightTeenIsFizz() {
		assertEquals(FizzBuzz.getValue(18), "Fizz");
	}

	@Test
	public void twentyIsBuzz() {
		assertEquals(FizzBuzz.getValue(20), "Buzz");
	}

	@Test
	public void thirtyIsFizzBuzz() {
		assertEquals(FizzBuzz.getValue(30), "FizzBuzz");
	}

}
