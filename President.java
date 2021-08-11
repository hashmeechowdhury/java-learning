import java.util.Scanner;

public class President {

    public static void main(String[] args) {

        int age;
        String citizen;
        Scanner scan = new Scanner(System.in);

        System.out.print("Are you a natural born US citizen? (Yes/No) ");
        citizen = scan.nextLine();
        System.out.print("Enter your age: ");
        age = scan.nextInt();

        if (age >= 35 && citizen.equals("Yes")) {
            System.out.println("You can be President");
        } else {
            System.out.println("You cannot be President");
        }
        scan.close();
    }

}

// Cannot compare strings with relational operators
// equalsIgnoreCase("Yes") so lowecase yes won't bother