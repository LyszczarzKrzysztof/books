package com.example.books;

import com.example.books.repo.AuthorDto;
import com.example.books.repo.AuthorRepo;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.List;

@Route
public class AuthorRestGui extends VerticalLayout {

    private AuthorRepo authorRepo;

    public AuthorRestGui(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;

        List<AuthorDto> authorList = authorRepo.getCategoryCount();

        Grid<AuthorDto> grid = new Grid<>(AuthorDto.class);
        grid.setItems(authorList);
        add(grid);
    }
}
