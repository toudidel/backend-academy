package com.reply.myapp;

import com.reply.myapp.books.model.Author;
import com.reply.myapp.books.model.Book;
import com.reply.myapp.books.repository.AuthorRepository;
import com.reply.myapp.books.repository.BookRepository;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyappApplication {

  public static void main(String[] args) {
    SpringApplication.run(MyappApplication.class, args);
  }

  @Bean
  CommandLineRunner init(BookRepository bookRepository, AuthorRepository authorRepository) {
    return args -> {
      Author author1 =
          authorRepository.save(Author.builder().firstName("Jan").lastName("Kowalski").build());
      Author author2 =
          authorRepository.save(Author.builder().firstName("John").lastName("Doe").build());
      Author author3 =
          authorRepository.save(Author.builder().firstName("J.K.").lastName("Rowling").build());

      bookRepository.saveAll(
          List.of(
              Book.builder()
                  .title("Encyklopedia PWN")
                  .price(new BigDecimal("100.00"))
                  .author(author1)
                  .build(),
              Book.builder()
                  .title("Książka telefoniczna")
                  .price(new BigDecimal("50.00"))
                  .author(author2)
                  .build(),
              Book.builder()
                  .title("Harry Potter cz. 1")
                  .price(new BigDecimal("29.99"))
                  .author(author3)
                  .build(),
              Book.builder()
                  .title("Harry Potter cz. 2")
                  .price(new BigDecimal("29.99"))
                  .author(author3)
                  .build(),
              Book.builder()
                  .title("Harry Potter cz. 3")
                  .price(new BigDecimal("29.99"))
                  .author(author3)
                  .build(),
              Book.builder()
                  .title("Harry Potter cz. 4")
                  .price(new BigDecimal("29.99"))
                  .author(author3)
                  .build(),
              Book.builder()
                  .title("Harry Potter cz. 5")
                  .price(new BigDecimal("29.99"))
                  .author(author3)
                  .build(),
              Book.builder()
                  .title("Harry Potter cz. 6")
                  .price(new BigDecimal("29.99"))
                  .author(author3)
                  .build(),
              Book.builder()
                  .title("Harry Potter cz. 7")
                  .price(new BigDecimal("29.99"))
                  .author(author3)
                  .build(),
              Book.builder()
                  .title("Harry Potter cz. 8")
                  .price(new BigDecimal("29.99"))
                  .author(author3)
                  .build()));
    };
  }
}
