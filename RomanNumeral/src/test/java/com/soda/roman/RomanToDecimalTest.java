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

    @Test
    public void convert_XC() {
        assertEquals(90, convert("XC"));
    }

    @Test
    public void convert_CM() {
        assertEquals(900, convert("CM"));
    }

    @Test
    public void convert_VC() {
        assertEquals(105, convert("VC"));
    }

    @Test
    public void convert_DM() {
        assertEquals(1500, convert("DM"));
    }

    @Test
    public void convert_MMVI() {
        assertEquals(2006, convert("MMVI"));
    }
    @Test
    public void convert_MCMXLIV() {
        assertEquals(1944, convert("MCMXLIV"));
    }

    private int convert(String romanNumeral) {
        return roman.convertRomanToDecimal(romanNumeral);
    }
}
