package com.danielmichalski.rabbitmqpublisher.controller;


import com.danielmichalski.rabbitmqpublisher.model.UserDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/messages")
@Slf4j
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class MessagePublisherController {


    public static final String ROUTING_KEY = "queue";

    private final RabbitTemplate rabbitTemplate;


    @PostMapping
    public void sendMessage(@RequestBody UserDto user) {
        rabbitTemplate.convertAndSend(ROUTING_KEY, user);
        log.info("Message sent to RabbitMQ: {}", user);
    }

}
