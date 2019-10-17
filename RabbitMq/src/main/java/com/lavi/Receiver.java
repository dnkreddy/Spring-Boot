package com.lavi;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	@RabbitListener(queues="NaveenQ")
	public void receiveMessage(String message) {
		System.out.println("Message Received::"+message);
	}
}
