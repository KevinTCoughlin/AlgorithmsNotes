package misc;

public class Strings {

    public static void main(String[] args) {
        final String s = "madam";
        assert isPalindrome(s);
        System.out.println("Palindrome: " + isPalindrome(s));
    }

    public static boolean isPalindrome(final String s) {
        char[] a = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        int c = 1;
        while (i != j) {
            if (a[i] != a[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome2(final String s) {
        return s.toLowerCase().equals(new StringBuilder(s).reverse().toString().toLowerCase());
    }
}
