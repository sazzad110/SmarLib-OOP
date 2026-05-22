package org.example.app;

import org.example.domain.Book;
import org.example.domain.Journal;
import org.example.domain.LibraryItem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to SmartLib Core");

        LibraryItem bookItem = new Book("B-101", "Clean Code", 2008, "Robert C. Martin", "9780132350884");
        LibraryItem journalItem = new Journal("J-201", "Nature AI", 2024, 52, "Nature Publishing");

        System.out.println();
        System.out.println("1) Creating Book and Journal objects:");
        bookItem.displayBasicInfo();
        journalItem.displayBasicInfo();

        System.out.println();
        System.out.println("2) Calling calculateLateFee():");
        System.out.println("Book late fee for 4 days: " + bookItem.calculateLateFee(4));
        System.out.println("Journal late fee for 4 days: " + journalItem.calculateLateFee(4));

        System.out.println();
        System.out.println("3) super keyword demonstration:");
        System.out.println("Book and Journal call super.displayBasicInfo() and then print their own fields.");

        System.out.println();
        System.out.println("4) IS-A relationship:");
        System.out.println("Book IS-A LibraryItem and Journal IS-A LibraryItem.");
        System.out.println("That is why both can be stored in LibraryItem references.");
    }
}
