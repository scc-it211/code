import java.util.Scanner;

public class ReadDouble {
    public static void main(String[] args) {
        Double value;

        System.out.println("Type double and press ENTER:");

        Scanner inputScanner = new java.util.Scanner(System.in);

        value = inputScanner.nextDouble();
        System.out.println("you typed: " + value);
        
        inputScanner.close();
    }
}
