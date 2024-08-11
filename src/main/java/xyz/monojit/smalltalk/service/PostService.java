package xyz.monojit.smalltalk.service;

import java.util.List;
import java.util.UUID;
import xyz.monojit.smalltalk.model.PostModel;

public interface PostService {

  public List<PostModel> getAllPosts();

  public PostModel getPost(UUID postId);

  public PostModel addPost(PostModel postModel);

  public boolean deletePost(UUID postId, UUID userId);

  public long addLike(UUID postId, UUID userId);

  public long removeLike(UUID postId, UUID userId);
}
