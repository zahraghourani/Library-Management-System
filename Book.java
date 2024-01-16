package library;

public class Book extends LibraryItem implements Borrowable{
    //attributes
    public static int numberOfBooks=0;
    private String author;
    private boolean available;
    //constructor
    public Book(String title, String ISBN, String genre, int yearPublished, int quantity, String author) {
        super(title, ISBN, genre, yearPublished, quantity);
        this.author = author;
        available=true;
        numberOfBooks++;
    }
    // Getters and Setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public boolean getAvailable() {
        return available;
    }
    
    @Override
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    @Override
    public boolean isAvailable(){
        return available;
    }
    //toString method
    
    @Override
    public String toString() {
        return super.toString()+"\nAuthor: "+author;
    }
    //implementation of Borrowable interface methods
    @Override
    public boolean isBorrowed() {
        return !available;
    }

    @Override
    public void borrowItem() {
        if (available) {
            available = false;
            numberOfBooks--;
        } else {
            System.out.println("Sorry, this book is already borrowed.");
        }    }

    @Override
    public void returnItem() {
        if (!available) {
            available = true;
            numberOfBooks++;
        } else {
            System.out.println("This book has not been borrowed.");
        }    
    }
    public static void main(String [] args){
        
    }
}

