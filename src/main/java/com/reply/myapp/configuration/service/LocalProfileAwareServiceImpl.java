package com.reply.myapp.configuration.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("local")
//@Profile({"default", "local"})
@Service
public class LocalProfileAwareServiceImpl implements ProfileAwareService {

  @Override
  public String getSomeString() {
    return "This is a string from profile aware service with profile LOCAL";
  }
}
