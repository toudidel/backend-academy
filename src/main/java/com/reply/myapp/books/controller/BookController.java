package com.reply.myapp.books.controller;

import com.reply.myapp.books.model.Book;
import com.reply.myapp.books.service.BookService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

  private final BookService bookService;

  @GetMapping
  public ResponseEntity<List<Book>> findAll() {
    return ResponseEntity.ok(bookService.findAll());
  }

  @GetMapping("/all")
  public ResponseEntity<Page<Book>> findAllBooks(Pageable pageable) {
    return ResponseEntity.ok(bookService.findAllBooks(pageable));
  }
}
