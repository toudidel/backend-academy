package com.reply.myapp.books.repository;

import com.reply.myapp.books.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {}
