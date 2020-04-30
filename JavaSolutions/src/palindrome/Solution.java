package palindrome;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}