package syxbruno.com.auth.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
import syxbruno.com.core.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

  UserDetails findByEmail(String email);
}
