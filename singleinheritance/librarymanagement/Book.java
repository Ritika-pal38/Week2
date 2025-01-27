package singleinheritance.librarymanagement;

public class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int year) {
        this.title = title;
        this.publicationYear = year;
    }

    public void displayInfo() {
        System.out.println("Book details are : ");
        System.out.println("Title : " + title + "\n" + "Publication year : " + publicationYear);
    }
}