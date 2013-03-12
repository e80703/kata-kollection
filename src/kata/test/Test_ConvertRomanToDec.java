package kata.test;

import kata.implementation.Converter;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_ConvertRomanToDec {

	@Test
	public void I_Is_1() {
		assertEquals(1, Converter.toDecimal("I"));
	}

	@Test
	public void II_Is_2() {
		assertEquals(2, Converter.toDecimal("II"));
	}

	@Test
	public void III_Is_3() {
		assertEquals(3, Converter.toDecimal("III"));
	}

	@Test
	public void IV_Is_4() {
		assertEquals(4, Converter.toDecimal("IV"));
	}

	@Test
	public void V_Is_5() {
		assertEquals(5, Converter.toDecimal("V"));
	}

	@Test
	public void VI_Is_6() {
		assertEquals(6, Converter.toDecimal("VI"));
	}

	@Test
	public void VII_Is_7() {
		assertEquals(7, Converter.toDecimal("VII"));
	}

	@Test
	public void VIII_Is_8() {
		assertEquals(8, Converter.toDecimal("VIII"));
	}

	@Test
	public void IX_Is_9() {
		assertEquals(9, Converter.toDecimal("IX"));
	}

	@Test
	public void X_Is_10() {
		assertEquals(10, Converter.toDecimal("X"));
	}

	@Test
	public void XX_Is_20() {
		assertEquals(20, Converter.toDecimal("XX"));
	}

	@Test
	public void XLVIII_Is_48() {
		assertEquals(48, Converter.toDecimal("XLVIII"));
	}

	@Test
	public void MCMLXXXVII_Is_1987() {
		assertEquals(1987, Converter.toDecimal("MCMLXXXVII"));
	}

}
