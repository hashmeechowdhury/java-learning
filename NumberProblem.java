import java.util.Scanner;

public class NumberProblem {

    public static void main(String[] args) {
        // Scanner go = new Scanner(System.in);

        // double num1;
        // double num2;
        // System.out.print("Enter the first decimal number: ");
        // num1 = go.nextDouble();
        // System.out.print("Enter the second decimal number: ");
        // num2 = go.nextDouble();

        // System.out.println("You inserted the first decimal number " + num1);
        // System.out.println("You inserted the second decimal number " + num2);

        // System.out.println("Sum of your two decimal numbers " + (num1 + num2));
        // System.out.println("Sum of your two decimal numbers " + (num1 - num2));
        // System.out.println("Sum of your two decimal numbers " + (num1 * num2));
        // System.out.println("Sum of your two decimal numbers " + (num1 / num2));

        // declarations
        double num1, num2;
        double sum, sub, mul, div;

        Scanner kb = new Scanner(System.in);

        // input

        // num1 = float(input("Enter a number: "))

        System.out.print("Enter a number: ");
        num1 = kb.nextDouble();
        System.out.print("Enter another number: ");
        num2 = kb.nextDouble();

        // processing

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;

        // output
        System.out.println("The sum is " + sum);
        System.out.println("The subtraction is " + sub);
        System.out.println("The multiplication is " + mul);
        System.out.println("The division is " + div);

        kb.close();
    }

}
