import java.util.Scanner;
public class IT26102398Lab4Q1 {
    public static void main (String[] args) {
        // Enter the number
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        // Positive, Negative or Zero
        if (number < 0) {
            System.out.print("\nThe number is: Negative");
        }
        else if (number > 0) {
            System.out.print("\nThe number is: Positive");
        }
        else {
            System.out.print("\nThe number is: Zero");
        }
    }
}