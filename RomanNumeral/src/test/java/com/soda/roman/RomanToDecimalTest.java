package com.soda.roman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToDecimalTest {

    @Test
    public void convert_I() {
        Roman roman = new Roman();
        assertEquals(1, roman.convertRomanToDecimal("I"));
    }
}
