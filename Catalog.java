package library;

import java.util.ArrayList;

public class Catalog{
    //attributes
    private ArrayList<LibraryItem> items;
    public static int Itemcount=0;
    //default constructor
    public Catalog(){
        this.items=new ArrayList<>();
        Itemcount=0;
    }
    //filled constructor
    public Catalog(ArrayList<LibraryItem> items){
        this.items=items;
        Itemcount++;
    }
    //getters and setters for books attribute
    public ArrayList<LibraryItem> getItems() {
        return items;
    }
    public void setItems(ArrayList<LibraryItem> items) {
        this.items = items;
    }
    //methods
    public void addItem(LibraryItem item){
        this.items.add(item);
        Itemcount++;
    }
    public void removeItem(LibraryItem item){
        this.items.remove(item);
        Itemcount--;
    }
    public void modifyItem(LibraryItem item, String newTitle, String newISBN, String newGenre, int newYearPublished, int newQuantity){
        int index = this.items.indexOf(item);
        if (index != -1) {
            LibraryItem newItem = new LibraryItem(newTitle, newISBN, newGenre, newYearPublished, newQuantity);
            this.items.set(index, item);
        }
    }
    public boolean searchItemByTitle(String title){
        for(LibraryItem item : items){
            if(item.getTitle().contains(title)){
                return true;
            }
        }
        return false;
    }
    public boolean searchItemByISBN(String isbn){
        for(LibraryItem item : items){
            if(item.getISBN().contains(isbn)){
                return true;
            }
        }
        return false;
    }
    public boolean searchItemByGenre(String genre){
        for(LibraryItem item : items){
            if(item.getGenre().contains(genre)){
                return true;
            }
        }
        return false;
    }
    public boolean searchCatalog(String query) {
    for (LibraryItem item : items) {
        if (item.getTitle().contains(query) || item.getISBN().contains(query) || item.getGenre().contains(query)) {
            return true;
        }
    }
    return false;
}

    // check the availability of an item in the branch
    public boolean checkAvailability(LibraryItem item) {
        return items.contains(item) && item.isAvailable();
    }
    //Borrow and transaction and return
    //toString method
    @Override
    public String toString(){
        return "Number of books available: "+Itemcount;
    }
    
}