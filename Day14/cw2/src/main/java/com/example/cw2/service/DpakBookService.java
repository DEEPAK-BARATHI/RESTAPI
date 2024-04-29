package com.example.cw2.service;

import com.example.cw2.model.DpakBook;
import com.example.cw2.repository.DpakBookRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DpakBookService {
    private final DpakBookRepo bookRepo;

    public DpakBookService(DpakBookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public DpakBook createBook(DpakBook Book) {
        return bookRepo.save(Book);
    }
    public List<DpakBook> getAllBooks() {
        return bookRepo.findAll();
    }
    public DpakBook getBookById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }
    public DpakBook updateBookById(Long id,DpakBook book){
        DpakBook b = bookRepo.findById(id).orElse(null);
        if(b!=null){
            b.setAuthor(book.getAuthor());
            b.setAvailableCopies(book.getAvailableCopies());
            b.setTitle(book.getTitle());
            b.setTotalCopies(book.getTotalCopies());
            bookRepo.save(b);
        }
        return b;
    }
}
