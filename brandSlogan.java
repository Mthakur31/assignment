import java.util.Scanner;

public class brandSlogan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a shoe brand name: ");
        String brand = scanner.nextLine();
        if (brand.equals("Nike")) {
            System.out.println("Just do it");
        } else if (brand.equals("Adidas")) {
            System.out.println("Impossible is nothing");
        } else if (brand.equals("Puma")) {
            System.out.println("Forever Faster");
        } else if (brand.equals("Reebok")) {
            System.out.println("I Am What I Am");
        } else {
            System.out.println("Brand not recognized");
        }

        scanner.close();
    }
}
