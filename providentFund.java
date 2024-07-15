import java.util.Scanner;

public class providentFund {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();
        double pfAmount = basicSalary * 0.12;
        System.out.println("Provident Fund amount: " + pfAmount);
        
        scanner.close();
    }
}
