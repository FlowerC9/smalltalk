package xyz.monojit.smalltalk.service;

import java.util.List;

import xyz.monojit.smalltalk.entity.Hashtags;
import xyz.monojit.smalltalk.model.HashtagModel;
import xyz.monojit.smalltalk.model.PostModel;

public interface HashtagService {

  public List<HashtagModel> getHashtags();

  public List<PostModel> getPosts(String tag);

  public List<Hashtags> getHashtagsByTags(List<String> hashtag);
}
