public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(isPalindrome(s));
        }

    }

    public static String reverseString(String string) {
        String s = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            s += string.charAt(i);
        }
        return s;
    }

    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}
