import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        if (operation == '+') {
            System.out.println("The result is: " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println("The result is: " + (num1 - num2));
        } else if (operation == '*') {
            System.out.println("The result is: " + (num1 * num2));
        } else if (operation == '/') {
            if (num2 != 0) {
                System.out.println("The result is: " + (num1 / num2));
            } else {
                System.out.println("Division by zero is not allowed!");
            }
        } else {
            System.out.println("Invalid operation. Please use +, -, *, or /.");
        }

        scanner.close();
    }
}
