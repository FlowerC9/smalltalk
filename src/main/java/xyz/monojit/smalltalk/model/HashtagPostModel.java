package xyz.monojit.smalltalk.model;

import java.util.UUID;
import lombok.Data;

@Data
public class HashtagPostModel {

  private UUID id;
  private HashtagModel hashtag;
  private PostModel post;
}
