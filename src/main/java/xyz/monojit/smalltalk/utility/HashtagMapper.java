package xyz.monojit.smalltalk.utility;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import xyz.monojit.smalltalk.entity.Hashtags;
import xyz.monojit.smalltalk.model.HashtagModel;

@Component("HashtagMapper")
public class HashtagMapper implements Mapper<Hashtags, HashtagModel> {

  @Override
  public HashtagModel transform(Hashtags hashtag) {
    var hashtagModel = new HashtagModel();
    BeanUtils.copyProperties(hashtag, hashtagModel);
    return hashtagModel;
  }

  @Override
  public Hashtags transformBack(HashtagModel hashtagModel) {
    var hashtag = new Hashtags();
    BeanUtils.copyProperties(hashtagModel, hashtag);
    return hashtag;
  }
}
