package com.reply.myapp;

import com.reply.myapp.books.model.Book;
import com.reply.myapp.books.repository.BookRepository;
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
  CommandLineRunner init(BookRepository bookRepository) {
    return args -> {
      bookRepository.saveAll(
          List.of(
              Book.builder().title("Encyklopedia PWN").build(),
              Book.builder().title("Książka telefoniczna").build()));
    };
  }
}
