package com.playtika.homework2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jane on 9/27/17.
 */
public class MainTest {

    private int wordCount;

    @Test
    public void textIsSplitedByWhitespace() {
        wordCount = new Main().
                countWord("I hAvE 5 DOLLARS");
        assertEquals(4, wordCount);
    }

    @Test
    public void emptyTextHasNoWords() {
        wordCount =  new Main().
                countWord("");
        assertEquals(0,wordCount);
    }

    @Test
    public void textIsSplitedByAnyDelimiter() {
        wordCount = new Main()
                .countWord("aa - bb @ cc . d , d ? e e !)\n ff ( + gg , : \t");
        assertEquals(9,wordCount);
    }

    @Test
    public void textWithoutCharactersHasNoWords() {
        wordCount = new Main()
                .countWord("_+-.,!@#$%^&*();\\/|<>\"'");
        assertEquals(0,wordCount);
    }

    @Test
    public void textWithWhitespacesOnlyHasNoWords() {
        wordCount = new Main()
                .countWord("   ");
        assertEquals(0,wordCount);
    }

    @Test
    public void textIsSplitedWithWhitespacesOnTheBeginning() {
        wordCount = new Main()
                .countWord("  \nFirstText");
        assertEquals(1,wordCount);
    }
}