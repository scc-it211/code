class OuterClass {
    int outer_int_var = 10;
    void test() {
        InnerClass innerClass = new InnerClass();
        innerClass.display();
    }
    class InnerClass {
        void display() {
            System.out.println("display: outer_int_var: " + outer_int_var);
        }
    }
}

class NestedClassDemo {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.test();
    }
    
}
