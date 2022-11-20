package com.simon.rabbitmq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Transaction {
	private String accountNumber;
	private String MSISDN;
	private String trxnID;
	private double amount;

}
