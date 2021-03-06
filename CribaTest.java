

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CribaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CribaTest
{
    /**
     * Default constructor for test class CribaTest
     */
    public CribaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testPrimos()
    {
        int[] nullArray = Criba.generarPrimos(0);
        assertEquals(nullArray.length,0);
        
        int[] minArray = Criba.generarPrimos(2);
        assertEquals(minArray.length,1);
        assertEquals(minArray[0],2);
        
        int[] threeArray = Criba.generarPrimos(3);
        assertEquals(threeArray.length,2);
        assertEquals(threeArray[0],2);
        assertEquals(threeArray[1],3);
        
        int[] centArray = Criba.generarPrimos(100);
        assertEquals(centArray.length,25);
        assertEquals(centArray[24],97);
    }
}

