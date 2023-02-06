public class StringSwitch {

    public static void main(String[] args) {
        String command = "run";

        switch (command) {
            case "bark":
            System.out.println("barking");
            break;

            case "run":
            System.out.println("running");
            break;

            case "sit":
            System.out.println("sitting");

            default:
                System.out.println("don't know yet");
                break;
        }
    }
    
}
