package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     *
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    private static long[] fibonacciCache;
    public static void main(String[] args) {
        int n = 40;
        fibonacciCache = new long[n + 1];

        for (int i = 0; i < n; i++) {

            System.out.print(fibonacci(i) + " ");

        }
    }
    private static long fibonacci(int n) {
        if (n <=1){
            return n;
        }
        if (fibonacciCache[n] !=0){
            return fibonacciCache[n];

        }
        long nthFibonacciNumber = (fibonacci(n-1) + fibonacci(n-2));
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;

    }
}
