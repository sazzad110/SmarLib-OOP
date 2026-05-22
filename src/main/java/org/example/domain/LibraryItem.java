package org.example.domain;

public abstract class LibraryItem {
    private final String id;
    private final String title;
    private final int publishedYear;

    public LibraryItem(String id, String title, int publishedYear) {
        this.id = id;
        this.title = title;
        this.publishedYear = publishedYear;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPublishedYear() {
        return this.publishedYear;
    }

    public abstract double calculateLateFee(int lateDays);

    public void displayBasicInfo() {
        System.out.println("ID: " + this.id
                + ", Title: " + this.title
                + ", Published Year: " + this.publishedYear);
    }
}
