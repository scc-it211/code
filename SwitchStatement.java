public class SwitchStatement {
    public static void main(String[] args) {
        int i;

        for (i=0; i<10; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");

                default:
                    System.out.println("i is 2 or more");
            }
        }
    }
}

