import java.util.Scanner;

public class NumberProblem {

	public static void main(String[] args) {
		Scanner go = new Scanner(System.in);

		double num1;
		double num2;
		System.out.print("Enter the first decimal number: ");
		num1 = go.nextDouble();
		System.out.print("Enter the second decimal number: ");
		num2 = go.nextDouble();

		System.out.println("You inserted the first decimal number " + num1);
		System.out.println("You inserted the second decimal number " + num2);

		System.out.println("Sum of your two decimal numbers " + (num1 + num2));
		System.out.println("Sum of your two decimal numbers " + (num1 - num2));
		System.out.println("Sum of your two decimal numbers " + (num1 * num2));
		System.out.println("Sum of your two decimal numbers " + (num1 / num2));
	}

}
