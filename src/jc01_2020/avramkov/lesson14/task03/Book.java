package jc01_2020.avramkov.lesson14.task03;

import java.io.Serializable;

public class Book implements Serializable {
    String name;
    transient String author;
    int isbn;

    public Book(String name, String author, int isbn) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}
