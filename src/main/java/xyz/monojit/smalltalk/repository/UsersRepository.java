package xyz.monojit.smalltalk.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import xyz.monojit.smalltalk.entity.Users;

public interface UsersRepository extends JpaRepository<Users, UUID> {

  public Users findByUsername(String username);
}
