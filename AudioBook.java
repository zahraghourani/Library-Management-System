package library;

public class AudioBook extends LibraryItem implements Borrowable {
    public static int numberOfAudioBooks=0;
    private int lengthInMinutes;
    private String narrator;
    private boolean available;
    
    public AudioBook(String title, String ISBN, String genre, int yearPublished, int quantity, String narrator, int lengthInMinutes) {
        super(title, ISBN, genre, yearPublished, quantity);
        this.lengthInMinutes = lengthInMinutes;
        this.narrator=narrator;
        numberOfAudioBooks++;
        available=true;
    }
    //getters and setters
    public int getLengthInMinutes() {
        return lengthInMinutes;
    }
    
    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void setAvailable(boolean available) {
        this.available = available;
    }

    //implementation of Borrowable interface methods
    @Override
    public boolean isBorrowed() {
        return available;
    }

    @Override
    public void borrowItem() {
        if (available) {
            available = false;
            numberOfAudioBooks--;
        }
    }

    @Override
    public void returnItem() {
        available = true;
        numberOfAudioBooks++;
    }
    //toString method
    @Override
    public String toString(){
        return super.toString()+"\nNarrator: "+narrator+"\nLength: "+lengthInMinutes+" minutes";
    }
}
