package library;

import java.time.LocalDate;
import java.util.*;

public class Main {
public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to the Library Management System");
        int num, quantity = 0, yearPublished=0, length=0;
        String title = null,searchTitle, isbn = null, genre = null, aut, director = null, narrator, lang = null;
        LibraryItem item = null;
        Catalog cat = new Catalog();
        ArrayList<LibraryItem> items = new ArrayList<>();
        //books
        LibraryItem book1 = new Book ("Death of a City","978-1581344028","Fiction",2002,10,"Amrita Pritam");
        LibraryItem book2 = new Book ("Alice in Wonderland","978-1503222687","Fantasy",1865,15,"Lewis Carrol");
        LibraryItem book3 = new Book ("The Da Vinci Code","978-0385504201","Mystery",2003,5,"Dan Brown");
        LibraryItem book4 = new Book ("Inferno","978-1400079155","Thriller",2013,2,"Dan Brown");
        LibraryItem book5 = new Book ("Les Misérables","978-0449300022","Historical Fiction",1862,13,"Victor Hugo");
        //AudioBooks
        LibraryItem audioBook1 = new AudioBook("Oracle","978-1799784531","Psychological Thriller",2021,3,"Joshua Jackson",560);
        LibraryItem audioBook2 = new AudioBook("The Call","978-1250194374","crime",2023,9,"Sibylla Budd",222);
        LibraryItem audioBook3 = new AudioBook("The Old Man And The Sea","978-0684801221","Literary Fiction",2006,1,"Donald Sutherland",148);
        LibraryItem audioBook4 = new AudioBook("The Alchemist","‎978-0061122415","Adventure Fiction",2004,12,"Jeremy Irons",240);
        LibraryItem audioBook5 = new AudioBook("The Secret","978-1582701707","self-help",2006,8,"Rhonda Byrne",264);
        //DVDs
        LibraryItem DVD1 = new DVD ("The Avengers","978-0785137061","Action",2012,4,143,"Joss Whedon","English");
        LibraryItem DVD2 = new DVD ("Hulk","‎978-0785120124","Science Fiction",2010,9,112,"Louis Leterrier","English");
        LibraryItem DVD3 = new DVD ("Harry Potter","978-1338878929","Fantasy",2001,7,152,"Chris Columbus","English");
        LibraryItem DVD4 = new DVD ("The Witch","978-0060765484","Horror",2018,2,125,"Park Hoon jung","Korean");
        LibraryItem DVD5 = new DVD ("Money Heist","979-8685710932","Crime",2017,12,60,"Álex Pina","Spanish");
        //Library Items
        LibraryItem lib1 = new LibraryItem("","","",0,0);
        LibraryItem lib2 = new LibraryItem("","","",0,0);
        LibraryItem lib3 = new LibraryItem("","","",0,0);
        LibraryItem lib4 = new LibraryItem("","","",0,0);
        LibraryItem lib5 = new LibraryItem("","","",0,0);
        //adding them to the catalog and arraylist
        items.add(book1);items.add(book2);items.add(book3);items.add(book4);items.add(book5);
        items.add(audioBook1);items.add(audioBook2);items.add(audioBook3);items.add(audioBook4);items.add(audioBook5);
        items.add(DVD1);items.add(DVD2);items.add(DVD3);items.add(DVD4);items.add(DVD5);
        items.add(lib1);items.add(lib2);items.add(lib3);items.add(lib4);items.add(lib5);
        cat.addItem(book1);cat.addItem(book2);cat.addItem(book3);cat.addItem(book4);cat.addItem(book5);
        cat.addItem(audioBook1);cat.addItem(audioBook2);cat.addItem(audioBook3);cat.addItem(audioBook4);cat.addItem(audioBook5);
        cat.addItem(DVD1);cat.addItem(DVD2);cat.addItem(DVD3);cat.addItem(DVD4);cat.addItem(DVD5);
        cat.addItem(lib1);cat.addItem(lib2);cat.addItem(lib3);cat.addItem(lib4);cat.addItem(lib5);
        boolean validnum=false;
        while(!validnum){
            validnum=false;
    do{
        boolean validYear=false, validquantity=false, validLength=false;
        System.out.println("Please select an option");
        System.out.println("1.Add a library item");
        System.out.println("2.Delete a library item");
        System.out.println("3.Modify a library item");
        System.out.println("4.Search for a library item");
        System.out.println("5.Checkout a library item");
        System.out.println("6.Return a library item");
        System.out.println("7.Exit");
        try {
            num = Integer.parseInt(sc.nextLine());
            validnum=true;
        //switch statement
        switch(num){
            case 1:
                System.out.println("Enter your item informations:");
                System.out.print("Title: ");
                title = sc.nextLine();
                System.out.print("ISBN: ");
                isbn = sc.nextLine();
                System.out.print("Genre: ");
                genre = sc.nextLine();
                System.out.print("Publication year: ");
                while (!validYear) {
                    try {
                    yearPublished = Integer.parseInt(sc.nextLine());
                    validYear = true;
                    } catch (NumberFormatException e) {
                    System.out.println("Invalid year format. Please enter a valid year.");
                    }
                }
                System.out.print("Quantity: ");
                while (!validquantity) {
                    try {
                    quantity = Integer.parseInt(sc.nextLine());
                    validquantity = true;
                    } catch (NumberFormatException e) {
                    System.out.println("Invalid number format. Please enter a valid number.");
                    }
                    }
                    System.out.print("Do you want to specify your item? ");
                    String ans = sc.next();
                    if(ans.equalsIgnoreCase("yes")){
                        System.out.println("Choose between:\n1.Book\n2.AudioBook\n3.DVD");
                        try{
                            int a = sc.nextInt();
                            if(a == 1){
                               System.out.print("Enter author: ");
                               aut = sc.next();
                               sc.nextLine();
                               item = new Book (title, isbn, genre, yearPublished, quantity, aut);
                               cat.addItem(item);
                               items.add(item);
                               System.out.println("----------------------------------------------------");
                               System.out.println(item);
                               System.out.println("----------------------------------------------------");
                            }
                            else if(a == 2){
                                System.out.print("Enter narrator: ");
                                narrator = sc.next();
                                System.out.print("Enter length in minutes: ");
                                while(!validLength){
                                    try{
                                    length = Integer.parseInt(sc.next());
                                    validLength = true;
                                    } 
                                catch(NumberFormatException e){
                                System.out.println("Invalid length format. Please enter a valid year.");
                                    } 
                                }
                                item = new AudioBook(title,isbn,genre,yearPublished,quantity,narrator,length);
                                cat.addItem(item);
                                items.add(item);
                                System.out.println("----------------------------------------------------");
                                System.out.println(item);
                                System.out.println("----------------------------------------------------");
                            }
                            else if(a == 3){
                                System.out.print("Enter length in minutes: "); 
                                while(!validLength){
                                    try{
                                    length = Integer.parseInt(sc.next());
                                    validLength = true;
                                    } 
                                catch(NumberFormatException e){
                                System.out.println("Invalid length format. Please enter a valid year.");
                                    } 
                                }
                                System.out.print("Enter director: ");
                                director = sc.next();
                                sc.nextLine();
                                System.out.print("Enter language: ");
                                lang = sc.nextLine();
                                }
                                item = new DVD(title,isbn,genre,yearPublished,quantity,length,director,lang);
                                cat.addItem(item);
                                items.add(item);
                                System.out.println("----------------------------------------------------");
                                System.out.println(item);
                                System.out.println("----------------------------------------------------");
                                cat.addItem(item);
                            }
                        catch(InputMismatchException e){
                            System.out.println("Invalid input. Please enter a number from 1 to 3.");
                        }
                    }
                    item = new LibraryItem(title, isbn, genre, yearPublished, quantity);
                    // Add the item to the catalog
                    if (item != null){
                    cat.addItem(item);
                    items.add(item);
                }
                System.out.println(item.getClass().getSimpleName()+" added successfully!");
                System.out.println("----------------------------------------------------");
                break;
            case 2:
                System.out.println("Enter the name of the item you want to delete");
                String titleToDelete = sc.nextLine();
                boolean itemDeleted = false;
                for(LibraryItem catalogItem : cat.getItems()){
                    if(catalogItem.getTitle().equalsIgnoreCase(titleToDelete)){
                        cat.removeItem(catalogItem);
                        items.remove(item);
                        System.out.println(catalogItem.getClass().getSimpleName()+" successfully deleted!");
                        itemDeleted = true;
                        break;
                    }
                }
                if(!itemDeleted){
                    System.out.println("Item not found.");
                }
                System.out.println("----------------------------------------------------");
                break;
            case 3://modify a library item
                System.out.print("Enter the title of the item you want to modify: ");
                searchTitle = sc.nextLine();
                boolean found = cat.searchItemByTitle(searchTitle);
                String newTitle,newIsbn,newGenre,yn;
                int mod,newYearPublished,newQuantity;
                for(LibraryItem item2: items){
                    if(item2.getTitle().equalsIgnoreCase(searchTitle)){
                    found = true;
                        do{
                    System.out.println("Enter what do you want to modify");
                    System.out.println("1.Title");
                    System.out.println("2.ISBN");
                    System.out.println("3.Genre");
                    System.out.println("4.Publication year");
                    System.out.println("5.quantity");
                    boolean pubyear=false,newquan=false;
                    mod = 0;
                    try{
                        mod=Integer.parseInt(sc.nextLine());
                        switch(mod){
                            case 1:
                                System.out.print("Enter the new title: ");
                                newTitle = sc.nextLine();
                                item2.setTitle(newTitle);
                                cat.modifyItem(item2, newTitle, isbn, genre, yearPublished, quantity);
                                System.out.println(item2.getClass().getSimpleName()+" title updated successfully!");
                                System.out.println("----------------------------------------------------");
                                break;
                            case 2:
                                System.out.print("Enter the new ISBN: ");
                                newIsbn=sc.nextLine();
                                item.setISBN(newIsbn);
                                cat.modifyItem(item, title, newIsbn, genre, yearPublished, quantity);
                                System.out.println(item.getClass().getSimpleName()+" ISBN updated successfully!");
                                System.out.println("----------------------------------------------------");
                                break;
                            case 3:
                                System.out.print("Enter the new genre: ");
                                newGenre=sc.nextLine();
                                item.setGenre(newGenre);
                                cat.modifyItem(item, title, isbn, newGenre, yearPublished, quantity);
                                System.out.println(item.getClass().getSimpleName()+" genre updated successfully!");
                                System.out.println("----------------------------------------------------");
                                break;
                            case 4:
                                System.out.print("Enter the new publication year: ");
                                while (!pubyear) {
                                    try {
                                        newYearPublished = Integer.parseInt(sc.next());
                                        pubyear = true;
                                        item.setYearPublished(newYearPublished);
                                        cat.modifyItem(item, title, isbn, genre, newYearPublished, quantity);
                                    }
                                    catch (NumberFormatException e) {
                                        System.out.println("Invalid year format. Please enter a valid year.");
                                    }
                                }
                                System.out.println(item.getClass().getSimpleName()+" publication year updated successfully!");
                                System.out.println("----------------------------------------------------");
                                break;
                            case 5:
                                System.out.print("Enter the new quantity: ");
                                while (!newquan) {
                                    try {
                                    newQuantity = Integer.parseInt(sc.next());
                                    newquan = true;
                                    item.setQuantity(newQuantity);
                                    cat.modifyItem(item, title, isbn, genre, yearPublished, newQuantity);
                                    System.out.println(item.getClass().getSimpleName()+" quantity updated successfully!");
                                    }
                                    catch (NumberFormatException e) {
                                    System.out.println("Invalid number format. Please enter a valid number.");
                                    }
                                }
                                System.out.println("----------------------------------------------------");
                                break;
                            default:
                                System.out.println("Invalid input.\nPlease input a number from 1 to 5.");
                                System.out.println("----------------------------------------------------");
                        }
                        System.out.println("The new informations right here:\n"+item2);
                        System.out.println("----------------------------------------------------");
                    }
                    catch(InputMismatchException e){
                        System.out.println("Invalid input. Please enter a number from 1 to 5.");
                    }
                    System.out.print("Do you wish to proceed modifying? ");
                    yn=sc.next();
                    found = false;
                    System.out.println("----------------------------------------------------");
                }while(yn.equalsIgnoreCase("yes"));
                        
                    }
                }
                if(!found){
                    System.out.println("Item not found.");
                }
                System.out.println("----------------------------------------------------");
                break;
            case 4://Search for a library item
                System.out.print("Enter the name of the item you want to find: ");
                boolean foundsearch=false;
                String search = sc.nextLine();
                for(LibraryItem item2 : items){
                    if(item2.getTitle().equalsIgnoreCase(search)){
                        foundsearch=true;
                        System.out.println("Item found");
                        System.out.println("----------------------------------------------------");
                        System.out.println("Item informations:\n"+item2);
                        break;
                    }
                }
                if(!foundsearch){
                    System.out.println("Item not found.");
                }
                System.out.println("----------------------------------------------------");
                break;
            case 5://checkout a library item
                System.out.print("Enter the name of the item you want to checkout: ");
                String checkout = sc.next();
                boolean validcontact=false, validdays=false, foundtitle=false;
                for(LibraryItem item2 : items){
                    if(item2.getTitle().equalsIgnoreCase(checkout)){
                        foundtitle=true;
                        System.out.println("Item found");
                        System.out.println("----------------------------------------------------");
                        System.out.println("Item informations:\n"+item2);
                        System.out.println("----------------------------------------------------");
                        System.out.println("Enter borrowing informations:");
                        System.out.print("Borrower Username: ");
                        String name = sc.nextLine();
                        System.out.print("Borrower contact number: ");
                        int contactNumber = 0;
                        while(!validcontact){
                            try{
                                contactNumber = Integer.parseInt(sc.next());
                                validcontact=true;
                            }
                            catch(NumberFormatException e){
                                System.out.println("Invalid number, please try again;");
                            } 
                        }
                        Borrower user = new Borrower (name,contactNumber);
                        System.out.println("Number of days to return: ");
                        int days = 0;
                        while(!validdays){
                            try{
                                days = Integer.parseInt(sc.next());
                                validdays=true;
                                
                            }
                            catch(NumberFormatException e){
                                System.out.println("Invalid number, please try again;");
                            }
                        }
                        Borrowing thisItem = new Borrowing (user,item2,days);
                        item2.borrowItem();
                        System.out.println("Borrowing successful");
                        System.out.println(thisItem);
                    }
                }
                if(!foundtitle){
                    System.out.println("Item not found.");
                }
                System.out.println("----------------------------------------------------");
                break;
            case 6://return a library item
                System.out.println("----------------------------------------------------");
                break;
            default:
                System.out.println("Invalid input. Please enter a number from 1 to 7.");
                System.out.println("----------------------------------------------------");
        }
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number from 1 to 7.");
            validnum=false;
            break;
        }
    }while(num!=7);}
}
}