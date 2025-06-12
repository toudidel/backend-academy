package com.reply.myapp.configuration.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class ProdProfileAwareServiceImpl implements ProfileAwareService {

  @Override
  public String getSomeString() {
    return "And this is a string for PROD";
  }
}
