package com.reply.myapp.books.service;

import com.reply.myapp.books.model.Book;
import java.util.List;

public interface BookService {

  List<Book> findAllBooks();
}
