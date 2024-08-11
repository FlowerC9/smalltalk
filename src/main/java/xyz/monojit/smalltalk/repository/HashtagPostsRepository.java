package xyz.monojit.smalltalk.repository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import xyz.monojit.smalltalk.entity.HashtagPosts;
import xyz.monojit.smalltalk.entity.Hashtags;
import xyz.monojit.smalltalk.entity.Posts;

public interface HashtagPostsRepository extends JpaRepository<HashtagPosts, UUID> {

  public List<Posts> findByHashtags(Hashtags hashtag);

  public List<Hashtags> findByPosts(Posts post);
}
