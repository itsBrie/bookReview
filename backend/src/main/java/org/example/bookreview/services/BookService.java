package org.example.bookreview.services;

import org.example.bookreview.model.Book;
import org.example.bookreview.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

@Autowired
    private BookRepository bookRepository;

    public List<Book> getBookRepository () {
        return bookRepository.findAll();
    }


}
