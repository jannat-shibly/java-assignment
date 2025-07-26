public class Factorial {
    public static long factorialIterative(int n) {
        if (n < 0) {
            
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " (iterative): " + factorialIterative(number)); // Output: 120
    }
}