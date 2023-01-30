class Continue {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 10) {
            if (num % 3 == 0) {
                continue;
            }
            System.out.print(num);
            num += 1;
        }
    }
}
