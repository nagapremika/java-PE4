package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordReverseMakerTest {
    WordReverseMaker word;
        @Before
        public void setUp()
        {
            word=new WordReverseMaker();
        }
        @After
        public void tearDown()
        {
            word=null;
        }
        @Test
        public void givenStringAndCharacterShouldReturnWordsReverse() {
//        arrange
            String result = word.reverse("java again and again");
//        assert
            assertEquals("avaj niaga dna niaga ", result);
        }
    @Test
    public void givenEmptyStringAndCharacterShouldReturnMessage() {
//        arrange
        String result = word.reverse("");
//        assert
        assertEquals("Empty String", result);
    }
    @Test
    public void givenNullStringAndCharacterShouldReturnMessage() {
//        arrange
        String result = word.reverse(null);
//        assert
        assertEquals("Null String", result);
    }
}