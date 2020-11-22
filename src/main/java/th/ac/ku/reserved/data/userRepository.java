package th.ac.ku.reserved.data;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.reserved.model.User;

public interface userRepository extends JpaRepository<User,Integer> {
}
