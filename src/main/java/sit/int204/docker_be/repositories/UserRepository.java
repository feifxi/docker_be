package sit.int204.docker_be.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int204.docker_be.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}