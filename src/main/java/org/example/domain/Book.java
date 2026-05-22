package org.example.domain;

import java.util.Objects;

public class Book extends LibraryItem {
    private final String author;
    private final String isbn;

    public Book(String id, String title, int publishedYear, String author, String isbn) {
        super(id, title, publishedYear);
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    @Override
    public double calculateLateFee(int lateDays) {
        if (lateDays <= 0) {
            return 0.0;
        }
        return lateDays * 2.0;
    }

    @Override
    public void displayBasicInfo() {
        super.displayBasicInfo();
        System.out.println("Author: " + this.author + ", ISBN: " + this.isbn);
    }

    @Override
    public String toString() {
        return "Book{"
                + "id='" + getId() + '\''
                + ", title='" + getTitle() + '\''
                + ", publishedYear=" + getPublishedYear()
                + ", author='" + this.author + '\''
                + ", isbn='" + this.isbn + '\''
                + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Book)) {
            return false;
        }
        Book other = (Book) obj;
        return this.isbn.equals(other.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.isbn);
    }
}
