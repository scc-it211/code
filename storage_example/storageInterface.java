package storage_example;

interface Storage {
    public void addItem(String itemName);
    public void removeItem(String itemName);
    public void printItems();
    public int getNumItems();
}
