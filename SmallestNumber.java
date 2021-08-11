import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// declarations
		double num1, num2, num3; // input variables
		double smallest; // output variable
		Scanner scan = new Scanner(System.in);

		// input
		System.out.print("Enter three numbers separated by a space: ");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();

		// processing
		if ((num1 < num2) && (num1 < num3)) {
			smallest = num1;
		} else {
			if (num2 < num3) {
				smallest = num2;
			} else {
				smallest = num3;
			}
		}

		// output
		System.out.println("The smallest number is " + smallest);
		System.out.println("The smallest using Math.min is " + Math.min(num1, Math.min(num2, num3)));
		scan.close();
	}

}
