package reverseint;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseInt(-15));
        System.out.println(reverseIntByMath(-153));
    }

    // using string to reverse
    public static int reverseInt(int n) {
        StringBuilder num = new StringBuilder(String.valueOf(Math.abs(n)));
        return Integer.signum(n) * Integer.parseInt(num.reverse().toString());
    }

    // using math to reverse
    public static int reverseIntByMath(int n) {
        if (n < 10 && n > -10) {
            return n;
        }

        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }
}