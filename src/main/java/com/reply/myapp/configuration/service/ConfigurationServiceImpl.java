package com.reply.myapp.configuration.service;

import com.reply.myapp.config.properties.AddressesProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ConfigurationServiceImpl implements ConfigurationService {

  private final AddressesProperties addressesProperties;

  @Value("${app.some.property}")
  private String someProperty;

  @Override
  public String getSomeProperty() {
    log.info("Getting some property");
    log.debug("Some property is: {}", someProperty);
    log.warn(String.format("IP address is: %s", addressesProperties.getIp()));
    log.warn(String.format("IP2 address is: %s", addressesProperties.getIp2()));
    return someProperty;
  }
}
