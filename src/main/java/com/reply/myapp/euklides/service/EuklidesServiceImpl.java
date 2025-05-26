package com.reply.myapp.euklides.service;

import com.reply.myapp.euklides.utils.Euklides;
import org.springframework.stereotype.Service;

@Service
public class EuklidesServiceImpl implements EuklidesService {

  @Override
  public Integer nwd(Integer a, Integer b) {
    return Euklides.nwd(a, b);
  }

  @Override
  public Integer nww(Integer a, Integer b) {
    return Euklides.nww(a, b);
  }
}
