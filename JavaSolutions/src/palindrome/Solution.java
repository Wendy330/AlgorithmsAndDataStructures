package palindrome;

// Given a string, return true if the string is a palindrome
// Palindromes are strings that form the same word if it is reversed
public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindromeByChar("abba"));
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }

    // Compare the first char with the last char
    public static boolean isPalindromeByChar(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}