import java.util.*;

public class FavoriteCity {

    public static void main(String[] args) {

        // declarations
        String cityName;
        int numCharacters;
        String cityUpper, cityLower;
        char firstCharacter, lastCharacter;
        Scanner scan = new Scanner(System.in);

        // input
        System.out.print("Enter the name of your favorite city: ");
        cityName = scan.nextLine();

        // processing
        numCharacters = cityName.length();
        cityUpper = cityName.toUpperCase();
        cityLower = cityName.toLowerCase();
        firstCharacter = cityName.charAt(0); // index = 0 is the first character
        lastCharacter = cityName.charAt(cityName.length() - 1);

        // output
        System.out.println("You entered: " + cityName);
        System.out.println("The number of characters: " + numCharacters);
        System.out.println("City in upper case: " + cityUpper);
        System.out.println("City in lower case: " + cityLower);
        System.out.println("First character of the city: " + firstCharacter);
        System.out.println("Last character of the city: " + lastCharacter);

        scan.close();

    }

}
