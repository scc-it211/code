class ArrayLength {
    public static void main(String[] args) {
        int [] list = new int[10];
        int [] nums = {1, 2, 3};
        int [][] table = {
            {1},
            {2, 3},
            {4, 5, 6},
            {7, 8, 9, 10}
        };

        System.out.println("list length " + list.length);
        System.out.println("nums length " + nums.length);
        System.out.println("table length " + table.length);
        System.out.println("table[0] length " + table[0].length);
        System.out.println("table[1] length " + table[1].length);
        System.out.println("table[2] length " + table[2].length);
        System.out.println("table[3] length " + table[3].length);
    }
}
