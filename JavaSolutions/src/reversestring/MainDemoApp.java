package reversestring;

public class MainDemoApp {
    public static void main(String[] args) {
        String result = reverse("hebe");
        System.out.println(result);
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}