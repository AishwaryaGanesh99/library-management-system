package library;

import library.model.User;
import library.service.LibraryService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryService service = new LibraryService();

        // Simulated admin login
        User admin = new User("admin", "ADMIN");

        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book (Admin)");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Update Book (Admin)");
            System.out.println("6. Delete Book (Admin)");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (admin.isAdmin()) service.addBook(sc);
                    else System.out.println("Access denied.");
                    break;

                case 2:
                    service.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    service.issueBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Book ID to return: ");
                    service.returnBook(sc.nextInt());
                    break;

                case 5:
                    if (admin.isAdmin()) service.updateBook(sc);
                    else System.out.println("Access denied.");
                    break;

                case 6:
                    if (admin.isAdmin()) {
                        System.out.print("Enter Book ID to delete: ");
                        service.deleteBook(sc.nextInt());
                    } else System.out.println("Access denied.");
                    break;

                case 7:
                    System.out.println("Exiting system...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
