package com.reply.myapp.euklides.controller;

import com.reply.myapp.euklides.model.Nwd;
import com.reply.myapp.euklides.model.Nww;
import com.reply.myapp.euklides.service.EuklidesApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NwdController {

  private final EuklidesApiService euklidesApiService;

  // @Autowired EuklidesApiService euklidesApiService;

  //  public NwdController(EuklidesApiService euklidesApiService) {
  //    this.euklidesApiService = euklidesApiService;
  //  }

  @PostMapping("/nwd")
  public ResponseEntity<Nwd> nwd(@RequestBody Nwd nwd) {
    return ResponseEntity.ok(euklidesApiService.nwd(nwd));
  }

  @PostMapping("/nww")
  public ResponseEntity<Nww> nww(@RequestBody Nww nww) {
    return ResponseEntity.ok(euklidesApiService.nww(nww));
  }
}
