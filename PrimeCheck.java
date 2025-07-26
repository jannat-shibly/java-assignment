public class PrimeChecker {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false  }

        return true;

    public static void main(String[] args) {
        int number1 = 2
        int number2 = 15;
        int number3 = 1;
        int number4 = 2;

        System.out.println(number1 + " is prime: " + isPrime(number1));
        System.out.println(number2 + " is prime: " + isPrime(number2));
        System.out.println(number3 + " is prime: " + isPrime(number3));
        System.out.println(number4 + " is prime: " + isPrime(number4));
    }
}