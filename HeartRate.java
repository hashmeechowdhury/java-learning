import java.util.*;

public class HeartRate {

    public static void main(String[] args) {

        int a;
        double r;
        double trainingHeartRate;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        a = scan.nextInt();

        System.out.print("Enter your resting heart rate: ");
        r = scan.nextDouble();

        trainingHeartRate = 0.7 * (220 - a) + 0.3 * r;

        System.out.println("Your training heart rate is " + trainingHeartRate);

        scan.close();
    }

}
