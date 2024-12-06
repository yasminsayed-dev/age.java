import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 30 && number < 50) {
            System.out.print("you're an old man");
        } else if (number >= 50) {
            System.out.print("you're so dead");
        } else {
            System.out.print("you're young");
        }

        scanner.close();
    }
}
