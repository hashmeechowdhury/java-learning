import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {

		Scanner oo = new Scanner(System.in);

		String name;
		String place;
		String hobby;

		System.out.print("Enter your name: ");
		name = oo.nextLine();

		System.out.print("Enter your place: ");
		place = oo.nextLine();

		System.out.print("Enter your hobby: ");
		hobby = oo.nextLine();

		System.out.println("Your name is " + name);
		System.out.println("Your place is " + place);
		System.out.println("Your hobby is " + hobby);

	}

}
