
class IfStatement {
    public static void main(String[] args) {
        int x;
        int y;

        x = 5;
        y = 2;
      
        if (x > y) {
            System.out.println("x is greater than y");
        } else if (x < y) {
            System.out.println("y is greater than x");
        } else {
            System.out.println("x is equal to y");
        }
    }
}