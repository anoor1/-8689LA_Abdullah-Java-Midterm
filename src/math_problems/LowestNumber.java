package math_problems;

public class LowestNumber {

    /**
     * INSTRUCTIONS
     * Write a method to find the lowest number from this array.
     *
     * @return
     */


    public static int getSmallestNumber(int[] array, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[0];
    }

    public static void main(String[] args) {

        int[] array = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123,
                67, 5, 679, 54, 32, 65};

        System.out.println ("The lowest number in this array is: " + getSmallestNumber(array,26));

    }
}





