package com.simon.rabbitmq.publisher;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simon.rabbitmq.config.MessagingConfig;
import com.simon.rabbitmq.dto.Transaction;

@RestController
@RequestMapping
public class TransactionPublisher {
	
	@Autowired
	private RabbitTemplate template;
	
	//private Transaction transaction;
	
	@GetMapping("/rabbits")
	public String publishTransaction() {
		Transaction transaction = new Transaction("785057087", "755548887", "AOX101", 2000.0);
		template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, transaction);
		return "captured";
	}

}
