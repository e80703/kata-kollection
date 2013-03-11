package kata.test;

import static org.junit.Assert.*;
import kata.implementation.CalcSimple;

import org.junit.Before;
import org.junit.Test;


public class Test_CalcSimple {

	private CalcSimple c;
	
	@Before
	public void initialize() {
		c = new CalcSimple();
	}

	@Test
	public void GetMin0() {
		c.setSequence(new int[]{});
		assertNull(c.getSequence());
	}

	@Test
	public void GetMin1() {
		c.setSequence(new int[]{3,4,13,1,2,44,96});
		assertEquals(1, c.getMin());
	}
	
	@Test
	public void GetMin2() {
		c.setSequence(new int[]{111,13,44,96});
		assertEquals(13, c.getMin());
	}
	
	@Test
	public void GetMin3() {
		c.setSequence(new int[]{111,13,44,96,13});
		assertEquals(13, c.getMin());
	}
	
	@Test
	public void GetMax1() {
		c.setSequence(new int[]{1,2,3,4,13,96,44});
		assertEquals(96, c.getMax());
	}
	
	@Test
	public void GetMax2() {
		c.setSequence(new int[]{1,2,3,4,13,111,44,96});
		assertEquals(111, c.getMax());
	}
	
	@Test
	public void Avg1int() {
		c.setSequence(new int[]{1,2,3,4,13,44,96});
		assertEquals(23, c.getAverage());
	}

	@Test
	public void Avg2int() {
		c.setSequence(new int[]{1,2,3,4,13,44,96,111});
		assertEquals(34, c.getAverage());
	}
	
	@Test
	public void SeqLen2() {
		c.setSequence(new int[]{4,13,44,96,111});
		assertEquals(5, c.length());
	}
	
	@Test
	public void SeqLen3() {
		c.setSequence(new int[]{1,2,3,4,13,44,96,111});
		assertEquals(8, c.length());
	}
	
}
