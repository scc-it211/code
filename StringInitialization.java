class StringInitialization {
    public static void main(String[] args) {

        String str_1 = "Hello";
        String str_2 = new String("Hello");
        String str_3 = new String(str_2);
        
        System.out.println(str_1);
        System.out.println(str_2);
        System.out.println(str_3);
    }
}
