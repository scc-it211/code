import java.util.ArrayList;

class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> closet = new ArrayList<String>();
        closet.add("socks");
        closet.add("pants");
        closet.add("shirts");

        System.out.println(closet);

        System.out.println("num items: " + closet.size());
        System.out.println(closet.get(0));

        closet.remove(0);

        System.out.println(closet);

        closet.set(0, "gloves");
        System.out.println(closet);

    }
}
