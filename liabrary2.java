import java.security.interfaces.DSAKey;
import java.util.Scanner;

class Desk {
    String[] Books = new String[10];
    int TotalBooks = 0;

    // For Adding books
    public void AddBooks() {
        Scanner b = new Scanner(System.in);
        String Book = b.nextLine();
        if (TotalBooks >= Books.length) {
            System.out.println("Shelf is Full \nThere is no space for new book");
        } else {
            Books[TotalBooks] = Book;
            TotalBooks++;
        }
    }

    // For Issuing Books
    public void IssueBooks() {
        Scanner is = new Scanner(System.in);
        String Issue = is.nextLine();
        System.out.print("Book To be Issued : " + Issue);
        for (int i = 0; i < TotalBooks; i++) {
            if (Books[i].equals(Issue)) {
                System.out.println("\nBooks Is Issued ! ");
                Books[i] = null;
            }
        }
    }

    // For Showing Available Books
    public void AvailableBooks() {
        System.out.println("Available Books : ");
        for (int i = 0; i < TotalBooks; i++) {
            if (Books[i] == null) {
                continue;
            }
            System.out.println(Books[i]);
        }
    }

    // For Returning Books
    public void ReturnBooks() {
        Scanner ret = new Scanner(System.in);
        String retur = ret.nextLine();
        System.out.println("Book returning : " + retur);
        Books[TotalBooks] = retur;
        TotalBooks++;
    }
}

public class liabrary2 {
    public static void main(String[] args) {
        Desk dsk = new Desk();
    int Looping = 4;
        for (int i = 0; i < 10; i++) {
            switch (Looping) {
                case 1 -> {
                    dsk.AddBooks();
                }
                default -> throw new AssertionError();
            }
        }
    }
}
