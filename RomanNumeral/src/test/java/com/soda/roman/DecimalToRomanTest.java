package com.soda.roman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecimalToRomanTest {

    Roman roman = null;

    @Before
    public void setUp() {
        roman = new Roman();
    }


    @Test
    public void convert_1() {
        assertEquals("I", roman.convertDecimalToRoman(1));
    }

    @Test
    public void convert_5() {
        assertEquals("V", roman.convertDecimalToRoman(5));
    }


}
