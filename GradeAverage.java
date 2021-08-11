import java.util.Scanner;

public class GradeAverage {

    public static void main(String[] args) {

        double grade, total, average;
        int numGrades;
        Scanner scan = new Scanner(System.in);

        System.out.print("How many grades do you want to enter? ");
        numGrades = scan.nextInt();

        total = 0;
        // for (int i = 1; i <= numGrades; i++) {
        // System.out.print("Enter a grade: ");
        // grade = scan.nextDouble();
        // total = total + grade;
        // }
        int i = 1;
        while (i <= numGrades) {
            System.out.print("Enter a grade: ");
            grade = scan.nextDouble();
            total = total + grade;
            i++;
        }
        average = total / numGrades;

        System.out.println("The average is: " + average);
        scan.close();
    }

}
