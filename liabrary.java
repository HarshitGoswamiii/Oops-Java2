class Desk {
    String[] Books = new String[10];
    int TotalBooks = 0;

    // For Adding books
    public void AddBooks(String books) {
        if (TotalBooks >= Books.length) {
            System.out.println("Shelf is Full \nThere is no space for new book");
        }
        else{
            Books[TotalBooks] = books;
            TotalBooks++;
        }
    }

    // For Showing Available Books
    public void AvailableBooks() {


    }

    // For Returning Books
    public void ReturnBooks() {

    }
}

public class liabrary {
    public static void main(String[] args) {

    }
}