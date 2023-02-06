class StringMethods {
    public static void main(String[] args) {

        String str_1 = "sample string";
        String str_2 = new String(str_1);
        String str_3 = "sample string 3";


        System.out.println("str_1 length: " + str_1.length());

        if (str_1.equals(str_2)) {
            System.out.println("str_1 equals str_2");
        } else {
            System.out.println("str_1 does not euqal str_2");
        }

        if (str_2.equals(str_3)) {
            System.out.println("str_2 equals str_3");
        } else {
            System.out.println("str_2 does not euqal str_3");
        }

        int compareToResult = str_2.compareTo(str_3);

        if (compareToResult == 0) {
            System.out.println("str_2 and str_3 are equal");
        } else if (compareToResult < 0) {
            System.out.println("str_2 is less than str_3");
        } else {
            System.out.println("str_2 is greater than str_3");
        }

        String str_4 = "Genie BC Genie";

        System.out.println("Index of Genie:" + str_4.indexOf("Genie"));
        
        System.out.println("Last Index of Genie:" + str_4.lastIndexOf("Genie"));

        String str_5 = str_4 + str_4;

        System.out.println(str_5);

    }
}
