class ShortCircuitOperator {
    public static void main(String[] args) {
        int n, d;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0) {
            System.out.println(d + " is a factor of " + n);
        }

        d = 0; // set d to zero

        // F and F = F
        // F and T = F
        // T and F = F
        // T and T = T
        // the second operand is not evaluated
        if (d != 0 && (n % d)== 0) {
            System.out.println(d + " is a factor of " + n);
        }
        // Without short-circuit operator
        if (d != 0 & (n % d) == 0) {
            System.out.println(d + " is a factor of " + n);
        }
    }
}
