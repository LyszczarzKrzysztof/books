package com.example.books;

import com.example.books.entity.Author;
import com.example.books.entity.Book;
import com.example.books.entity.BookCategory;
import com.example.books.repo.AuthorRepo;
import com.example.books.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class Start {
    private AuthorRepo authorRepo;
    private BookRepo bookRepo;

    @Autowired
    public Start(AuthorRepo authorRepo, BookRepo bookRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;

        Book book1 = new Book();
        book1.setBookCategory(BookCategory.HORROR);
        book1.setTitle("PSDDS");
        book1.setIsbn("asdfgaslkdgjas-asdgasdgasdg");

        Book book2 = new Book();
        book2.setBookCategory(BookCategory.HORROR);
        book2.setTitle("Kajko i Kokosz");
        book2.setIsbn("adgaw435454nbsfb");

        Book book3 = new Book();
        book3.setBookCategory(BookCategory.MEMOIR);
        book3.setTitle("Bokek i Lolek");
        book3.setIsbn("asgdajdyjdrtjst543w56w3-2465234fsg");

        Author author = new Author();
        author.setName("Krzysiek");
        author.setSurname("kl");
        author.setBookSet(Stream.of(book1,book2, book3).collect(Collectors.toSet()));


        bookRepo.save(book1);
        bookRepo.save(book2);
        bookRepo.save(book3);
        authorRepo.save(author);

    }


}
