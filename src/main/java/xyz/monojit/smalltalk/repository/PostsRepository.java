package xyz.monojit.smalltalk.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import xyz.monojit.smalltalk.entity.Posts;

public interface PostsRepository extends JpaRepository<Posts, UUID> {}
