package com.example.books.entity;


import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String isbn;

    @Enumerated(EnumType.STRING)
    private BookCategory bookCategory;

    public Book() {
    }

    public Book(String title, String isbn, BookCategory bookCategory) {
        this.title = title;
        this.isbn = isbn;
        this.bookCategory=bookCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", bookCategory=" + bookCategory +
                '}';
    }
}
