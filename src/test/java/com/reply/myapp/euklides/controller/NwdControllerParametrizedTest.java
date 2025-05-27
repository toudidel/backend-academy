package com.reply.myapp.euklides.controller;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.reply.myapp.euklides.base.BaseTest;
import com.reply.myapp.euklides.model.Nwd;
import java.util.stream.Stream;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpStatus;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.http.MediaType;

class NwdControllerParametrizedTest extends BaseTest {

  static Stream<Nwd> data() {
    return Stream.of(
        Nwd.builder().a(12).b(18).nwd(6).build(),
        Nwd.builder().a(3).b(3).nwd(3).build(),
        Nwd.builder().a(120).b(18).nwd(6).build(),
        Nwd.builder().a(100).b(1000).nwd(100).build());
  }

  @ParameterizedTest
  @CsvSource({"12, 18, 6", "3, 3, 3", "120, 18, 6", "100, 1000, 100"})
  void test_nwd(Integer a, Integer b, Integer nwd) {
    Nwd requestBody = Nwd.builder().a(a).b(b).build();

    Nwd response =
        given()
            .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .body(requestBody)
            .when()
            .post("/nwd")
            .then()
            .statusCode(HttpStatus.SC_OK)
            .extract()
            .response()
            .as(Nwd.class);

    assertNotNull(response);
    assertEquals(nwd, response.getNwd());
  }

  @ParameterizedTest
  @MethodSource("data")
  void test_nwd_v2(Nwd nwd) {
    Nwd requestBody = Nwd.builder().a(nwd.getA()).b(nwd.getB()).build();

    Nwd response =
        given()
            .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .body(requestBody)
            .when()
            .post("/nwd")
            .then()
            .statusCode(HttpStatus.SC_OK)
            .extract()
            .response()
            .as(Nwd.class);

    assertNotNull(response);
    assertEquals(nwd.getNwd(), response.getNwd());
  }
}
