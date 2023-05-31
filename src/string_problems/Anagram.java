package string_problems;

import java.util.Arrays;

public class Anagram {

    /**
     * INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     * <p>
     * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     * original letters exactly once.
     * <p>
     * Ex: "CAT" & "ACT",
     * "ARMY" & "MARY",
     * "FART" & "RAFT"
     */

    // Implement Here

    //Method to see if two string areAnagrams
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "act";

        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();

        if (c1.length != c2.length) {
            System.out.println("Not an Anagram"); // If the length of the two Strings do not match, it is not an anagram.
            System.exit(0);
        }

        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                System.out.println("Not an Anagram"); /* if the elements corresponding to the same index number in
                                                          both strings do not match,  it is not an anagram. */
                System.exit(0);
            }
            System.out.println("the two Strings are Anagrams"); // if both programs are not executed, it is an Anagram.
        }

    }
}

