import java.util.*;

public class IfElseExamples {

    public static void main(String[] args) {

        double num; // primitive data type
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = scan.nextDouble();

        if (num > 0) {
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        scan.close();

    }

}
