package com.example.books.repo;

import org.springframework.stereotype.Component;

@Component
public interface AuthorDto {
    String getAuthor();
    int getCategoryCount();
    String getBookCategory();
}
