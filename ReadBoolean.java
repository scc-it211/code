import java.util.Scanner;

class ReadBoolean {
    public static void main(String[] args) {
        Boolean bool;

        System.out.println("Type boolean and press ENTER:");

        Scanner inputScanner = new java.util.Scanner(System.in);

        bool = inputScanner.nextBoolean();
        System.out.println("you typed: " + bool);
        
        inputScanner.close();
    }
}
