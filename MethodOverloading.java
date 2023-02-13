class MethodOverloading {
    void test() {
        System.out.println("No parameters");
    }
    void test(int a) {
        System.out.println("int a: " + a);
    }
    void test(int a, int b) {
        System.out.println("int a, b: " + a + " " + b);
    }
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}


class MethodOverloadingDemo {
    public static void main(String[] args) {
        MethodOverloading ob = new MethodOverloading();
        
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        double result = ob.test(10.10);
        System.out.println("ob.test(10.10) result: " + result);
    }

}