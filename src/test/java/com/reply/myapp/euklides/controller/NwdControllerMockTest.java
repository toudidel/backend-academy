package com.reply.myapp.euklides.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.reply.myapp.euklides.model.Nwd;
import com.reply.myapp.euklides.service.EuklidesApiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(NwdController.class)
class NwdControllerMockTest {

  @Autowired private MockMvc mockMvc;

  @MockitoBean private EuklidesApiService euklidesApiService;

  @Test
  void test_nwd() throws Exception {
    String requestBody =
        """
            {
                "a": 12,
                "b": 18
            }
        """;

    when(euklidesApiService.nwd(Nwd.builder().a(12).b(18).build()))
        .thenReturn(Nwd.builder().a(12).b(18).nwd(6).build());

    mockMvc
        .perform(post("/nwd").contentType(MediaType.APPLICATION_JSON).content(requestBody))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.nwd").value(6));
  }
}
