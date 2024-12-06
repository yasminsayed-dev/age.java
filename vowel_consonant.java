import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String word = scanner.next().toLowerCase();
        if (word.equals("a") || word.equals("e") || word.equals("i") || word.equals("o") || word.equals("u")) {
            System.out.print("It's a vowel");
        } else if (word.matches("[a-z]") && word.length() == 1) {
            System.out.print("It's a consonant");
        } else {
            System.out.print("Invalid input. Please enter a single letter.");
        }
        scanner.close();
    }
}
