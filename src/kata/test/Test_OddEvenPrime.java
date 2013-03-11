package kata.test;

import kata.implementation.OddEvenPrime;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test_OddEvenPrime {

	@Test
	public void one() {
		assertEquals("Odd", OddEvenPrime.detect(1));
	}

	@Test
	public void two() {
		assertEquals("2", OddEvenPrime.detect(2));
	}

	@Test
	public void three() {
		assertEquals("3", OddEvenPrime.detect(3));
	}

	@Test
	public void fourIsEven() {
		assertEquals("Even", OddEvenPrime.detect(4));
	}

	@Test
	public void five() {
		assertEquals("5", OddEvenPrime.detect(5));
	}

	@Test
	public void sixIsEven() {
		assertEquals("Even", OddEvenPrime.detect(6));
	}

	@Test
	public void seven() {
		assertEquals("7", OddEvenPrime.detect(7));
	}

	@Test
	public void eightIsEven() {
		assertEquals("Even", OddEvenPrime.detect(8));
	}

	@Test
	public void nineIsOdd() {
		assertEquals("Odd", OddEvenPrime.detect(9));
	}

	@Test
	public void tenIsEven() {
		assertEquals("Even", OddEvenPrime.detect(10));
	}

	@Test
	public void eleven() {
		assertEquals("11", OddEvenPrime.detect(11));
	}

	@Test
	public void twelveIsEven() {
		assertEquals("Even", OddEvenPrime.detect(12));
	}

	@Test
	public void thirteen() {
		assertEquals("13", OddEvenPrime.detect(13));
	}

	@Test
	public void nineIsNotPrime() {
		assertFalse(OddEvenPrime.isPrime(9));
	}

	@Test
	public void oneIsNotPrime() {
		assertFalse(OddEvenPrime.isPrime(1));
	}

	@Test
	public void twoIsPrime() {
		assertTrue(OddEvenPrime.isPrime(2));
	}

	@Test
	public void threeIsPrime() {
		assertTrue(OddEvenPrime.isPrime(3));
	}

}
