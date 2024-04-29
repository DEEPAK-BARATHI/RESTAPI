package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.DpakAuthor;
import com.example.q1.model.DpakBook;
import com.example.q1.repository.DpakAuthorRepository;
import com.example.q1.repository.DpakBookRepository;

@Service
public class DpakBookService {
    @Autowired
    private DpakBookRepository bookRepository;
@Autowired
private DpakAuthorRepository authorRepository;
    public DpakBook saveBook(Long authorId, DpakBook book) {
        DpakAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public DpakBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

