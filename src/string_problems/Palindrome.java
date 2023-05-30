package string_problems;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {
        String original = "MOM";
        String reverse = "";
        int i = original.length() - 1; // this is the index
        while (i >= 0) {
            reverse += original.charAt(i); /* this is taking the character at the ith index and storing it in "reverse",
                                              which is the reverse of original */
            i--;
        }
        boolean palindrome = true;
        for (int j = 0; j < original.length(); j++) {
            if (original.charAt(j) != reverse.charAt(j)) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("This word is a Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
