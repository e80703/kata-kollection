package kata.test;

import kata.implementation.CalcSimple;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_CalcSimple {

	private CalcSimple c;

	@Before
	public void initialize() {
		c = new CalcSimple();
	}

	@Test
	public void getMin0() {
		c.setSequence(new int[] {});
		assertNull(c.getSequence());
	}

	@Test
	public void getMin1() {
		c.setSequence(new int[] { 3, 4, 13, 1, 2, 44, 96 });
		assertEquals(1, c.getMin());
	}

	@Test
	public void getMin2() {
		c.setSequence(new int[] { 111, 13, 44, 96 });
		assertEquals(13, c.getMin());
	}

	@Test
	public void getMin3() {
		c.setSequence(new int[] { 111, 13, 44, 96, 13 });
		assertEquals(13, c.getMin());
	}

	@Test
	public void getMax1() {
		c.setSequence(new int[] { 1, 2, 3, 4, 13, 96, 44 });
		assertEquals(96, c.getMax());
	}

	@Test
	public void getMax2() {
		c.setSequence(new int[] { 1, 2, 3, 4, 13, 111, 44, 96 });
		assertEquals(111, c.getMax());
	}

	@Test
	public void avg1int() {
		c.setSequence(new int[] { 1, 2, 3, 4, 13, 44, 96 });
		assertEquals(23, c.getAverage());
	}

	@Test
	public void avg2int() {
		c.setSequence(new int[] { 1, 2, 3, 4, 13, 44, 96, 111 });
		assertEquals(34, c.getAverage());
	}

	@Test
	public void seqLen2() {
		c.setSequence(new int[] { 4, 13, 44, 96, 111 });
		assertEquals(5, c.length());
	}

	@Test
	public void seqLen3() {
		c.setSequence(new int[] { 1, 2, 3, 4, 13, 44, 96, 111 });
		assertEquals(8, c.length());
	}

}
