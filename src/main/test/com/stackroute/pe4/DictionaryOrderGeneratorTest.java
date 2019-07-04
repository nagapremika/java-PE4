package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.*;

public class DictionaryOrderGeneratorTest {
    DictionaryOrderGenerator order;
    @Before
    public void setUp()

    {
        order=new DictionaryOrderGenerator();
    }
    @After
    public void tearDown()

    {
        order=null;
    }
    @Test
    public void givenStringShouldReturnInAlphabeticalOrder()
    {
//        arrange
        String result=order.dictionary( "this is a program");
        //        assert
                assertEquals("[a, is, program, this]", result);
    }
    @Test
    public void givenEmptyStringShouldReturnMessage()
    {
//        arrange
        String result=order.dictionary( "");
        //        assert
        assertEquals("Empty String", result);
    }
    @Test
    public void givenNullShouldReturnMessage()
    {
//        arrange
        String result=order.dictionary( null);
        //        assert
        assertEquals("Null String", result);
    }
}