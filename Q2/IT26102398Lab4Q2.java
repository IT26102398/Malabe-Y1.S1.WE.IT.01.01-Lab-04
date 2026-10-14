import java.util.Scanner;
public class IT26102398Lab4Q2 {
    public static void main (String[] args) {
        int exam_Marks, lab_Marks, exam_Percentage, lab_Percentage, final_Percentage;
        double final_Marks;
        // Constant is not to be mandatory in declared and Initialized
        final int number = 100; 
        Scanner input = new Scanner(System.in);
        // Exam Marks
        System.out.print("Please enter exam marks (out of 100): ");
        exam_Marks = input.nextInt();
        if ((exam_Marks <= number) && (exam_Marks >= 0)) {
            // Lab Submission Marks
            System.out.print("Please enter lab submission marks (out of 100): ");
            lab_Marks = input.nextInt();
            if ((lab_Marks <= number) && (lab_Marks >= 0)) {
                // Exam percentage
                System.out.print("Please enter the percentage given for the exam): ");
                exam_Percentage = input.nextInt();
                // Lab Submission percentage
                System.out.print("Please enter the percentage given for the lab submission: ");
                lab_Percentage = input.nextInt();
                final_Percentage = exam_Percentage + lab_Percentage;
                // Nested if
                // The percentages must add up to 100
                if (final_Percentage == number) {
                    final_Marks = ((exam_Marks * exam_Percentage / number) + (lab_Marks * lab_Percentage / number) * 1.0);
                    System.out.print("\nFinal Exam Mark is: " + final_Marks);
                }
                else {
                    System.out.print("The percentage must add up to 100. Terminating program.");
                }
            }
            else {
                System.out.print("Invalid input for lab submission marks. Terminationg program.");
            }
        }
        else {
            System.out.print("Invalid input for exam marks. Terminationg program.");
        }
    }
}