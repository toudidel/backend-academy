package com.reply.myapp.books.service;

import com.reply.myapp.books.model.Book;
import com.reply.myapp.books.model.BookRequest;
import com.reply.myapp.books.repository.BookRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

  private final BookRepository bookRepository;

  @Override
  public List<Book> findAll() {
    return bookRepository.findAll();
  }

  @Override
  public Page<Book> findAllBooks(Pageable pageable) {
    return bookRepository.findAll(pageable);
  }

  @Override
  public Page<Book> findBooks(BookRequest request, Pageable pageable) {
    return bookRepository.findByTitleStartsWith(pageable, request.titleStartsWith());
  }
}
