package org.example.app;

import org.example.domain.Book;
import org.example.domain.Borrowable;
import org.example.domain.Journal;
import org.example.domain.LibraryItem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to SmartLib Core");

        LibraryItem bookItem = new Book("B-101", "Clean Code", 2008, "Robert C. Martin", "9780132350884");
        LibraryItem journalItem = new Journal("J-201", "Nature AI", 2024, 52, "Nature Publishing");

        System.out.println();
        System.out.println("1) Basic object information:");
        bookItem.displayBasicInfo();
        journalItem.displayBasicInfo();

        System.out.println();
        System.out.println("2) Runtime polymorphism using LibraryItem:");
        System.out.println("Book late fee for 4 days: " + bookItem.calculateLateFee(4));
        System.out.println("Journal late fee for 4 days: " + journalItem.calculateLateFee(4));

        System.out.println();
        System.out.println("3) Book and Journal as Borrowable references:");
        Borrowable borrowableBook = new Book("B-102", "Effective Java", 2018, "Joshua Bloch", "9780134685991");
        Borrowable borrowableJournal = new Journal("J-202", "Science Weekly", 2025, 12, "Science Press");

        System.out.println("Book available? " + borrowableBook.isAvailable());
        System.out.println("Journal available? " + borrowableJournal.isAvailable());

        System.out.println();
        System.out.println("4) Calling the same method but getting different behavior:");
        borrowableBook.borrowItem();
        borrowableJournal.borrowItem();

        System.out.println();
        System.out.println("5) Dynamic binding:");
        System.out.println("Java decides at runtime whether Book.borrowItem() or Journal.borrowItem() should run.");

        System.out.println();
        System.out.println("6) Returning items:");
        borrowableBook.returnItem();
        borrowableJournal.returnItem();

        System.out.println();
        System.out.println("7) IS-A relationship:");
        System.out.println("Book IS-A LibraryItem and Book IS-A Borrowable.");
        System.out.println("Journal IS-A LibraryItem and Journal IS-A Borrowable.");
    }
}
