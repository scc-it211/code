package enum_demo;

enum Apple {
    Johnathan, // enumeration constants
    GoldenDelicious, 
    RedDelicious
}

public class Enumeration {
    public static void main(String[] args) {
        Apple apple;

        apple = Apple.RedDelicious;

        System.out.println(apple);

        // enum to control a switch statement

        switch (apple) {
            case Johnathan:
                System.out.println("Janathan is red");
                break;
            case GoldenDelicious:
                System.out.println("GoldenDelicious is yellow");
                break;

            case RedDelicious:
                System.out.println("RedDelicious is Red");
                break;

        }

    }

}
