package RectangleExample;

import java.util.Scanner;

public class RectangleDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // create an object of the rectangle class

        Rectangle r1 = new Rectangle();// length=1, width=1, color=blue
        Rectangle r2 = new Rectangle(5, 3, "black");

        System.out.print("Enter the length: ");

        r1.length = scan.nextDouble();
        System.out.print("Enter the width: ");
        r1.width = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter the color: ");
        r1.color = scan.nextLine();

        System.out.println("The length of the r1 is: " + r1.length);
        System.out.println("The width of the r1 is: " + r1.width);
        System.out.println("The color of the r1 is: " + r1.color);

        System.out.println("The length of the r2 is: " + r2.length);
        System.out.println("The width of the r2 is: " + r2.width);
        System.out.println("The color of the r2 is: " + r2.color);
        System.out.println("The area of the r2 is: " + r2.getArea());
        System.out.println("The perimeter of the r2 is: " + r2.getPerimeter());

        scan.close();

    }

}
