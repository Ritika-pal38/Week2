package problemstatement.librarymanagement;

public class Book extends LibraryItem implements Reservable {
    private String isbn;

    public Book(int itemId, String title, String author, String isbn) {
        super(itemId, title, author);
        this.isbn = isbn;
    }

    public String getIsbn(){
        return isbn;
    }

    @Override
    int getLoanDuration() {
        return 21; // 3 weeks
    }

    @Override
    public void reserveItem(String borrowerName) {
        if(checkAvailability()){
            setReserved(true);
            System.out.println("Book " + getTitle() + " reserved by " + borrowerName);
        } else {
            System.out.println("Book " + getTitle() + " is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}
