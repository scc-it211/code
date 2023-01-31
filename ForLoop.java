class ForLoop {
    public static void main(String[] args) {
        // count
        int countStart = 0;
        int countEnd = 10;
        
        System.out.println(
            "Let me count from " 
            + countStart + " to "
            + countEnd
        );

        // count is the loop control variable.
        for (int count = countStart; count <= countEnd; count++) {
            System.out.println(count);
        }
        System.out.println("count done");
    }
}
