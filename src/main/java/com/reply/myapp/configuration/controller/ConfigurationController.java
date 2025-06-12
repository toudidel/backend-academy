package com.reply.myapp.configuration.controller;

import com.reply.myapp.configuration.service.ConfigurationService;
import com.reply.myapp.configuration.service.ProfileAwareService;
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
  private final ProfileAwareService profileAwareService;

  @GetMapping("/someproperty")
  public ResponseEntity<String> getSomeProperty() {
    return ResponseEntity.ok(configurationService.getSomeProperty());
  }

  @GetMapping("/string")
  public ResponseEntity<String> getProfileString() {
    return ResponseEntity.ok(profileAwareService.getSomeString());
  }
}
