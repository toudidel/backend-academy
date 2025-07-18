package com.reply.myapp.authentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

  @GetMapping("/public/all")
  public String forAllUsers() {
    return "all users";
  }

  @GetMapping("/auth/authenticated")
  public String forAuthenticatedUsers() {
    return "only authenticated users";
  }
}
