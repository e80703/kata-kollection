package kata.test;

import kata.implementation.Converter;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_ConvertDecToRoman {

	@Test
	public void d_1_Is_I() {
		assertEquals("I", Converter.toRoman(1));
	}

	@Test
	public void d_2_Is_II() {
		assertEquals("II", Converter.toRoman(2));
	}

	@Test
	public void d_3_Is_III() {
		assertEquals("III", Converter.toRoman(3));
	}

	@Test
	public void d_5_Is_V() {
		assertEquals("V", Converter.toRoman(5));
	}

	@Test
	public void d_4_Is_IV() {
		assertEquals("IV", Converter.toRoman(4));
	}

	@Test
	public void d_6_Is_VI() {
		assertEquals("VI", Converter.toRoman(6));
	}

	@Test
	public void d_7_Is_VII() {
		assertEquals("VII", Converter.toRoman(7));
	}

	@Test
	public void d_8_Is_VIII() {
		assertEquals("VIII", Converter.toRoman(8));
	}

	@Test
	public void d_10_Is_X() {
		assertEquals("X", Converter.toRoman(10));
	}

	@Test
	public void d_9_Is_IX() {
		assertEquals("IX", Converter.toRoman(9));
	}

	@Test
	public void d_12_Is_XII() {
		assertEquals("XII", Converter.toRoman(12));
	}

	@Test
	public void d_13_Is_XIII() {
		assertEquals("XIII", Converter.toRoman(13));
	}

	@Test
	public void d_14_Is_XIV() {
		assertEquals("XIV", Converter.toRoman(14));
	}

	@Test
	public void d_15_Is_XV() {
		assertEquals("XV", Converter.toRoman(15));
	}

	@Test
	public void d_19_Is_XIX() {
		assertEquals("XIX", Converter.toRoman(19));
	}

	@Test
	public void d_37_Is_XXXVII() {
		assertEquals("XXXVII", Converter.toRoman(37));
	}

	@Test
	public void d_39_Is_XXXIX() {
		assertEquals("XXXIX", Converter.toRoman(39));
	}

	@Test
	public void d_413_Is_CDXIII() {
		assertEquals("CDXIII", Converter.toRoman(413));
	}

	@Test
	public void d_596_Is_DXCVI() {
		assertEquals("DXCVI", Converter.toRoman(596));
	}

	@Test
	public void d_1923_Is_MCMXXIII() {
		assertEquals("MCMXXIII", Converter.toRoman(1923));
	}

	@Test
	public void d_2849_Is_MMDCCCXLIX() {
		assertEquals("MMDCCCXLIX", Converter.toRoman(2849));
	}

	@Test
	public void bigIsMCMLXXXVII() {
		assertEquals("MCMLXXXVII", Converter.toRoman(1987));
	}

	@Test
	public void bigIsDCLXVI() {
		assertEquals("DCLXVI", Converter.toRoman(666));
	}

	@Test
	public void bigIsCMXIII() {
		assertEquals("CMXIII", Converter.toRoman(913));
	}

}
