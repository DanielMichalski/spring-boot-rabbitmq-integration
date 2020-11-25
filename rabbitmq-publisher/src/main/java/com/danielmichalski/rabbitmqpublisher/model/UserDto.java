package com.danielmichalski.rabbitmqpublisher.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto implements Serializable {

  private String firstName;
  private String lastName;
}
