import java.util.Scanner;

public class marriageCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        if (age < 30 && salary >= 100000) {
            System.out.println("You are eligible for marriage.");
        } else {
            System.out.println("You are not eligible for marriage.");
        }
        
        scanner.close();
    }
}
