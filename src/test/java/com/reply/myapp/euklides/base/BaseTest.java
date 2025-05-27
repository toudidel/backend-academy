package com.reply.myapp.euklides.base;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BaseTest {

  @LocalServerPort private int port;

  @BeforeEach
  public void beforeEach() {
    RestAssured.baseURI = String.format("http://localhost:%s", port);
    RestAssured.port = port;
  }
}
