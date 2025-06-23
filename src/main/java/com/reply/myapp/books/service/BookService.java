package com.reply.myapp.books.service;

import com.reply.myapp.books.model.Book;
import com.reply.myapp.books.model.BookRequest;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookService {

  List<Book> findAll();

  Page<Book> findAllPageable(Pageable pageable);

  Page<Book> findBooksByTitle(BookRequest request, Pageable pageable);
}
