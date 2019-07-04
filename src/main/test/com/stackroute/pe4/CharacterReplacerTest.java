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
        assertEquals("java is programming language",result);
    }
    @Test
    public void givenNullShouldReturnNull()
    {
//        arrange
        String result=replacer.converter(null);
//        assert
        assertEquals("Null string",result);
    }
}