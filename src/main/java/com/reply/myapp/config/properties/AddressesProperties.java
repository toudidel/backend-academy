package com.reply.myapp.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "app.addresses")
public class AddressesProperties {

  private String ip;
  private String ip2;
}
