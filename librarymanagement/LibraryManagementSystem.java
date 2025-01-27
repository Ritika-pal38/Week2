package problemstatement.librarymanagement;
import java.util.*;
public class LibraryManagementSystem{
public static void main(String[] args) {
    List<LibraryItem> libraryItems = new ArrayList<>();

    Book book1 = new Book(1, "The Lord of the Rings", "J.R.R. Tolkien", "978-0547928227");
    Magazine magazine1 = new Magazine(2, "National Geographic", "Various", "October 2024");
    DVD dvd1 = new DVD(3, "Inception", "Christopher Nolan", 148);
    Book book2 = new Book(4, "Pride and Prejudice", "Jane Austen", "978-0141439518");

    libraryItems.add(book1);
    libraryItems.add(magazine1);
    libraryItems.add(dvd1);
    libraryItems.add(book2);

    for (LibraryItem item : libraryItems) {
        item.getItemDetails();
        System.out.println();
    }

    book1.reserveItem("Alice");
    book1.reserveItem("Bob");
    magazine1.reserveItem("Charlie");
    dvd1.reserveItem("David");
    dvd1.reserveItem("Eve");

    System.out.println();
    for (LibraryItem item : libraryItems) {
        item.getItemDetails();
        System.out.println();
    }
}
}

