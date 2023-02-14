class B {
    int x;
}
class C extends B {
    int x; // hides x in A
    C(int a, int b) {
        super.x = a;
        x = b;
    }
    void show() {
        System.out.println(
            "x in superclass A:" + super.x);
        System.out.println(
            "x in subclass B:" + x);
    }
}


class InheritanceSuper {
    public static void main(String[] args) {
        C subclassObject = new C(3, 5);
        subclassObject.show();
    }
}
