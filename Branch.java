package library;

import java.util.*;

public class Branch {
    public static int numOfBranches=0;
    private String name;
    private String address;
    private List<LibraryItem> items;

    public Branch(String name, String address) {
        this.name = name;
        this.address = address;
        this.items = new ArrayList<>();
        numOfBranches++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public List<LibraryItem> getItems() {
        return items;
    }

    public void setItems(List<LibraryItem> items) {
        this.items = items;
    }
    
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void removeItem(LibraryItem item) {
        items.remove(item);
    }
    
    public List<LibraryItem> searchItems(String keyword) {
        List<LibraryItem> result = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(item);
            }
        }
        return result;
    }
    
    // check the availability of an item in the branch
    public boolean checkAvailability(LibraryItem item) {
        return items.contains(item) && item.isAvailable();
    }
    @Override
    public String toString(){
        return"\nBranch name: "+name+"\nBranch address: "+address;
    }
}