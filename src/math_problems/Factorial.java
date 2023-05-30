package math_problems;

public class Factorial {

    /**
     * INSTRUCTIONS
     * <p>
     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     * <p>
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */


    public static int factorialByIteration(int x) {
        int factorialIt = 1;

        for (int i = 1; i <= x; i++) {
            factorialIt = factorialIt * i;
        }
            return factorialIt;
     }

    public static int factorialByRecursion(int y) {
        int result = y;
        if(y==0 || y==1){
            return 1;
        }
        else{
            result = factorialByRecursion(y-1) *y;
            return result;
        }
    }
    public static void main(String[] args) {
        int x = 5;
         int factorialIt = Factorial.factorialByIteration(x);
        System.out.println("The Factorial of " + x + " = " + factorialIt);
        int y = 5;
          int result = Factorial.factorialByRecursion(y);
          System.out.println("The Factorial of " + y + " = " + result);
    }
}






