import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
        int num1;
        double num2;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        num1 = scan.nextInt();
        System.out.print("Enter a decimal number: ");
        num2 = scan.nextDouble();

        System.out.println("The integer number is " + num1 + "\n" + "The decimal number is " + num2);
        scan.close();
    }
}
