package com.myjavalife.bookendpointsms.controller;

import com.myjavalife.bookendpointsms.model.Book;
import com.myjavalife.bookendpointsms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping(value = "/books")
    public List<Book> getallbooks(){
        return bookService.getallbooks();
    }
    @PostMapping(value = "/books")
    public String addbook(@RequestBody Book book){
        bookService.addbook(book);
        return "book addes successfully";
    }
    @GetMapping(value = "/books/{book_id}")
    public Book getbook(@PathVariable int book_id){
        return bookService.getbook(book_id);
    }
    @PutMapping(value="/books/{book_id}")
    public String updatebook(@RequestBody Book book,@PathVariable int book_id){
        bookService.updatebook(book,book_id);
        return "book updated";
    }
    @DeleteMapping(value = "/books/{book_id}")
    public String deletebook(@PathVariable int book_id){
        bookService.deletebook(book_id);
        return "book updated";
    }

}
