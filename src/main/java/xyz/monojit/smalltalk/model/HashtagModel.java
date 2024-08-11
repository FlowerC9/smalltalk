package xyz.monojit.smalltalk.model;

import java.util.UUID;
import lombok.Data;

@Data
public class HashtagModel {

  private UUID id;
  private String tag;
  private Long recentPostCount;
}
