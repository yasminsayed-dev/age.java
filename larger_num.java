import java.util.Scanner;
public class larger_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        if (num2 > num1 && num2> num3)
            System.out.print(num2 +"is the largest");
        if (num3 > num1 && num3 > num2)
            System.out.print(num3 +"is the largest");
        if (num1 > num2 && num1 > num3)
            System.out.print(num1 +"is the largest");
        scanner.close();
    }
}
