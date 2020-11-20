package com.danielmichalski.rabbitmqpublisher.controller;


import com.danielmichalski.rabbitmqpublisher.model.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/messages")
public class MessagePublisherController {

    private static final Logger logger = LoggerFactory.getLogger(MessagePublisherController.class);

    public static final String ROUTING_KEY = "queue";

    private final RabbitTemplate rabbitTemplate;

    public MessagePublisherController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping
    public void sendMessage(@RequestBody UserDto user) {
        rabbitTemplate.convertAndSend(ROUTING_KEY, user);
        logger.info("Message sent to RabbitMQ: {}", user);
    }

}
