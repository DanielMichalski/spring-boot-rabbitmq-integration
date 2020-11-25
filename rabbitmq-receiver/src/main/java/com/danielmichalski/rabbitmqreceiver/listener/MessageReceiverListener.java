package com.danielmichalski.rabbitmqreceiver.listener;

import com.danielmichalski.rabbitmqreceiver.model.UserDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class MessageReceiverListener {


    public static final String ROUTING_KEY = "queue";

    @RabbitListener(queues = ROUTING_KEY)
    public void listenerMessage(UserDto user) {
        log.info("Received user from the RabbitMQ: {}", user);
    }

}
