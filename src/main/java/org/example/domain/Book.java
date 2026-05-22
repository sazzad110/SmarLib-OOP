package org.example.domain;

import java.util.Objects;

public class Book extends LibraryItem implements Borrowable {
    private final String author;
    private final String isbn;
    private boolean available = true;

    public Book(String id, String title, int publishedYear, String author, String isbn) {
        super(id, title, publishedYear);
        this.author = author;
        this.isbn = isbn;
        this.available = true;
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


    @Override
    public void borrowItem() {
        if(this.available) {
            this.available = false;
            System.out.println("Book is borrowed"+ this.getTitle());
        } else {
            System.out.println("The book is not available for borrow. Already borrowed");
        }
    }

    @Override
    public void returnItem() {
        if(this.available == false) {
            this.available = true;
            System.out.println("Book is returned just now. So availbale for borrwo");
        } else {
            System.out.println("Book is borrowed status now . not retured yet");
        }
    }

    @Override
    public boolean isAvailable() {
        return this.available;
    }
}
