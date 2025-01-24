import java.util.*;


class Book{
    private String Title;
    private String Author;

    Book(String title,String author){
        this.Title = title;
        this.Author = author;
    }

    public String getTitle(){
        return Title;

    }
    public String getAuthor(){
        return Author;
    }
}

class Library{

    public String LibraryName;
    private int LibraryID;
    private ArrayList<Book>books;

    Library(String name,int ID){
        this.LibraryName = name;
        this.LibraryID = ID;
        this.books = new ArrayList<>();
    }

    public void addBook(Book b){
        books.add(b);
    }

    public void displayDetails(){
        System.out.println("Book details are : ");
        System.out.println("Library name : "+LibraryName);
        for(int i =0;i<books.size();i++){
            System.out.println("Book title : " + books.get(i).getTitle() +"\nAuthor name : "+books.get(i).getAuthor());
        }
    } 
}


public class LibraryAndBooks {
    public static void main(String[]args){

        Book b = new Book("A long tale","Rajiv Sharma");
        Book b2 = new Book("Gambler","Sahid Jha");
        Library L = new Library("Swastik library",12345);

        L.addBook(b);
        L.addBook(b2);
        L.displayDetails();

    }
    
}
