package kata.test;

import kata.implementation.LeapYear;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_LeapYear {

	// leap years

	@Test
	public void leap_1600() {
		assertTrue(LeapYear.isLeapYear(1600));
	}

	@Test
	public void leap_1988() {
		assertTrue(LeapYear.isLeapYear(1988));
	}

	@Test
	public void leap_1992() {
		assertTrue(LeapYear.isLeapYear(1992));
	}

	@Test
	public void leap_1996() {
		assertTrue(LeapYear.isLeapYear(1996));
	}

	@Test
	public void leap_2000() {
		assertTrue(LeapYear.isLeapYear(2000));
	}

	@Test
	public void leap_2004() {
		assertTrue(LeapYear.isLeapYear(2004));
	}

	@Test
	public void leap_2008() {
		assertTrue(LeapYear.isLeapYear(2008));
	}

	// commmon years

	@Test
	public void common_1700() {
		assertFalse(LeapYear.isLeapYear(1700));
	}

	@Test
	public void common_1800() {
		assertFalse(LeapYear.isLeapYear(1800));
	}

	@Test
	public void common_1900() {
		assertFalse(LeapYear.isLeapYear(1900));
	}

	@Test
	public void common_2100() {
		assertFalse(LeapYear.isLeapYear(2100));
	}

	@Test
	public void common_2001() {
		assertFalse(LeapYear.isLeapYear(2001));
	}

}
