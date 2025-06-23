package com.reply.myapp.books.repository;

import com.reply.myapp.books.model.Book;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/** Spring Data JPA: https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html */
// @Repository
public interface BookRepository extends JpaRepository<Book, Long> {

  Page<Book> findByTitleStartsWithIgnoreCase(Pageable pageable, String title);

  @Query("SELECT b FROM Book b JOIN FETCH b.author")
  List<Book> findAllBooksWithAuthors();
}
