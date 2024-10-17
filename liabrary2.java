import java.util.Scanner;

class Desk {
    String[] Books = new String[10];
    int TotalBooks = 0;
    Scanner scan = new Scanner(System.in);

    // For Adding books
    public void AddBooks() {
        for (int j = 1; j <= Books.length; j++) {
            System.out.print("Enter Book " + j + " Name (type 'end' to stop') :  ");
            String Book = scan.nextLine();
            if (Book.equals("end")) {
                break;
            } else {
                if (TotalBooks >= Books.length) {
                    System.out.println("Shelf is Full \nThere is no space for new book");
                    break;
                } else {
                    Books[TotalBooks] = Book;
                    TotalBooks++;
                }
            }

        }
    }

    // For Issuing Books
    public void IssueBooks() {
        System.out.print("Book to be Issued: ");
        String Issue = scan.nextLine();
        boolean bookFound = false;  // Flag to track if the book was found
    
        for (int i = 0; i < TotalBooks; i++) {
            // Use equalsIgnoreCase to ignore case differences
            if (Books[i] != null && Books[i].equalsIgnoreCase(Issue)) {
                System.out.println("\nBook is Issued!");
                Books[i] = null;  // Remove the book after issuing
                bookFound = true;  // Set flag to true when book is found
                break;  // Exit the loop after issuing the book
            }
        }
    
        if (!bookFound) {
            System.out.println("Sorry, the book '" + Issue + "' is not available in the desk.");
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
        if (TotalBooks >= Books.length) {
            System.out.println("Shelf is full. Cannot return the book.");
            return;
        }
        String retur = scan.nextLine();
        System.out.println("Book returning : " + retur);
        Books[TotalBooks] = retur;
        TotalBooks++;
    }
}

public class liabrary2 {
    public static void main(String[] args) {
        Desk dsk = new Desk();
        Scanner scanning = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "1 -> For Adding Books \n2 -> For Issuing Books\n3 -> For Showing Available Books \n4 -> For Returning Books");
            System.out.println("5 -> Exit");
            System.out.print("Enter Your Choice : ");

            int choice = scanning.nextInt();
            scanning.nextLine();
            switch (choice) {
                case 1 -> {
                    dsk.AddBooks(); // For Adding Books
                }
                case 2 -> {
                    dsk.IssueBooks(); // For Issuing Books
                }
                case 3 -> {
                    dsk.AvailableBooks(); // For Showing Available Books
                }
                case 4 -> {
                    dsk.ReturnBooks(); // For Returning Books
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    break;
                }
                default -> System.out.println("Invalid Output. Please Try Again");
            }
        }
    }
}