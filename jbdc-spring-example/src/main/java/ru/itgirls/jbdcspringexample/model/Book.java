package ru.itgirls.jbdcspringexample.model;

public class Book {
    private Long id;
    private String name;
    private String author;

    public String getAuthor() {
        return author;
    }
    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Book setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public Book(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }


    public Book() {

    }
}
