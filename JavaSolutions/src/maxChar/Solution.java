package maxChar;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Given a string, return the character that is most commonly used in the string
public class Solution {
    public static void main(String[] args) {
        System.out.println(maxChar("hebe"));
    }

    public static char maxChar(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();

        for (char c : chars) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        return Collections.max(charMap.entrySet(), Map.Entry.comparingByValue()).getKey();
//        return charMap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }
}