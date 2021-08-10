public class MyClass {
    public static void main(String args[]) {
        int x = 4;
        int y = 5;
        int z = 7;

        if (x > y && z < x) {
            z = 4;
        } else if (x == y || z == 6) {
            z = 5;
        } else {
            z = 6;
        }

        System.out.println("Z is " + z);
    }
}