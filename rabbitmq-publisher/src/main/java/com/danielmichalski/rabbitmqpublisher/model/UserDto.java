package com.danielmichalski.rabbitmqpublisher.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDto implements Serializable {

    private String firstName;
    private String lastName;

}
