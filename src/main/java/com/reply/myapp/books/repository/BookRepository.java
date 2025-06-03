package com.reply.myapp.books.repository;

import com.reply.myapp.books.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

// @Repository
public interface BookRepository extends JpaRepository<Book, Long> {}
