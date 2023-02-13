class A {
    int x; // default access
    private int y;
    void setXY(int a, int b) {
        x = a;
        y = b;
    }
}
class B extends A {
    int total;
    void sum() {
        // y is not accessible
        total = x + y;
    }
}


class InheritanceMemberAccess {
    public static void main(String[] args) {
        B subClassObject = new B();
        subClassObject.setXY(11, 13);

        subClassObject.sum();
        System.out.println("Total: " + subClassObject.total);

    }
}
