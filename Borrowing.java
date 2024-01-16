package library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Borrowing {
    //attributes
    private static int id=0;
    private Borrower username;
    private LibraryItem item;
    LocalDate borrowdate = LocalDate.now();//assume the item was borrowed today
    long daysToReturn;//number of days the borrower has to return the item
    LocalDate duedate = borrowdate.plusDays(daysToReturn);//calculate the due date
    LocalDate overdueDate = LocalDate.now().plusDays(daysToReturn+1);//calculate the overdue date (1 day after the due date)
    private final double fineAmount=25;

    //constructors
    public Borrowing(Borrower username,LibraryItem item,int daysToReturn){
        this.username=username;
        this.item=item;
        this.daysToReturn=daysToReturn;
        id++;
        
    }
    //getters and setters
    public static int getId() {
        return id;
    }

    public Borrower getUsername() {
        return username;
    }

    public void setUsername(Borrower username) {
        this.username = username;
    }

    public LibraryItem getItem() {
        return item;
    }

    public void setItem(LibraryItem item) {
        this.item = item;
    }

    public long getDaysToReturn() {
        return daysToReturn;
    }

    public void setDaysToReturn(long daysToReturn) {
        this.daysToReturn = daysToReturn;
    }
    
    public LocalDate getBorrowdate() {
        return borrowdate;
    }

    public LocalDate getDuedate() {
        return duedate;
    }

    public LocalDate getOverdueDate() {
        return overdueDate;
    }

    public double getFineAmount() {
        return fineAmount;
    }
    
    //toString method
    @Override
    public String toString(){
        return "Borrowing informations:\nBorrowing ID: "+id+"\nBorrower: "+username+"\nItem name: "+item+"\nFine amount: "+fineAmount+"\nDays to return: "+daysToReturn+"\nBorrow date: "+borrowdate+"\nDue date: "+duedate;
    }
    //method
    public LocalDate getOverdue(){
        LocalDate today = LocalDate.now();
        if (today.isAfter(duedate)) {
            long daysOverdue = ChronoUnit.DAYS.between(duedate, today);
            System.out.println("This item is " + daysOverdue + " days overdue.");
            return today;
        }
        else{
            return null; // item is not yet overdue
        }
    }
}
