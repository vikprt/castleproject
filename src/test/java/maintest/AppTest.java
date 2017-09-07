package maintest;

import java.util.Arrays;

import castle.PeakAndValley;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Test One 
     */
    public void testDataSetOne() {
    	int[] values = {2,6,1,6,3};
    	System.out.println("Test Case for values =  " + Arrays.toString(values));    	
		int castles = new PeakAndValley().solution(values);
		assertEquals("Total number of castles should be 5", castles, 5);
    }
    
    /**
     * Test Two 
     */
    public void testDataSetTwo() {
    	int[] values = {1, 5, 5, 6, 5, 5, 1 };
    	System.out.println("Test Case for values =  " + Arrays.toString(values));    	
		int castles = new PeakAndValley().solution(values);
		assertEquals("Total number of castles should be 3", castles, 3);
    }
    
    /**
     * Test Three 
     */
    public void testDataSetThree() {
    	int[] values = { 1, 2, 3, 4, 5, 6, 7, 8 };
    	System.out.println("Test Case for values =  " + Arrays.toString(values));    	
		int castles = new PeakAndValley().solution(values);
		assertEquals("Total number of castles should be 2", castles, 2);
    }
    
    /**
     * Test Four 
     */
    public void testDataSetFour() {
    	int[] values = { 1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2 };
    	System.out.println("Test Case for values =  " + Arrays.toString(values));    	
		int castles = new PeakAndValley().solution(values);
		assertEquals("Total number of castles should be 7", castles, 7);
    }    
}
