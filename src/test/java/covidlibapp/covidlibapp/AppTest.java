package covidlibapp.covidlibapp;

import org.apache.commons.math3.distribution.NormalDistribution;

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
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    /*
     * Test Chance en moyenne
     * */
    public void testCovidChanceEnMoyenne() {
    	NormalDistribution normalDistribution = new NormalDistribution(5, 5);
    	COVIDLib test = new COVIDLib();
    	
    	double maMoyenne = test.covidChanceEnMoyenne(normalDistribution, 5);
    	
    	assertEquals(maMoyenne, 0.5);
    }
    
    /*
     * Test Chance durée
     * */
    public void testCovidChanceDurree() {
    	NormalDistribution normalDistribution = new NormalDistribution(5, 5);
    	COVIDLib test = new COVIDLib();
    	
    	double maMoyenne = test.covidChanceDurree(normalDistribution, 5, 5);
    	
    	assertEquals(maMoyenne, 0.0);
    }
}
