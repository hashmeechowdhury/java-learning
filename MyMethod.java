public class MyMethod {
    public static void main(String[] args) {
        displayMessage();
        displayMessage();
        displayMessage1("Hello", 3);
        displayMessage1("Bye", 3);
    }

    public static void displayMessage() {
        System.out.println("Hello there!");
    }

    public static void displayMessage1(String s, int n) {
        for (int i = 1; i < n; i++) {
            System.out.println(s);
        }
    }
}
