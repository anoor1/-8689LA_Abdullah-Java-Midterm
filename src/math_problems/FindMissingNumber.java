package math_problems;

public class FindMissingNumber {

    /**
     * INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static int findMissingElement(int[] array) {
        int n = array.length + 1; // The number of elements in the array, n, is found by adding length of array + 1
        int sum = (n * (n + 1)) / 2; // The formula to calculate the sum of all the elements in the array

        int arraySum = 0;
        for (int num : array) {
            arraySum = arraySum + num; // Calculate the sum of numbers in the array
        }

        return sum - arraySum; // The difference between the expected sum and the actual sum is the missing number
    }

    public static void main(String[] args) {
        int[] numbers = {10, 2, 1, 4, 5, 3, 7, 8, 6}; // Example array with a missing number
        int missingNumber = findMissingElement(numbers);
        System.out.println("The missing number is: " + missingNumber);
    }
}
