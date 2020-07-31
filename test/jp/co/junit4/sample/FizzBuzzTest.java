/**
 *
 */
package jp.co.junit4.sample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author apple
 *
 */
public class FizzBuzzTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	public void fizzBuzz9() {
		assertEquals("Fizz",FizzBuzz.checkFizzBuzz(9));
	}

	@Test
	public void fizzBuzz20() {
		assertEquals("Buzz",FizzBuzz.checkFizzBuzz(20));
	}

	@Test
	public void fizzBuzz45() {
		assertEquals("FizzBuzz",FizzBuzz.checkFizzBuzz(45));
	}

	@Test
	public void fizzBuzz44() {
		assertEquals("44",FizzBuzz.checkFizzBuzz(44));
	}

	@Test
	public void fizzBuzz46() {
		assertEquals("46",FizzBuzz.checkFizzBuzz(46));
	}
}
