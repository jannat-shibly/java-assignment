public class Sum1To100Loop {
    public static void main(String[] args) {
        int sum = 0; /// Loop from 1
        for (int i = 1; i <= 100; i++) {
            sum += i; 
        }
        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
    }
}