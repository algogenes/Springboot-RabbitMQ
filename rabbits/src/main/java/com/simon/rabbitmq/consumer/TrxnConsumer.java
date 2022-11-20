package com.simon.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.simon.rabbitmq.config.MessagingConfig;
import com.simon.rabbitmq.dto.Transaction;

@Component
public class TrxnConsumer {
	
	@RabbitListener(queues = MessagingConfig.QUEUE)
	public void getMessageFromQueue(Transaction transaction) {
		System.out.println("The message from Queue is:"+ transaction);
		
	}

}
