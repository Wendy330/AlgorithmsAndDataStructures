package reversestring;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverse("hebe"));
        System.out.println(reverseByChar("hebe"));
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String reverseByChar(String str) {
        char[] chars = str.toCharArray();
        List<Character> reversedChars = new ArrayList<>();

        for (int i = chars.length - 1; i >= 0; i--) {
            reversedChars.add(chars[i]);
        }
        return reversedChars.stream().map(String::valueOf).collect(Collectors.joining());
    }
}