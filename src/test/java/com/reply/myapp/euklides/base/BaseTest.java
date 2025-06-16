package com.reply.myapp.euklides.base;

import com.reply.myapp.books.repository.AuthorRepository;
import com.reply.myapp.books.repository.BookRepository;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BaseTest {

  @MockitoBean protected BookRepository bookRepository;
  @MockitoBean protected AuthorRepository authorRepository;

  @LocalServerPort private int port;

  @BeforeEach
  public void beforeEach() {
    RestAssured.baseURI = String.format("http://localhost:%s", port);
    RestAssured.port = port;
  }
}
