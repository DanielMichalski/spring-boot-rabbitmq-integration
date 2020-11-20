package com.danielmichalski.rabbitmqreceiver.listener;

import com.danielmichalski.rabbitmqreceiver.model.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiverListener {

    private static final Logger logger = LoggerFactory.getLogger(MessageReceiverListener.class);

    public static final String ROUTING_KEY = "queue";

    @RabbitListener(queues = ROUTING_KEY)
    public void listenerMessage(UserDto user) {
        logger.info("Received user from the RabbitMQ: {}", user);
    }

}
