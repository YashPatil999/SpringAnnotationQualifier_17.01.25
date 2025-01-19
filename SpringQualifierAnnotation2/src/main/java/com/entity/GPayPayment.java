package com.entity;

import org.springframework.stereotype.Component;

@Component("GPay")
public class GPayPayment implements PaymentGateway {

	@Override
	public void processPayment(double price) {
		System.out.println("Processing payment of Rs. " + price + " through GPay.");
	}
}
