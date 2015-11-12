package org.algohub.rest.pojo;

import org.springframework.data.redis.support.collections.RedisMap;


public class SubmissionResultMap {
  private RedisMap<String, String> map;

  public SubmissionResultMap(RedisMap<String, String> map) {
    this.map = map;
  }

  public RedisMap<String, String> getMap() {
    return map;
  }

  public void setMap(RedisMap<String, String> map) {
    this.map = map;
  }
}
