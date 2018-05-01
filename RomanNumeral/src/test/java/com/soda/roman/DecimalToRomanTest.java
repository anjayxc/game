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
    public void convert_I() {
        assertEquals("I", roman.convertDecimalToRoman(1));
    }

}
