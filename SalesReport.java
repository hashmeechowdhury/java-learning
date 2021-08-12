import java.util.Scanner;

public class SalesReport {

    public static void main(String[] args) {
        // declarations
        int numDays = 7;
        double totalSales = 0.0, averageSales = 0.0;

        // get the total sales
        totalSales = SalesReport.getTotalSales(numDays);

        // calculate the average
        averageSales = SalesReport.getAverageSales(totalSales, numDays);

        // display the results
        SalesReport.displayResults(numDays, totalSales, averageSales);
    }

    public static double getTotalSales(int days) {
        double total = 0.0, sales = 0.0;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= days; i++) {
            System.out.print("Enter sales for day " + i + ": ");
            sales = scan.nextDouble();
            total = total + sales;
        }
        return total;
    }

    public static double getAverageSales(double sales, int days) {
        return sales / days;
    }

    public static void displayResults(int days, double sales, double average) {
        System.out.println("The number of days is: " + days);
        System.out.println("The total sales are: " + sales);
        System.out.println("The average sales are: " + average);
    }

}
