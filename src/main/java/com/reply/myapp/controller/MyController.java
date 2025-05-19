package com.reply.myapp.controller;

import com.reply.myapp.model.SumRequest;
import com.reply.myapp.model.SumResponse;
import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

  @GetMapping("/hello")
  public String helloWorld() {
    return "Hello World!!!";
  }

  @GetMapping("/date")
  public String date() {
    return LocalDateTime.now().toString();
  }

  @GetMapping("/date/{name}")
  public String dateWithName(@PathVariable String name) {
    return name + " " + LocalDateTime.now();
  }

  @GetMapping("/sum/{a}/{b}")
  public Integer sum(@PathVariable Integer a, @PathVariable Integer b) {
    return a + b;
  }

  @PostMapping("/sum")
  public SumResponse sumObject(@RequestBody SumRequest request) {
    return SumResponse.builder()
        .a(request.getA())
        .b(request.getB())
        .sum(request.getA() + request.getB())
        .build();
  }
}
