package problemstatement.librarymanagement;

public class DVD extends LibraryItem implements Reservable {
    private int duration;

    public DVD(int itemId, String title, String author, int duration) {
        super(itemId, title, author);
        this.duration = duration;
    }

    public int getDuration(){
        return duration;
    }

    @Override
    int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if(checkAvailability()){
            setReserved(true);
            System.out.println("DVD " + getTitle() + " reserved by " + borrowerName);
        } else {
            System.out.println("DVD " + getTitle() + " is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

