import java.util.Scanner;
public class triangle_validation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first angle: ");
        int angle1 = scanner.nextInt();
        System.out.print("Enter second angle: ");
        int angle2 = scanner.nextInt();
        System.out.print("Enter third angle: ");
        int angle3 = scanner.nextInt();
        if(angle1 + angle2 + angle3 == 180){
            System.out.print("this is a valid triangle");
        }
        else {
            System.out.print("this is an invalid triangle");
        }
    }
}
