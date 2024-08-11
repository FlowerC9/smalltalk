package xyz.monojit.smalltalk.model;

import lombok.Value;

@Value
public class AuthenticationResponse {

  private final String jwt;
}
