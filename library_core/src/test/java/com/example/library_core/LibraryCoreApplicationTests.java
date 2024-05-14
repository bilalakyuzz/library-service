package com.example.library_core;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;




public class LibraryCoreApplicationTests extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LibraryCoreApplicationTests( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( LibraryCoreApplicationTests.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
