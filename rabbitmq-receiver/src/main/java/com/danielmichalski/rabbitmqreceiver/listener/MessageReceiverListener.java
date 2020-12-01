package com.danielmichalski.rabbitmqreceiver.listener;

import com.danielmichalski.rabbitmqreceiver.model.UserDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class MessageReceiverListener {

    public static final String ROUTING_KEY = "queue";

    @RabbitListener(queues = ROUTING_KEY)
    public void listenerMessage(UserDto user) {
        log.info("Received user from the RabbitMQ: {}", user);
    }

}
