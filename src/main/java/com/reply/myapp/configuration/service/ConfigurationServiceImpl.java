package com.reply.myapp.configuration.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConfigurationServiceImpl implements ConfigurationService {

  @Value("${app.some.property}")
  private String someProperty;

  @Value("${app.addresses.ip:undefined}")
  private String ipAddress;

  @Override
  public String getSomeProperty() {
    log.info("Getting some property");
    log.debug("Some property is: {}", someProperty);
    log.warn(String.format("IP address is: %s", ipAddress));
    return someProperty;
  }
}
