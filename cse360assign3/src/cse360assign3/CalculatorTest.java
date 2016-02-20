package cse360assign3;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
public class CalculatorTest {


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
	public void testCalculator() {
		Calculator oList = new Calculator();
		oList=null;
		assertNotNull(" ", outContent.toString());
	}

	@Test
	public void testAdd() {
		Calculator oList = new Calculator();
		oList.add(3);
		oList.add(4);
		
		System.out.print(oList.getTotal());
		assertEquals("7", outContent.toString());
	}
	
	@Test
	public void testsubtract() {
		Calculator oList = new Calculator();
		oList.add(10);
		oList.subtract(3);
		
		System.out.print(oList.getTotal());
		assertEquals("7", outContent.toString());
	}
	
	@Test
	public void testMultiply() {
		Calculator oList = new Calculator();
		oList.add(4);
		oList.multiply(4);
		
		System.out.print(oList.getTotal());
		assertEquals("16", outContent.toString());
	}
	
	@Test
	public void testDivide() {
		Calculator oList = new Calculator();
		oList.divide(10);
		
		System.out.print(oList.getTotal());
		assertEquals("0", outContent.toString());
	}
	
	@Test
	public void testGetTotal() {
		Calculator oList = new Calculator();
		oList.add(10);
		oList.subtract(5);
		oList.multiply(9);
		oList.divide(5);
		
		System.out.print(oList.getTotal());
		assertEquals("45", outContent.toString());
	}
	   

}
