package singleinheritance.librarymanagement;

public class Author extends Book {

    public String name ;

    public Author(String title,int year,String name){
        super(title,year);
        this.name = name;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Author name : "+name);
    }
}
