import java.util.Scanner;
public class IT26102398Lab4Q3 {
    public static void main (String[] args) {
        // Enter the number
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        // Positive, Negative or Zero
        System.out.print(number < 0 ? "\nThe number is: Negative" : number > 0 ? 
        "\nThe number is: Positive" : "\nThe number is: Zero");
    }
}