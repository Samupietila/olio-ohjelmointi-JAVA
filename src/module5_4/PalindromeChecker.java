package module5_4;

public class PalindromeChecker {
    public boolean isPalindrome(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[^a-z0-9]", "");
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        System.out.println(str + " " + reversed);
        return str.contentEquals(reversed);
    }
}
