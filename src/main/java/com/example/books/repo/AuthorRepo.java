package com.example.books.repo;

import com.example.books.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Long> {

    @Query(value = "SELECT AUTHOR.NAME as Author, COUNT(AUTHOR.NAME) as CategoryCount, " +
            "BOOK.BOOK_CATEGORY as BookCategory FROM AUTHOR, BOOK GROUP BY BOOK_CATEGORY", nativeQuery = true)
    List<AuthorDto> getCategoryCount();
}
