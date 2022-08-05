package com.example.demo.direct.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class FanOutExchangeConfig {
@Bean
public Queue fanOutQueue1()
{
	return new Queue("dhana.ece.student",false);
}
	

@Bean
public Queue fanOutQueue2()
{
	return new Queue("dhana.cse.student",false);
}

@Bean

public FanoutExchange exchange()
{
	return new FanoutExchange("dhana-sri-college");
	
}

@Bean
public Binding binding1(FanoutExchange exchange,@Qualifier("fanOutQueue1")Queue fanOutQueue1)
{
	return BindingBuilder.bind(fanOutQueue1).to(exchange);
	
}
@Bean
public Binding binding2(FanoutExchange exchange,@Qualifier("fanOutQueue2")Queue fanOutQueue2)
{
	return BindingBuilder.bind(fanOutQueue2).to(exchange);
	
}

}
