import java.util.*;


public class Divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an upper limit: ");
        int n = scanner.nextInt();

        System.out.print("Enter a divisor: ");
        int m = scanner.nextInt();

        if (n <= 0 || m <= 0) {
            System.out.println("Please enter positive integers.");
        } else {
            boolean found = false;
            for (int i = 1; i <= n; i++) {
                if (i % m == 0) {
                    System.out.println("The first number divisible by " + m + " is " + i);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No number found.");
            }
        }
    }
}

