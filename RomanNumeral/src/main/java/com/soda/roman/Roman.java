package com.soda.roman;

import java.util.HashMap;
import java.util.Map;

public class Roman {

    private Map<String, Integer> dict;

    {
        dict = new HashMap<>();
        dict.put("M", 1000);
        dict.put("CM", 900);
        dict.put("D", 500);
        dict.put("CD", 400);
        dict.put("C", 100);
        dict.put("XC", 90);
        dict.put("L", 50);
        dict.put("XL", 40);
        dict.put("X", 10);
        dict.put("IX", 9);
        dict.put("V", 5);
        dict.put("IV", 4);
        dict.put("I", 1);
    }

    public int convertRomanToDecimal(String romanNumeral) {
        int result = 0;
        for (int i = 0; i < romanNumeral.length(); i++) {
            if (i + 1 < romanNumeral.length() && dict.get(romanNumeral.substring(i, i + 1) + romanNumeral.substring(i + 1, i + 2)) != null) {
                result += dict.get(romanNumeral.substring(i, i + 1) + romanNumeral.substring(i + 1, i + 2));
                i++;
            } else {
                result += dict.get(romanNumeral.substring(i, i + 1));
            }
        }

        return result;
    }
}
