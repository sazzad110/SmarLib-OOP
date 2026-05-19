package org.example.app;

import org.example.domain.Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to SmartLib Core");

        Book book1 = new Book("Clean Code", "Robert C. Martin", "9780132350884", 2008);
        Book book2 = new Book("Effective Java", "Joshua Bloch", "9780134685991", 2018);
        Book book3 = new Book("Head First Java", "Kathy Sierra", "9780596009205", 2005);


        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();


    }
}
