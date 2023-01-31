class TypeConversionAutomatic {
    public static void main(String[] args) {
        long l_value;
        double d_value;

        l_value = 100123234L;
        d_value = l_value;

        System.out.println("l_value:" + l_value);
        System.out.println("d_value:" + d_value);

    }
}
