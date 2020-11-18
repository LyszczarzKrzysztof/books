package com.example.books;

import com.example.books.entity.Book;
import com.example.books.entity.BookCategory;
import com.example.books.exception.BookNotFoundException;
import elemental.json.impl.JsonUtil;
import org.omg.CosNaming.BindingIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BasicExample {
private List<Book> books;

    public BasicExample() {
        init();
        Optional<Book> optionalBook = books.stream().filter(e -> e.getTitle().equals("Title 4")).findFirst();


        Book book = optionalBook.orElseThrow(() -> new RuntimeException("Book doesn't exist"));


        System.out.println(book);

        optionalBook.ifPresent(e-> e.getTitle());

        if(optionalBook.isPresent()){
            System.out.println(optionalBook.get());
        }else {
            System.out.println("Book doesn't exist");
        }
    }

    private void init() {
        books = new ArrayList<>();
        books.add(new Book("Title 1", "1241agsg1", BookCategory.HORROR));
        books.add(new Book("Title 2", "2asgasgd46", BookCategory.HORROR));
        books.add(new Book("Title 3", "3aklhasg9asdg900", BookCategory.MEMOIR));
    }

    public static void main(String[] args) {
        new BasicExample();
    }
}
