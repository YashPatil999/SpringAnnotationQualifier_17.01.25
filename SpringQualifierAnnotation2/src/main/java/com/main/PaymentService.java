package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfigClass;
import com.entity.Person;

public class PaymentService {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);
		Person p = context.getBean(Person.class);
		p.getPaymentGateway1().processPayment(54800);
		p.getPaymentGateway2().processPayment(48697);
	}
}
