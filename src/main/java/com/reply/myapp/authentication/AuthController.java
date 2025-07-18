package com.reply.myapp.authentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {

  @GetMapping("/all")
  public String forAllUsers() {
    return "all users";
  }

  @GetMapping("/authenticated")
  public String forAuthenticatedUsers() {
    return "only authenticated users";
  }
}
