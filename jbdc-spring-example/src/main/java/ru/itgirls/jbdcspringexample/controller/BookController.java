package ru.itgirls.jbdcspringexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirls.jbdcspringexample.model.Book;
import ru.itgirls.jbdcspringexample.repository.BookRepository;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book/all")
    public List<Book> getAllBook() {
        return bookRepository.findAllBooks();
    }

    @GetMapping("book/{id}")
    public Book findBookBeiId(@PathVariable("id") Long id) {
        return bookRepository.findBookId(id);
    }

}