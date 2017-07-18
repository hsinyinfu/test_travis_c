package cc.openhome;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	private App app;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

	protected void setUp(){
		app = new App();
		System.out.println("setUp() is executed");
	}

	protected void  tearDown(){
		app = null;
		System.out.println("tearDown is executed");
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
        assertEquals("Hello World!", app.print());
    }
}
