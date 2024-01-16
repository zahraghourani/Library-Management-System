package library;

import java.util.ArrayList;

public class DVD extends LibraryItem implements Borrowable{
    //attributes
    public static int numberOfDiscs=0;
    private String director;
    private String language;
    private boolean available;
    private int lengthInMinutes;
    //filled constructor
    public DVD(String title, String ISBN, String genre, int yearPublished, int quantity, int lengthInMinutes, String director, String language) {
        super(title, ISBN, genre, yearPublished, quantity);
        this.lengthInMinutes=lengthInMinutes;
        this.director=director;
        this.language=language;
        this.available=true;
        numberOfDiscs++;
    }
    //getters and setters
    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }
    
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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
        return !available;
    }

    @Override
    public void borrowItem() {
        if (available) {
            available = false;
            System.out.println("DVD " + getTitle() + " has been borrowed.");
            numberOfDiscs--;
        } else {
            System.out.println("DVD " + getTitle() + " is not available for borrowing.");
        }
    }
    
    @Override
    public void returnItem() {
        available = true;
        System.out.println("DVD " + getTitle() + " has been returned.");
        numberOfDiscs++;
    }
    @Override
    public String toString(){
        return(super.toString()+"\nLength in minutes: "+lengthInMinutes+" minutes\nDirector: " +director+"\nLanguage: "+language);
    }
}
