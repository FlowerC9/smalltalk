package xyz.monojit.smalltalk.model;

import java.util.UUID;
import lombok.Data;

@Data
public class LikeModel {

  private UUID id;
  private PostModel post;
  private UserModel user;
}
