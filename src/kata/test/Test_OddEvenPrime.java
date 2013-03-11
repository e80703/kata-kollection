package kata.test;

import kata.implementation.OddEvenPrime;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test_OddEvenPrime {

	@Test
	public void One() {
		assertEquals("Odd", OddEvenPrime.detect(1));
	}

	@Test
	public void Two() {
		assertEquals("2", OddEvenPrime.detect(2));
	}
	
	@Test
	public void Three() {
		assertEquals("3", OddEvenPrime.detect(3));
	}
	
	@Test
	public void FourIsEven() {
		assertEquals("Even", OddEvenPrime.detect(4));
	}
	
	@Test
	public void Five() {
		assertEquals("5", OddEvenPrime.detect(5));
	}
	
	@Test
	public void SixIsEven() {
		assertEquals("Even", OddEvenPrime.detect(6));
	}
	
	@Test
	public void Seven() {
		assertEquals("7", OddEvenPrime.detect(7));
	}
	
	@Test
	public void EightIsEven() {
		assertEquals("Even", OddEvenPrime.detect(8));
	}
	
	@Test
	public void NineIsOdd() {
		assertEquals("Odd", OddEvenPrime.detect(9));
	}
	
	@Test
	public void TenIsEven() {
		assertEquals("Even", OddEvenPrime.detect(10));
	}
	
	@Test
	public void Eleven() {
		assertEquals("11", OddEvenPrime.detect(11));
	}
	
	@Test
	public void TwelveIsEven() {
		assertEquals("Even", OddEvenPrime.detect(12));
	}
	
	@Test
	public void Thirteen() {
		assertEquals("13", OddEvenPrime.detect(13));
	}
	
	@Test
	public void NineIsNotPrime() {
		assertFalse(OddEvenPrime.isPrime(9));
	}

	@Test
	public void OneIsNotPrime() {
		assertFalse(OddEvenPrime.isPrime(1));
	}
	
	@Test
	public void TwoIsPrime() {
		assertTrue(OddEvenPrime.isPrime(2));
	}
	
	@Test
	public void ThreeIsPrime() {
		assertTrue(OddEvenPrime.isPrime(3));
	}
	
	
	
}
