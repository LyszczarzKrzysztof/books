package com.example.books.exception;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(long id) {
        super("Book which id is " + id + " doesn't exist.");
    }
}
