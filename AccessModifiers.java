class AccessModifiers {
    private int privateNumber;
    public int publicNumber;
    int defaultNumber;

    void setPrivateNumber(int num) {
        privateNumber = num;
    }

    int getPrivateNumber() {
        return privateNumber;
    }
}

class AccessModifiersDemo {
    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();

        obj.setPrivateNumber(130);
        System.out.println("private Number is " + obj.getPrivateNumber());

        //obj.privateNumber;

        obj.publicNumber = 100;
        obj.defaultNumber = 120;

    }
}
