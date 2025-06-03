package com.reply.myapp.configuration.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationServiceImpl implements ConfigurationService {

  @Value("${app.some.property}")
  private String someProperty;

  @Override
  public String getSomeProperty() {
    return someProperty;
  }
}
