class VariableLengthArguments {
    static void varArgTest(int ... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");

        for (int i=0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
    }
    public static void main(String[] args) {
        varArgTest(5);
        varArgTest(5, 6, 7);
        varArgTest();
    }
}
