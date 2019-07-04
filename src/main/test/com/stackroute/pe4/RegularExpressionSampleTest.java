package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionSampleTest {
    RegularExpressionSample expressionSample;
    @Before
    public void setUp()
    {
        expressionSample=new RegularExpressionSample();
    }
    @After
    public void tearDown()
    {
        expressionSample=null;
    }
    @Test
    public void givenStringWithHarryShouldReturnTrue() {
//        arrange
        String result = expressionSample.finder("This is Harry");
//        assert
        assertEquals("Is Harry here? True", result);
    }
    @Test
    public void givenStringWithoutHarryShouldReturnFalse() {
//        arrange
        String result = expressionSample.finder("This is Henry");
//        assert
        assertEquals("Is Harry here? False", result);
    }
    @Test
    public void givenStringNullShouldReturnMessage() {
//        arrange
        String result = expressionSample.finder(null);
//        assert
        assertEquals("Null String", result);
    }
    @Test
    public void givenStringEmptyShouldReturnMessage() {
//        arrange
        String result = expressionSample.finder("");
//        assert
        assertEquals("Empty String", result);
    }
}