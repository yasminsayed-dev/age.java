import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number > 0) {
                System.out.print("the number is positive");

                if (number % 2 == 0) {
                    System.out.print(" and the number is even");
                } else {
                    System.out.print(" and the number is odd");
                }
            } else {
                System.out.print("the number is negative");
            }
    }
}
