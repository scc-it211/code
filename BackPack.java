import java.util.Arrays;

class BackPack {
    private String pockets[] = new String[3];
    
    BackPack() {
        Arrays.fill(pockets, "");
    }

    void addItem(String itemName) {
        int itemInsertLocation = -1;
        for (int i=0; i<pockets.length; i++) {
            if (pockets[i] == "") {
                itemInsertLocation = i;
                break;
            }
        }
        if (itemInsertLocation == -1) {
            System.out.println("Backpack full. can't add:" + itemName);
        } else {
            pockets[itemInsertLocation] = itemName;
            System.out.println(
                "Item Inserted - Pocket" 
                + itemInsertLocation 
                + ":" + itemName );
        }
    }

    void removeItem(String itemName) {
        int itemRemoveLocation = -1;
        for (int i=0; i<pockets.length; i++) {
            if (pockets[i] == itemName) {
                itemRemoveLocation = i;
                break;
            }
        }
        if (itemRemoveLocation == -1) {
            System.out.println(itemName + "doesn't exist");
        } else {
            pockets[itemRemoveLocation] = "";
            System.out.println(
                "Item removed - Pocket" 
                + itemRemoveLocation 
                + ":" + itemName );
        }
    }

    void printItems() {
        for (int i=0; i<pockets.length; i++) {
            System.out.println("pocket " + i + ": " + pockets[i]);
        }
    }
}

class BackPackDemo {
    public static void main(String[] args) {
        BackPack genieBackPack = new BackPack();

        genieBackPack.addItem("leash");
        genieBackPack.addItem("poo bag");
        genieBackPack.addItem("lamb lung");

        genieBackPack.printItems();

        genieBackPack.addItem("kibble");

        genieBackPack.printItems();

        genieBackPack.removeItem("leash");
        genieBackPack.printItems();
        
    }
}