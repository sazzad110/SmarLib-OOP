package org.example.app;

import org.example.domain.Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to SmartLib Core");

        Book book1 = new Book("Clean Code", "Robert C. Martin", "9780132350884", 2008);
        Book book2 = new Book("Effective Java", "Joshua Bloch", "9780134685991");
        Book book3 = new Book("Head First Java", "9780596009205");

        System.out.println();
        System.out.println("Book Information:");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        System.out.println();
        System.out.println("Total books created: " + Book.getTotalBooksCreated());

        System.out.println();
        System.out.println("Trying invalid data:");
        try {
            Book invalidBook = new Book(" ", "Author Name", "1234567890", 2020);
            invalidBook.displayInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Could not create book: " + e.getMessage());
        }

        try {
            book1.setPublishedYear(999);
        } catch (IllegalArgumentException e) {
            System.out.println("Could not update published year: " + e.getMessage());
        }

        try {
            book2.setAuthor("   ");
        } catch (IllegalArgumentException e) {
            System.out.println("Could not update author: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Total books created after invalid attempts: " + Book.getTotalBooksCreated());
    }
}
