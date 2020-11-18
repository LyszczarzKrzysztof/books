package com.example.books;

import com.example.books.repo.AuthorDto;
import com.example.books.repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorRestApi {
    private AuthorRepo authorRepo;

    @Autowired
    public AuthorRestApi(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @GetMapping("/getAuthorInfo")
    public List<AuthorDto> getCategoryCountRestApi(){
        return authorRepo.getCategoryCount();
    }
}
