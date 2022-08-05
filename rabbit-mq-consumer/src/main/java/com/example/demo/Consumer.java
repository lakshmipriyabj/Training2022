package com.example.demo;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.demo.direct.config.DirectExchangeConfig;

@Component
public class Consumer {
	
	@RabbitListener(queues = DirectExchangeConfig.ROUTING_KEY)

    public void consumeMessageFromQueue(String message) {
        System.out.println("Message recieved from queue :" + message);
    }

}
