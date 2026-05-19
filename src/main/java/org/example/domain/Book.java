package org.example.domain;

public class Book {
    private final String title;
    private final String author;
    private final String isbn;
    private int publishedYear;

    public Book(String title, String author, String isbn, int publishedYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title
                + ", Author: " + author
                + ", ISBN: " + isbn
                + ", Published Year: " + publishedYear);
    }
}

