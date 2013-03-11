package kata.test;

import static org.junit.Assert.*;
import kata.implementation.LeapYear;

import org.junit.Test;


public class Test_LeapYear {

	// leap years
	
	@Test
	public void Leap_1600() {
		assertTrue(LeapYear.isLeapYear(1600));
	}
	
	@Test
	public void Leap_1988() {
		assertTrue(LeapYear.isLeapYear(1988));
	}

	@Test
	public void Leap_1992() {
		assertTrue(LeapYear.isLeapYear(1992));
	}
	
	@Test
	public void Leap_1996() {
		assertTrue(LeapYear.isLeapYear(1996));
	}
	
	@Test
	public void Leap_2000() {
		assertTrue(LeapYear.isLeapYear(2000));
	}
	
	@Test
	public void Leap_2004() {
		assertTrue(LeapYear.isLeapYear(2004));
	}
	
	@Test
	public void Leap_2008() {
		assertTrue(LeapYear.isLeapYear(2008));
	}
	
	// commmon years
	
	@Test
	public void Common_1700() {
		assertFalse(LeapYear.isLeapYear(1700));
	}
	
	@Test
	public void Common_1800() {
		assertFalse(LeapYear.isLeapYear(1800));
	}
	
	@Test
	public void Common_1900() {
		assertFalse(LeapYear.isLeapYear(1900));
	}
	
	@Test
	public void Common_2100() {
		assertFalse(LeapYear.isLeapYear(2100));
	}
	
	@Test
	public void Common_2001() {
		assertFalse(LeapYear.isLeapYear(2001));
	}
	
}
