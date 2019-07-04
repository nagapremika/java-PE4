package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCounterTest {
    CharacterCounter count;
    @Before
    public void setUp()
    {
        count=new CharacterCounter();
    }
    @After
    public void tearDown()
    {
        count=null;
    }
    @Test
    public void givenStringAndCharacterShouldReturnCharacterCount()
    {
//        arrange
        String result=count.counter("java again and again","a");
//        assert
        assertEquals("Character frequency is 7",result);
    }
    @Test
    public void givenEmptyStringShouldReturnMessage()
    {
//        arrange
        String result=count.counter("","a");
//        assert
        assertEquals("Empty string",result);
    }
    @Test
    public void givenNullStringShouldReturnMessage()
    {
//        arrange
        String result=count.counter(null,"a");
//        assert
        assertEquals("Null String",result);
    }
    @Test
    public void givenStringAndCharacterNotInStringShouldReturnMessage()
    {
//        arrange
        String result=count.counter("Stackroute","b");
//        assert
        assertEquals("Character doesnot exists",result);
    }

}