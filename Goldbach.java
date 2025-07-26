public class GoldbachNumber {

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to find odd prime pairs for a given even number
    public static void findGoldbachPairs(int n) {
        if (n <= 2 || n % 2 != 0) {
            System.out.println("Invalid input: Number must be a positive even integer greater than 2.");
            return;
        }

        System.out.println("Odd prime pairs for " + n + ":");
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        for (int p1 : primes) {
            if (p1 % 2 == 0 && p1 != 2) { 
                continue; 
            int p2 = n - p1;
            if (p2 > 0 && isPrime(p2)) {
            
                if (p2 % 2 != 0 || p2 == 2) {
                    System.out.println(p1 + " + " + p2);
                }
            }
        }
    }
    public static void main(String[] args) {
        findGoldbachPairs(10); 
        findGoldbachPairs(20);
        findGoldbachPairs(8);
        findGoldbachPairs(7); 
    }
}