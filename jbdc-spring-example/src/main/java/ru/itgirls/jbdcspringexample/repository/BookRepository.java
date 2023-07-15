package ru.itgirls.jbdcspringexample.repository;

import ru.itgirls.jbdcspringexample.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();

    Book findBookId(Long id);
}