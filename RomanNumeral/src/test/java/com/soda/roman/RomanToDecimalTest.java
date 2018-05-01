package com.soda.roman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToDecimalTest {

    Roman roman = null;

    @Before
    public void setUp() {
        roman = new Roman();
    }

    @Test
    public void convert_I() {
        assertEquals(1, convert("I"));
    }

    @Test
    public void convert_V() {
        assertEquals(5, convert("V"));
    }

    @Test
    public void convert_II() {
        assertEquals(2, convert("II"));
    }
    @Test
    public void convert_IV() {
        assertEquals(4, convert("IV"));
    }

    private int convert(String romanNumeral) {
        return roman.convertRomanToDecimal(romanNumeral);
    }
}
