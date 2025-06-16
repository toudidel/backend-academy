package com.reply.myapp.configuration.service;

import jakarta.annotation.PostConstruct;
import java.util.Arrays;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Profile({"default", "local"})
// @Profile("!test")
// @Profile({"default", "local"})
@Slf4j
@Service
@RequiredArgsConstructor
public class LocalProfileAwareServiceImpl implements ProfileAwareService {

  private final Environment env;

  @PostConstruct
  public void printActiveProfiles() {
    log.info(">>>>>>>>>>>> Active profiles: " + Arrays.toString(env.getActiveProfiles()));
  }

  @Override
  public String getSomeString() {
    return "This is a string from profile aware service with profile LOCAL";
  }
}
