package string_problems;

public class Permutation {

    /** INSTRUCTIONS
     * Create a Java program to compute all permutations of any given string
     *
     * e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */


    // Implement here
    public void stringPermutaion(String prefix, String str) {
        int length = str.length();

        if (length == 0) {
            System.out.println(prefix);
            return;
        }
        for(int i = 0; i <length; i ++) {
            stringPermutaion(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1,length));

        }
    }
    public void permutation(String str){
        stringPermutaion("",str);
    }
    public static void main (String[] args) {
        Permutation p = new Permutation();
        p.permutation("ABC");
    }
    }


