package anagrams;

import java.util.Arrays;

// One string is an anagram of another if it uses the same characters in the same quantity
public class Solution {
    public static void main(String[] args) {
        System.out.println("Is Anagram: " + isAnagram(" rail sAFety !!! ", "Fairy tales"));
    }

    // O(n log n)
    public static boolean isAnagram(String str1, String str2) {
        char[] chars1 = cleanString(str1).toCharArray();
        char[] chars2 = cleanString(str2).toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

    // O(n)
    public static boolean isAnagramFaster(String str1, String str2) {
        final int CHARACTER_RANGE= 256;

        String cleanStr1 = cleanString(str1);
        String cleanStr2 = cleanString(str2);

        if (cleanStr1.length() != cleanStr2.length()) {
            return false;
        }

        int[] counter = new int[CHARACTER_RANGE];

        for (int i = 0; i < cleanStr1.length(); i++) {
            counter[cleanStr1.charAt(i)]++;
            counter[cleanStr2.charAt(i)]--;
        }

        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (counter[i] != 0) {
                return false;
            }
        }

        return true;
    }

    private static String cleanString(String str) {
        return str.toLowerCase().replaceAll("[^a-z0-9]", "");
    }
}