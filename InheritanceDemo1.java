
// superclass
class A {
    int x;
    int y;
    void showXY() {
        System.out.println("x and y: " + x + " " + y);
    }
}

// subclass
class B extends A {
    int z;
    void showZ() {
        System.out.println("z: " + z);
    }
    void sum() {
        System.out.println("x + y + z: " + (x + y + z));
    }
}

class InheritanceDemo1 {
    public static void main(String[] args) {
        A superClassObject = new A();
        B subClassObject = new B();

        superClassObject.x = 10;
        superClassObject.y = 20;

        superClassObject.showXY();

        // subclass has access to all public members
        subClassObject.x = 7;
        subClassObject.y = 8;
        subClassObject.z = 9;

        subClassObject.showXY();
        subClassObject.showZ();
        subClassObject.sum();
    }
}
