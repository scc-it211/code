public class Scope {
    public static void main(String[] args) {
        int x;

        x = 10;

        if (x == 10) { // new scope
            int y = 20;

            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y is out of scope
        // y = 100; 

        System.out.println("x is " + x);
    }
}
