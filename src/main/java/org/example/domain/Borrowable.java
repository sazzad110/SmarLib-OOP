package org.example.domain;

public interface Borrowable {
    public void borrowItem();
    public void returnItem();
    public boolean isAvailable();

}
