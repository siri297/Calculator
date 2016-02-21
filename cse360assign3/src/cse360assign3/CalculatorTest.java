/** Name: Bhavana Chinta **/
/** Pin-216**/
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
	public void testCalculator() {          /** testCalculator method where it tests to make sure that the constructor does not  return a null.**/
		Calculator oList = new Calculator(); 
		/**oList=null;**/
		assertNotNull(oList);
	}

	@Test
	public void testAdd() {     /** Test case of add where the add method is tested by sample values **/
		Calculator oList = new Calculator();
		oList.add(3);
		oList.add(4);
		
		System.out.print(oList.getTotal());
		assertEquals("7", outContent.toString());
	}
	
	@Test
	public void testsubtract() {      /** Test case of subtract where the subtract method is tested by giving in some values **/
		Calculator oList = new Calculator();
		oList.add(10);
		oList.subtract(3);
		
		System.out.print(oList.getTotal());
		assertEquals("7", outContent.toString());
	}
	
	@Test
	public void testMultiply() {   /** Test case of multiply where the multiply method is tested by giving in some values **/
		Calculator oList = new Calculator();
		oList.add(4);
		oList.multiply(4);
		
		System.out.print(oList.getTotal());
		assertEquals("16", outContent.toString());
	}
	
	@Test
	public void testDivide() {    /** Test case of Divide where the divide method is tested by giving in some values **/
		Calculator oList = new Calculator();
		oList.divide(10);
		
		System.out.print(oList.getTotal());
		assertEquals("0", outContent.toString());
	}
	
	@Test
	public void testDivide_by_Zero() {  /** Divide by zero tests the divide method when a zero is pluged in and it checks whether it gives a zero or not **/
		Calculator oList = new Calculator();
		oList.divide(0); 
		
		System.out.print(oList.getTotal());
		assertEquals("0", outContent.toString());
	}
	
	@Test
	public void testGetTotal() {          /** This test case tests the getTotal() method which returns the total **/
		Calculator oList = new Calculator();
		oList.add(10);
		oList.subtract(5);
		oList.multiply(9);
		oList.divide(5);
		
		System.out.print(oList.getTotal());
		assertEquals("9", outContent.toString());
	}
	
	@Test
	public void testGetHistory() {              /** GetHistory() method is tested in such a way that the output should be number+sign and with spaces **/
		Calculator myCalculator = new Calculator();
		myCalculator.add (4);
		myCalculator.subtract (2);
		myCalculator.multiply (2);
		myCalculator.add(5);
		
		System.out.print(myCalculator.getHistory());
		assertEquals("0 + 4 – 2 * 2 + 5", outContent.toString());
	}
	

}
