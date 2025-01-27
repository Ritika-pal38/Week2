package problemstatement.librarymanagement;

public  abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private boolean isReserved;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isReserved(){
        return isReserved;
    }

    public void setReserved(boolean reserved){
        isReserved = reserved;
    }

    abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        if (this instanceof Reservable) { // Check if the item is reservable
            System.out.println("Availability: " + ((Reservable) this).checkAvailability());
        } else {
            System.out.println("Availability: Not Reservable");
        }
    }

    @Override
    public String toString(){
        return "Item ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
}


