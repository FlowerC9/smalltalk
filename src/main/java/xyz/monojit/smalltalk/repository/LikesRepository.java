package xyz.monojit.smalltalk.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import xyz.monojit.smalltalk.entity.Likes;
import xyz.monojit.smalltalk.entity.Posts;
import xyz.monojit.smalltalk.entity.Users;

public interface LikesRepository extends JpaRepository<Likes, UUID> {

  void deleteByPostsAndUsers(Posts posts, Users users);
}
