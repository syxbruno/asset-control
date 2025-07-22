package syxbruno.com.user.endpoints.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import syxbruno.com.core.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository repository;
}
