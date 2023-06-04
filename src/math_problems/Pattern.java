package math_problems;

public class Pattern {

    /** INSTRUCTIONS
     * Read the numbers below, identify the pattern, and then implement the logic from this pattern.
     * Once done, you should test to see if you get the same output as below:
     *
     * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32...
     *
     */

    public static void main(String[] args) {
        int step = 1;
        int counter = 0;
        System.out.print("100,");
        for(int i = 99; i > 0; i -= step) {

            counter ++;
            if (counter == 10){
                step ++;
                counter = 0;

            }
            System.out.print(i+",");

        }


    }
}
