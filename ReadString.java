import java.util.Scanner;

public class ReadString {
    public static void main(String[] args) {
        String line;

        System.out.println("Type something and press ENTER:");

        Scanner inputScanner = new java.util.Scanner(System.in);

        line = inputScanner.nextLine();
        System.out.println("you typed: " + line);
        
        inputScanner.close();
    }
}
