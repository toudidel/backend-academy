package com.reply.myapp.euklides.service;

import com.reply.myapp.euklides.model.Nwd;
import com.reply.myapp.euklides.model.Nww;

public interface EuklidesApiService {

  Nwd nwd(Nwd request);

  Nww nww(Nww request);
}
