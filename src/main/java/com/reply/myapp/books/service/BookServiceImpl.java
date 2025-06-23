package com.reply.myapp.books.service;

import com.reply.myapp.books.model.Book;
import com.reply.myapp.books.model.BookRequest;
import com.reply.myapp.books.repository.BookRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

  private final BookRepository bookRepository;

  @Override
  public List<Book> findAll() {
    return bookRepository.findAll();
  }

  @Override
  public Page<Book> findAllPageable(Pageable pageable) {
    return bookRepository.findAll(pageable);
  }

  @Override
  public Page<Book> findBooksByTitle(BookRequest request, Pageable pageable) {
    log.info("Szukam książki: " + request.titleStartsWith());
    return bookRepository.findByTitleStartsWithIgnoreCase(pageable, request.titleStartsWith());
  }
}
