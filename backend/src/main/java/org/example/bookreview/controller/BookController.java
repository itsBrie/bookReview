package org.example.bookreview.controller;

import org.example.bookreview.model.Book;
import org.example.bookreview.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController()
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class BookController {
    @Autowired
    private BookService bookService;


    @GetMapping("/books")
    public List<Book> returnAllBooks(){
        return bookService.getBookRepository();
    }

//    @PostMapping
//    public Book createBook(@RequestBody Book book) {
//        return bookService.saveBook(book);
//    }
}
