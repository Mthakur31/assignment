import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Check if the number is even or odd
        if (num % 2 == 0) {
            System.out.println("It is an even number.");
        } else {
            System.out.println("It is an odd number.");
        }
        
        sc.close();
    }
}
