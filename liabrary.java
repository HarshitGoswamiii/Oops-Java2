class Desk {
    String[] Books = new String[10];
    int TotalBooks = 0;

    // For Adding books
    public void AddBooks(String books) {
        if (TotalBooks >= Books.length) {
            System.out.println("Shelf is Full \nThere is no space for new book");
        } else {
            Books[TotalBooks] = books;
            TotalBooks++;
        }
    }

    // For Issuing Books
    public void IssueBooks(String Issue) {
        System.out.print("Book To be Issued : "+Issue);
        for(int i = 0 ; i < TotalBooks;i++){
            if(Books[i].equals(Issue)){
                System.out.println("\nBooks Is Issued ! ");
                Books[i]=null;
            }
        }
    }

    // For Showing Available Books
    public void AvailableBooks() {
        System.out.println("Available Books : ");
        for (int i = 0; i < TotalBooks; i++) {
            if(Books[i]==null){
                continue;
            }
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

        Dsk.IssueBooks("Computer Graphics");

        Dsk.AvailableBooks();

    }
}