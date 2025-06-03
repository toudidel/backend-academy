package com.reply.myapp.configuration.controller;

import com.reply.myapp.configuration.service.ConfigurationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/configuration")
public class ConfigurationController {

  private final ConfigurationService configurationService;

  @GetMapping("/someproperty")
  public ResponseEntity<String> getSomeProperty() {
    return ResponseEntity.ok(configurationService.getSomeProperty());
  }
}
