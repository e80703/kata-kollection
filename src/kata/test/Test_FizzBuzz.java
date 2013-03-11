package kata.test;

import kata.implementation.FizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_FizzBuzz {

	@Test
	public void ReturnValueIsString() {
		Object o = FizzBuzz.getValue(1);
		assertTrue(o instanceof String);
	}
	
	@Test
	public void OneIsOne() {
		assertEquals(FizzBuzz.getValue(1),"1");
	}

	@Test
	public void TwoIsTwo() {
		assertEquals(FizzBuzz.getValue(2),"2");
	}
	
	@Test
	public void ThreeIsFizz() {
		assertEquals(FizzBuzz.getValue(3),"Fizz");
	}
	
	@Test
	public void FourIsFour() {
		assertEquals(FizzBuzz.getValue(4),"4");
	}
	
	@Test
	public void FiveIsBuzz() {
		assertEquals(FizzBuzz.getValue(5),"Buzz");
	}
	
	@Test
	public void SixIsFizz() {
		assertEquals(FizzBuzz.getValue(6),"Fizz");
	}
	
	@Test
	public void SevenIsSeven() {
		assertEquals(FizzBuzz.getValue(7),"7");
	}
	
	@Test
	public void EightIsEight() {
		assertEquals(FizzBuzz.getValue(8),"8");
	}
	
	@Test
	public void NineIsFizz() {
		assertEquals(FizzBuzz.getValue(9),"Fizz");
	}
	
	@Test
	public void TenIsBuzz() {
		assertEquals(FizzBuzz.getValue(10),"Buzz");
	}
	
	@Test
	public void ThirteenIs13() {
		assertEquals(FizzBuzz.getValue(13),"13");
	}
	
	@Test
	public void FifteenIsFizzBuzz() {
		assertEquals(FizzBuzz.getValue(15),"FizzBuzz");
	}
	
	@Test
	public void EightTeenIsFizz() {
		assertEquals(FizzBuzz.getValue(18),"Fizz");
	}
	
	@Test
	public void TwentyIsBuzz() {
		assertEquals(FizzBuzz.getValue(20),"Buzz");
	}
	
	@Test
	public void ThirtyIsFizzBuzz() {
		assertEquals(FizzBuzz.getValue(30),"FizzBuzz");
	}
	

	
	
	
}
