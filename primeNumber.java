import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("It is a prime number.");
        else
            System.out.println("It is not a prime number.");
        
        scanner.close();
    }
}
