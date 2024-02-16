package com.myjavalife.bookendpointsms.service;

import com.myjavalife.bookendpointsms.model.Book;
import com.myjavalife.bookendpointsms.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> getallbooks() {
        return bookRepository.findAll();

    }

    public void addbook(Book book) {
        bookRepository.save(book);
    }


    public Book getbook(int bookId) {
        return bookRepository.findById(bookId).get();
    }

    public void updatebook(Book book, int bookId) {
        Book pb=bookRepository.findById(bookId).get();
        bookRepository.save(book);

    }

    public void deletebook(int bookId) {
        bookRepository.deleteById(bookId);
    }
}
