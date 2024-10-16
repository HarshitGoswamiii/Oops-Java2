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
        for (int i = 0; i < TotalBooks; i++) {
            System.out.println(Books[i]);
        }
    }

    // For Returning Books
    public void ReturnBooks() {

    }
}

public class liabrary {
    public static void main(String[] args) {
        Desk Dsk = new Desk();
        Dsk.AddBooks("Computer Graphics");
        Dsk.AddBooks("Operating System");
        Dsk.AddBooks("Computer Networking");
        Dsk.AddBooks("Database Management System");

        Dsk.AvailableBooks();
    }
}