import java.util.Scanner;

public class Payroll {

    public static void main(String[] args) {

        // declarations
        String name;
        int hours;
        double payRate, grossPay;

        Scanner scan = new Scanner(System.in);

        // input
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        System.out.print("Enter the hours: ");
        hours = scan.nextInt();
        System.out.print("Enter the pay rate: ");
        payRate = scan.nextDouble();

        // processing

        grossPay = hours * payRate;

        // output
        System.out.println("Hello " + name);
        System.out.println("Your gross pay is $" + grossPay);

        scan.close();

    }

}
