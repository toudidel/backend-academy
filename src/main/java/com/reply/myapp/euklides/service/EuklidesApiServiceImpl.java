package com.reply.myapp.euklides.service;

import com.reply.myapp.euklides.model.Nwd;
import com.reply.myapp.euklides.model.Nww;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EuklidesApiServiceImpl implements EuklidesApiService {

  private final EuklidesService euklidesService;

  //  @Autowired EuklidesService euklidesService;

  @Override
  public Nwd nwd(Nwd request) {
    return Nwd.builder()
        .a(request.getA())
        .b(request.getB())
        .nwd(euklidesService.nwd(request.getA(), request.getB()))
        .build();
  }

  @Override
  public Nww nww(Nww request) {
    return Nww.builder()
        .a(request.getA())
        .b(request.getB())
        .nww(euklidesService.nww(request.getA(), request.getB()))
        .build();
  }
}
