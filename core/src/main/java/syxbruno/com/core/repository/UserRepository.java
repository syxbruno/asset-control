package syxbruno.com.core.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import syxbruno.com.core.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
