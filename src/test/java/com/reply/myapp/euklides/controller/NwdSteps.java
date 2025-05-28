package com.reply.myapp.euklides.controller;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.reply.myapp.euklides.model.Nwd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class NwdSteps {

  private Nwd requestBody;
  private Nwd response;

  @Given("I have a request with {int} and {int}")
  public void i_have_request(Integer a, Integer b) {
    requestBody = Nwd.builder().a(a).b(b).build();
  }

  @When("I call nwd endpoint")
  public void i_call_endpoint() {
    response =
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
  }

  @Then("the result should be {int}")
  public void the_result_should_be(Integer expected) {
    assertEquals(expected, response.getNwd());
  }
}
