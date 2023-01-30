class BreakWhileLoop {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 10) {
            System.out.print(num);
            if (num == 5) {
                break;
            }
            num += 1;
        }
    }
}
