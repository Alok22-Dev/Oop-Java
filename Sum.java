public class Sum{
    public static void main(String[] args) {
        // Initialize a variable to store the sum
        int sum = 0;

        // Use a for loop to iterate from 1 to 100 and add each number to the sum
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        // Print the sum
        System.out.println("Sum of numbers from 1 to 100: " + sum);
    }
}
