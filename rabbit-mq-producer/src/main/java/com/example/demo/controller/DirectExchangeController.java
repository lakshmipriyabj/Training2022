package com.example.demo.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.direct.config.DirectExchangeConfig;


@RestController
public class DirectExchangeController {
	
	@Autowired
	private RabbitTemplate template;

	@GetMapping(path = "/direct/{studentDetails}")
	public String producer(@PathVariable String studentDetails) {
	 template.convertAndSend(DirectExchangeConfig.EXCHANGE,
			 DirectExchangeConfig.ROUTING_KEY, studentDetails);
		return "Message Successfully sent using  Direct Exchange";
	}


}

