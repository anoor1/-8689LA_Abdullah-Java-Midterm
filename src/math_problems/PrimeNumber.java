package math_problems;
import java.util.Arrays;

public class PrimeNumber {

    /**
     * INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     * Print out the prime numbers in the given range.
     * <p>
     * BONUS: Figure out how to improve algorithmic efficiency
     */

    public static void PrimeNumbersLessEfficient() {

        for (int i = 2; i <= 1000000; i++) { // Running a loop between 2 and 1,000,000

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {    //checking to see if each i is divisible by 1 and itself.
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("The less efficient way to print prime numbers: \n " + i);
            }

        }
    }

    public static void PrimeNumbersMoreEfficient(int end) {  //This is the more efficient method
        boolean[] isPrimeNumber = new boolean[end + 1];

        Arrays.fill(isPrimeNumber, true);

        for (int start = 2; start * start <= end; start++) {
            if (isPrimeNumber[start]) {
                for (int multiplier = start * start; multiplier <= end; multiplier += start) {
                    isPrimeNumber[multiplier] = false;
                }
            }
        }

        for (int number = 2; number <= end; number++) {
            if (isPrimeNumber[number]) {
                System.out.println("The more efficient way to print prime numbers: \n" + number);
            }
        }
    }


        public static void main(String[] args) {
          PrimeNumbersLessEfficient();

          PrimeNumbersMoreEfficient(1000000);
        }
}


