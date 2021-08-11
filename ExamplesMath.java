import java.util.*;

public class ExamplesMath {
    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num1 = scan.nextDouble();
        System.out.print("Enter another number: ");
        num2 = scan.nextDouble();

        num3 = Math.min(num1, num2);

        System.out.println("The minimum is " + num3);
        scan.close();
    }
}
