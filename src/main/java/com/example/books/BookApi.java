package com.example.books;

import com.example.books.entity.Book;
import com.example.books.exception.BookNotFoundException;
import com.example.books.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookApi {

    private BookRepo bookRepo;

    @Autowired
    public BookApi(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable long id) {
        return bookRepo.findById(id).orElseThrow(() -> new BookNotFoundException(id));
    }

    @PutMapping("/book/{id}")
    public Book putBook(@RequestBody Book newBook, @PathVariable long id) {
       return bookRepo.findById(id)
                .map(element -> {
                    element.setTitle(newBook.getTitle());
                    element.setIsbn(newBook.getIsbn());
                    return bookRepo.save(element);
                })
                .orElseGet(()-> {
                    newBook.setId(id);
                   return bookRepo.save(newBook);
                });
    }
}
