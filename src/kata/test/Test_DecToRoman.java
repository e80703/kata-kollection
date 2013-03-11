package kata.test;

import static org.junit.Assert.*;
import kata.implementation.DecToRoman;

import org.junit.Test;


public class Test_DecToRoman {

	@Test
	public void D_1_Is_I() {
		assertEquals("I",DecToRoman.convert(1));
	}

	@Test
	public void D_2_Is_II() {
		assertEquals("II",DecToRoman.convert(2));
	}
	
	@Test
	public void D_3_Is_III() {
		assertEquals("III",DecToRoman.convert(3));
	}
	
	@Test
	public void D_5_Is_V() {
		assertEquals("V",DecToRoman.convert(5));
	}
	
	@Test
	public void D_4_Is_IV() {
		assertEquals("IV",DecToRoman.convert(4));
	}

	@Test
	public void D_6_Is_VI() {
		assertEquals("VI",DecToRoman.convert(6));
	}
	
	@Test
	public void D_7_Is_VII() {
		assertEquals("VII",DecToRoman.convert(7));
	}
	
	@Test
	public void D_8_Is_VIII() {
		assertEquals("VIII",DecToRoman.convert(8));
	}
	
	@Test
	public void D_10_Is_X() {
		assertEquals("X",DecToRoman.convert(10));
	}
	
	@Test
	public void D_9_Is_IX() {
		assertEquals("IX",DecToRoman.convert(9));
	}
	
	@Test
	public void D_12_Is_XII() {
		assertEquals("XII",DecToRoman.convert(12));
	}
	
	@Test
	public void D_13_Is_XIII() {
		assertEquals("XIII",DecToRoman.convert(13));
	}
	
	@Test
	public void D_14_Is_XIV() {
		assertEquals("XIV",DecToRoman.convert(14));
	}
	
	@Test
	public void D_15_Is_XV() {
		assertEquals("XV",DecToRoman.convert(15));
	}
	
	@Test
	public void D_19_Is_XIX() {
		assertEquals("XIX",DecToRoman.convert(19));
	}
	
	@Test
	public void D_37_Is_XXXVII() {
		assertEquals("XXXVII",DecToRoman.convert(37));
	}
	
	@Test
	public void D_39_Is_XXXIX() {
		assertEquals("XXXIX",DecToRoman.convert(39));
	}
	
	@Test
	public void D_413_Is_CDXIII() {
		assertEquals("CDXIII",DecToRoman.convert(413));
	}
	
	@Test
	public void D_596_Is_DXCVI() {
		assertEquals("DXCVI",DecToRoman.convert(596));
	}
	
	@Test
	public void D_1923_Is_MCMXXIII() {
		assertEquals("MCMXXIII",DecToRoman.convert(1923));
	}
	
	@Test
	public void D_2849_Is_MMDCCCXLIX() {
		assertEquals("MMDCCCXLIX",DecToRoman.convert(2849));
	}
	
	
}
