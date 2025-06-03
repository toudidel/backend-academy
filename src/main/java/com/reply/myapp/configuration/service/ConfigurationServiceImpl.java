package com.reply.myapp.configuration.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationServiceImpl implements ConfigurationService {

  private static final Logger logger = LoggerFactory.getLogger(ConfigurationServiceImpl.class);

  @Value("${app.some.property}")
  private String someProperty;

  @Override
  public String getSomeProperty() {
    logger.info("Getting some property");
    logger.debug("Some property is: {}", someProperty);
    return someProperty;
  }
}
