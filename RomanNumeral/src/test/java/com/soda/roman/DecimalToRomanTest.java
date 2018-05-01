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
        assertEquals("I", convert(1));
    }

    @Test
    public void convert_5() {
        assertEquals("V", convert(5));
    }

    @Test
    public void convert_500() {
        assertEquals("D", convert(500));
    }

    @Test
    public void convert_900() {
        assertEquals("CM", convert(900));
    }

    private String convert(int decimalNumeral) {
        return roman.convertDecimalToRoman(decimalNumeral);
    }

}
