package org.example.app;

import org.example.domain.Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to SmartLib Core");

        Book book1 = new Book("Clean Code", "Robert C. Martin", "9780132350884", 2008);
        Book book2 = new Book("Clean Code Second Copy", "Different Author", "9780132350884", 2020);
        Book book3 = new Book("Effective Java", "Joshua Bloch", "9780134685991", 2018);

        System.out.println();
        System.out.println("1) Printing a Book object directly:");
        System.out.println(book1);

        System.out.println();
        System.out.println("2) Comparing two books with same ISBN using equals():");
        System.out.println("book1.equals(book2): " + book1.equals(book2));
        System.out.println("book1 == book2: " + (book1 == book2));

        System.out.println();
        System.out.println("3) hashCode values:");
        System.out.println("book1 hashCode: " + book1.hashCode());
        System.out.println("book2 hashCode: " + book2.hashCode());
        System.out.println("book3 hashCode: " + book3.hashCode());

        System.out.println();
        System.out.println("4) Consistency rule:");
        System.out.println("If two books are equal by equals(), they must return the same hashCode().");
        System.out.println("book1.equals(book2) is " + book1.equals(book2)
                + ", so their hashCodes should match.");
        System.out.println("Total books created: " + Book.getTotalBooksCreated());
    }
}
