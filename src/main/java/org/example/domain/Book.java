package org.example.domain;

import java.time.Year;

public class Book {
    private static int totalBooksCreated = 0;

    private String title;
    private String author;
    private final String isbn;
    private int publishedYear;

    public Book(String title, String author, String isbn, int publishedYear) {
        this.title = validateNotBlank("title", title);
        this.author = validateNotBlank("author", author);
        this.isbn = validateNotBlank("isbn", isbn);
        this.publishedYear = validatePublishedYear(publishedYear);
        totalBooksCreated++;
    }

    public Book(String title, String author, String isbn) {
        this(title, author, isbn, Year.now().getValue());
    }

    public Book(String title, String isbn) {
        this(title, "Unknown Author", isbn, Year.now().getValue());
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public int getPublishedYear() {
        return this.publishedYear;
    }

    public void setTitle(String title) {
        this.title = validateNotBlank("title", title);
    }

    public void setAuthor(String author) {
        this.author = validateNotBlank("author", author);
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = validatePublishedYear(publishedYear);
    }

    public static int getTotalBooksCreated() {
        return totalBooksCreated;
    }

    public void displayInfo() {
        System.out.println("Title: " + this.title
                + ", Author: " + this.author
                + ", ISBN: " + this.isbn
                + ", Published Year: " + this.publishedYear);
    }

    private static String validateNotBlank(String fieldName, String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(fieldName + " cannot be blank.");
        }
        return value;
    }

    private static int validatePublishedYear(int year) {
        int currentYear = Year.now().getValue();
        if (year < 1000 || year > currentYear) {
            throw new IllegalArgumentException(
                    "publishedYear must be between 1000 and " + currentYear + "."
            );
        }
        return year;
    }
}
