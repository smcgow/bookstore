package com.wecome.bookstore.controller;

import com.wecome.bookstore.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @GetMapping("/api/v1/books")
    public ResponseEntity<List<BookDto>> getAllBooks(){

        BookDto bookDto = BookDto.builder()
                .title("My first book2")
                .build();

       return ResponseEntity.ok(List.of(bookDto));

    }

}
