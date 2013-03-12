package kata.test;

import kata.implementation.CalcString;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class Test_CalcString {

	// mistakes

	@Test
	public void mistake1_1() {
		assertEquals(0, CalcString.add(",0"));
	}

	@Test
	public void mistake1_2() {
		assertEquals(0, CalcString.add("0,"));
	}

	@Test
	public void mistake1_3() {
		assertEquals(-1, CalcString.add("-1,"));
	}

	@Test
	public void mistake1_4() {
		assertEquals(13, CalcString.add("13,"));
	}

	@Test
	public void mistake2() {
		assertEquals(0, CalcString.add(","));
	}

	@Test
	public void mistake4() {
		assertEquals(0, CalcString.add("-,"));
	}

	@Test
	public void mistake5() {
		assertEquals(0, CalcString.add("--,gfa"));
	}

	@Test
	public void mistake6() {
		assertEquals(0, CalcString.add("l,"));
	}

	@Test
	public void mistake7() {
		assertEquals(0, CalcString.add("bfakl,"));
	}

	@Test
	public void mistake8() {
		assertEquals(0, CalcString.add("-bfakl,"));
	}

	// valid values

	@Test
	public void emptyIsEmpty() {
		assertThat(CalcString.add(), is(equalTo(null)));
	}

	@Test
	public void oneIsSelf0() {
		assertEquals(0, CalcString.add(""));
	}

	@Test
	public void oneIsSelf1() {
		assertEquals(1, CalcString.add("1"));
	}

	@Test
	public void oneIsSelf2() {
		assertEquals(11, CalcString.add("11"));
	}

	@Test
	public void oneIsSelf3() {
		assertEquals(111, CalcString.add("111"));
	}

	@Test
	public void oneIsSelf4() {
		assertEquals(-13, CalcString.add("-13"));
	}

	@Test
	public void onePlusOne1() {
		assertEquals(5, CalcString.add("2,3"));
	}

	@Test
	public void onePlusOne2() {
		assertEquals(23, CalcString.add("11,12"));
	}

	@Test
	public void onePlusOne3() {
		assertEquals(744, CalcString.add("321,423"));
	}

	@Test
	public void onePlusOne4() {
		assertEquals(0, CalcString.add("0,0"));
	}

	@Test
	public void onePlusOne5() {
		assertEquals(-1, CalcString.add("0,-1"));
	}

	@Test
	public void onePlusOne6() {
		assertEquals(-23, CalcString.add("-10,-13"));
	}

	@Test
	public void onePlusMany1() {
		assertEquals(31, CalcString.add("10,1,2,3,4,5,6"));
	}

	@Test
	public void onePlusMany2() {
		assertEquals(88, CalcString.add("-10,-13,0,11,100"));
	}

	@Test
	public void onePlusMany3() {
		assertEquals(0, CalcString.add("-10,0,10,0"));
	}

}
