package com.reply.myapp.books.service;

import com.reply.myapp.books.model.Book;
import com.reply.myapp.books.repository.BookRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

  private final BookRepository bookRepository;

  @Override
  public List<Book> findAllBooks() {
    return bookRepository.findAll();
  }
}
