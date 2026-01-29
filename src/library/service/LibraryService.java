package library.service;

import library.model.Book;
import library.util.FileUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LibraryService {

    private ArrayList<Book> books;

    public LibraryService() {
        books = FileUtil.loadData();
    }

    public void addBook(Scanner sc) {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));
        FileUtil.saveData(books);

        System.out.println("Book added successfully.");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        books.forEach(System.out::println);
    }

    public void issueBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId && !book.isIssued()) {
                book.setIssued(true);
                FileUtil.saveData(books);
                System.out.println("Book issued successfully.");
                return;
            }
        }
        System.out.println("Book not available for issue.");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId && book.isIssued()) {
                book.setIssued(false);
                FileUtil.saveData(books);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Invalid return request.");
    }

    public void updateBook(Scanner sc) {
        System.out.print("Enter Book ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Book book : books) {
            if (book.getBookId() == id) {
                System.out.print("Enter new Title: ");
                book.setTitle(sc.nextLine());

                System.out.print("Enter new Author: ");
                book.setAuthor(sc.nextLine());

                FileUtil.saveData(books);
                System.out.println("Book updated successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void deleteBook(int bookId) {
        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getBookId() == bookId) {
                iterator.remove();
                FileUtil.saveData(books);
                System.out.println("Book deleted successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
