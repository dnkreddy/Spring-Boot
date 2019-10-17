package com.lavi;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;



@Component
public class Sender {

	@Autowired
	RabbitMessagingTemplate msgTemplate;
	
	@Autowired
	public Queue queue() {
		return new Queue("NaveenQ", true);
	}
	
	public void send(String message) {
		msgTemplate.convertAndSend("NaveenQ",message);
		msgTemplate.convertAndSend("NaveenQ","Kumar");
		msgTemplate.convertAndSend("NaveenQ","Reddy");
	}
	
}
