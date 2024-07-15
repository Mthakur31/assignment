import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Calculate sum of digits
        int sum = 0;
        int originalNum = number; // Store original number to display later
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += digit; // Add the digit to sum
            number /= 10; // Remove the last digit from number
        }
        System.out.println("Sum of digits of number is: " + sum);
        
        scanner.close();
    }
}
