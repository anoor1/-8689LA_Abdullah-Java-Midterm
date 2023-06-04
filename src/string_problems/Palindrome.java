package string_problems;

public class Palindrome {

    /**
     * INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     * <p>
     * Example: MOM, DAD, MADAM, RACECAR
     * <p>
     * Create a method to check if any given String is a palindrome or not.
     */

    public static boolean isPalindrome(String str) {
        // Initializing an empty string to store the reverse of the original str
        String reverse = "";

        // Initializing a new boolean variable for the answer
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        // Checking if both the strings are equal
        if (str.equals(reverse)) {
            ans = true;
        }
        return ans;
    }

    public static void main(String[] args) {
        // Input string
        String str = "DAD";

        // Convert the string to lowercase
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }
}

