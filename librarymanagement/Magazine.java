package problemstatement.librarymanagement;

public class Magazine extends LibraryItem implements Reservable {
    private String issueDate;

    public Magazine(int itemId, String title, String author, String issueDate) {
        super(itemId, title, author);
        this.issueDate = issueDate;
    }

    public String getIssueDate(){
        return issueDate;
    }

    @Override
    int getLoanDuration() {
        return 7; // 1 week
    }

    @Override
    public void reserveItem(String borrowerName) {
        if(checkAvailability()){
            setReserved(true);
            System.out.println("Magazine " + getTitle() + " reserved by " + borrowerName);
        } else {
            System.out.println("Magazine " + getTitle() + " is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

