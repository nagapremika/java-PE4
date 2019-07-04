package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FinderTest {
    Finder word;
    @Before
    public void setUp()
    {
        word=new Finder();
    }
    @After
    public void tearDown()
    {
        word=null;
    }
    @Test
    public void givenStringAndCharacterShouldReturnIndex() {
//        arrange
        String result = word.match("java again and again","ag");
//        assert
        assertEquals("5-7 15-17 ", result);
    }
    @Test
    public void givenStringAndCharacterShouldReturnPatternFound() {
//        arrange
        String result = word.match("java again and again","bg");
//        assert
        assertEquals("Pattern Not found", result);
    }
    @Test
    public void givenEmptyStringShouldReturnNotNullString() {
//        arrange
        String result = word.match("","bg");
//        assert
        assertNotEquals("Null String", result);
    }
    @Test
    public void givenNullStringShouldReturnNullString() {
//        arrange
        String result = word.match(null,"bg");
//        assert
        assertNotEquals("String Exists", result);
    }
    @Test
    public void givenStringAndCharacterWithNumberShouldReturnIndex() {
//        arrange
        String result = word.match("983!546753 @3! #akd","3!");
//        assert
        assertEquals("2-4 12-14 ", result);
    }

}