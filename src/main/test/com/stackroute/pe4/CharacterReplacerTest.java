package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterReplacerTest {
    CharacterReplacer replacer;
    @Before
    public void setUp()
    {
        replacer=new CharacterReplacer();
    }
    @After
    public void tearDown()

    {
        replacer=null;
    }
    @Test
    public void givenStringShouldReturnReplacedString()
    {
//        arrange
        String result=replacer.converter("Introduction of languages");
//        assert
        assertEquals("Introfuction of tanguages",result);
    }
    @Test
    public void givenStringShouldReturnReplacedSameString()
    {
//        arrange
        String result=replacer.converter("java is programming language");
//        assert
        assertNotEquals("java is programming",result);
    }
    @Test
    public void givenNullShouldReturnNull()
    {
//        arrange
        String result=replacer.converter(null);
//        assert
        assertNull(result);
    }
    @Test
    public void givenEmptyStringShouldReturnEmpty()
    {
//        arrange
        String result=replacer.converter("");
//        assert
        assertEquals("Empty string",result);
    }
}