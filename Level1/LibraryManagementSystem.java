class Book{
    private static String libraryName = "Swastik library";
    public final long isbn;
    public String author;
    public String title;

    public static void displayLibraryName(){
        
        System.out.println("Library Name : "+libraryName);

    }
    public void displayDetails(){
        if(this instanceof Book){

        System.out.println("this is an instance of Book class"+"\n"+"Book details are : ");
        System.out.println("Title : "+title+"\n"+"Author : "+author+"\n"+"isbn : "+isbn );
        }
        else{
            System.out.println("this is not an instance of Book class");
        }
        
    }

    public Book(String title,String author,long isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}

public class LibraryManagementSystem {
    public static void main(String[]args){
    
       Book obj = new Book("A story book","R.R.sharma",3456321);
       /*  if(obj instanceof Book){
            System.out.println("obj is an instance of Book class");
        }
            */
        
        Book.displayLibraryName();
        obj.displayDetails();
    }

}
