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

    @Test
    public void convert_3300() {
        assertEquals("MMMCCC", convert(3300));
    }

    @Test
    public void convert_2006() {
        assertEquals("MMVI", convert(2006));
    }

    @Test
    public void convert_1944() {
        assertEquals("MCMXLIV", convert(1944));
    }

    private String convert(int decimalNumeral) {
        return roman.convertDecimalToRoman(decimalNumeral);
    }

}
