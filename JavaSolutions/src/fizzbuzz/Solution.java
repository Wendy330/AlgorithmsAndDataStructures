package fizzbuzz;

// From 1 to n, multiples of three print "fizz", multiples of five print "buzz",
// multiples of both three and five print "fizzbuzz"
public class Solution {
    public static void main(String[] args) {
        fizzBuzz(100);
    }

    public static void fizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}