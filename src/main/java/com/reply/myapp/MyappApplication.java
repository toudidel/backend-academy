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
              Book.builder().title("Książka telefoniczna").build(),
              Book.builder().title("Harry Potter cz. 1").build(),
              Book.builder().title("Harry Potter cz. 2").build(),
              Book.builder().title("Harry Potter cz. 3").build(),
              Book.builder().title("Harry Potter cz. 4").build(),
              Book.builder().title("Harry Potter cz. 5").build(),
              Book.builder().title("Harry Potter cz. 6").build(),
              Book.builder().title("Harry Potter cz. 7").build(),
              Book.builder().title("Harry Potter cz. 8").build(),
              Book.builder().title("Harry Potter cz. 9").build(),
              Book.builder().title("Harry Potter cz. 10").build(),
              Book.builder().title("Harry Potter cz. 11").build(),
              Book.builder().title("Harry Potter cz. 12").build(),
              Book.builder().title("Harry Potter cz. 13").build()));
    };
  }
}
