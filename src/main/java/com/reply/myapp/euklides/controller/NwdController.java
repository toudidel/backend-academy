package com.reply.myapp.euklides.controller;

import com.reply.myapp.euklides.model.Nwd;
import com.reply.myapp.euklides.utils.Euklides;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NwdController {

  @PostMapping("/nwd")
  public Nwd nwd(@RequestBody Nwd nwd) {
    return Nwd.builder()
        .a(nwd.getA())
        .b(nwd.getB())
        .nwd(Euklides.nwd(nwd.getA(), nwd.getB()))
        .build();
  }
}
