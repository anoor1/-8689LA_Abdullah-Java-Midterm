package math_problems;
import java.util.HashSet;
import java.util.Set;
public class FindLowestDifference {

    /** INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     */

    public static int getLowestNumber(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add all elements from the first array to set1
        for (int num : arr1) {
            set1.add(num);
        }

        // Add all elements from the second array to set2
        for (int num : arr2) {
            set2.add(num);
        }

        // Find the lowest number not shared between the arrays
        int lowestNumber = Integer.MAX_VALUE;
        for (int num : arr1) {
            if (!set2.contains(num) && num < lowestNumber) {
                lowestNumber = num;
            }
        }

        for (int num : arr2) {
            if (!set1.contains(num) && num < lowestNumber) {
                lowestNumber = num;
            }
        }

        return lowestNumber;
    }


    public static void main(String[] args) {


        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};
        int result = getLowestNumber(array1, array2);
        System.out.println("the lowest number that is not shared between these two arrays is " + result);
    }



}
