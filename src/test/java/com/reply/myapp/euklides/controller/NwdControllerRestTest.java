package com.reply.myapp.euklides.controller;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.reply.myapp.euklides.base.BaseTest;
import com.reply.myapp.euklides.model.Nwd;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

class NwdControllerRestTest extends BaseTest {

  @Test
  void test_nwd() {
    // given
    Nwd requestBody = Nwd.builder().a(12).b(18).build();

    // when
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

    // then
    assertNotNull(response);
    assertEquals(6, response.getNwd());
  }
}
