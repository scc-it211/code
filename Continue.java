class Continue {
    public static void main(String[] args) {
        int num = 0;
        while (num < 299) {
            num += 1;
            if (num % 3 != 0) {
                System.out.print(num);
                continue;
            }
        }
    }
}
