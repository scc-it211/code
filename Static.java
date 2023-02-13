class Static {
    static int a = 3;
    static int b;
    static void staticMethod(int x) {
        System.out.println("x: " + x);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    static {
        System.out.println("static block");
        b = a * 4;
    }
    public static void main(String[] args) {
        staticMethod(40);
    }
}
