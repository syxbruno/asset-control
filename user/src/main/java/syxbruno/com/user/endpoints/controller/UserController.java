package syxbruno.com.user.endpoints.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import syxbruno.com.user.endpoints.service.UserService;

@RestController
@RequiredArgsConstructor
public class UserController {

  private final UserService service;


}
