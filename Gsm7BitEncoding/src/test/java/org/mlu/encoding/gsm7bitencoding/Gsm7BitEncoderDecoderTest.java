package org.mlu.encoding.gsm7bitencoding;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Gsm7BitEncoderDecoderTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Gsm7BitEncoderDecoderTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( Gsm7BitEncoderDecoderTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testEncodingDecoding()
    {
        Gsm7BitEncoderDecoder converter = new Gsm7BitEncoderDecoder();
        String s = "abc";
        String encoded = converter.encode(s);
        String decoded = converter.decode(encoded);
        assertEquals(s, decoded);
    }
}
