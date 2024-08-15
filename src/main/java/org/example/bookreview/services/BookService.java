package org.example.bookreview.services;

import org.example.bookreview.model.Book;
import org.example.bookreview.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.SequencedCollection;

@Service
public class BookService {

    private BookRepository bookRepository;

    public List<Book> getBookRepository () {
        return bookRepository.findAll();
    }
}
