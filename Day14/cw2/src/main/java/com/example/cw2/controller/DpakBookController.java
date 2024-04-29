package com.example.cw2.controller;

import com.example.cw2.model.DpakBook;
import com.example.cw2.service.DpakBookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class DpakBookController {
    private final DpakBookService bookService;

    public DpakBookController(DpakBookService BookService) {
        this.bookService = BookService;
    }

    @PostMapping
    public ResponseEntity<DpakBook> createBook(@RequestBody DpakBook Book) {
        DpakBook createdBook = bookService.createBook(Book);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBook);
    }

    @GetMapping
    public ResponseEntity<List<DpakBook>> getAllBooks() {
        List<DpakBook> Books = bookService.getAllBooks();
        return ResponseEntity.ok(Books);
    }
    @PutMapping("/{bookId}")
    public DpakBook updateBookById(@PathVariable Long bookId,@RequestBody DpakBook book){
        DpakBook b = bookService.updateBookById(bookId, book);
        return b;
    }
    @GetMapping("/{bookId}")
    public DpakBook getBookById(@PathVariable Long bookId) {
        DpakBook book = bookService.getBookById(bookId);
        return book;
    }
}
