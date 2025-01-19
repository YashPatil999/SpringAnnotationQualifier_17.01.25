package com.entity;

import org.springframework.stereotype.Component;

@Component("PhonePe")
public class PhonePePayment implements PaymentGateway {

	@Override
	public void processPayment(double price) {
		System.out.println("Processing payment of Rs. " + price + " through PhonePe.");		
	}
}
