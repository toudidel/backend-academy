package com.reply.myapp.authentication;

import io.swagger.v3.oas.annotations.Operation;
import java.util.Map;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

  @GetMapping("/public/all")
  public String forAllUsers() {
    return "all users";
  }

  @GetMapping("/auth/authenticated")
  @Operation(description = "This method is only for authenticated users")
  public String forAuthenticatedUsers() {
    return "only authenticated users";
  }

  @GetMapping("/auth/authenticated/info")
  public Map<String, Object> forAuthenticatedUsersInfo(
      @AuthenticationPrincipal OAuth2User principal) {
    return principal.getAttributes();
  }
}
