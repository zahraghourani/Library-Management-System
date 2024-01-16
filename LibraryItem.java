package library;

public class LibraryItem implements Borrowable{
    //attributes
    public static int numberOfItems=0;
    private String title;
    private String ISBN;
    private String genre;
    private int yearPublished;
    private int quantity;
    private boolean available;
    //default constructor
    public LibraryItem(){
        title = "";
        ISBN = "";
        genre = "";
        yearPublished = 0000;
        quantity = 0;
        available = false;
    }
    //constructor
    public LibraryItem(String title, String ISBN, String genre, int yearPublished, int quantity) {
        this.title = title;
        this.ISBN = ISBN;
        this.genre = genre;
        this.yearPublished = yearPublished;
        this.quantity = quantity;
        available = true;
        numberOfItems++;
    }
    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    // Implementing Borrowable interface methods
    @Override
    public boolean isBorrowed() {
        return !available;
    }

    @Override
    public void borrowItem() {
        if (available) {
            available = false;
            numberOfItems--;
            quantity--;
        } else {
            System.out.println("Item is not available for borrowing.");
        }
    }

    @Override
    public void returnItem() {
        available = true;
        numberOfItems++;
        quantity++;
    }
    //toString method
    @Override
    public String toString(){
        return "Title: " +this.title+"\nISBN: "+ISBN+"\nGenre: "+genre+"\npublication year: "+this.yearPublished+"\nQuantity: "+quantity;
    }
}
