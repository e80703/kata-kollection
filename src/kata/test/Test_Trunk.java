package kata.test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test_Trunk {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
		System.setErr(null);
	}

	@Test
	public void out() {
		System.out.print("hello");
		assertEquals("hello", outContent.toString());
	}

	@Test
	public void err() {
		System.err.print("hello again");
		assertEquals("hello again", errContent.toString());
	}

	@Test
	public void hamcrestTest() {
		double d = 1.3;
		assertThat(d, is(1.3));
		assertThat(d, is(not(1.4)));
	}
	
}
