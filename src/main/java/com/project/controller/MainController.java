package com.project.controller;

import com.project.model.Book;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class MainController {

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/findAllBooks")
    public List<Book> getBooks() {
        return Stream.of(
                new Book(101, "Java", 999),
                new Book(102, "Spring", 1199),
                new Book(103, "Hibernate", 445),
                new Book(104, "Angular", 888))
                        .collect(Collectors.toList());
    }

}