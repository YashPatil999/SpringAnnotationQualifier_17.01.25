package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Value("Yash")
	private String name;
	@Value("25")
	private int age;
	@Value("Thane")
	private String address;

	@Qualifier("PhonePe")
	@Autowired
	private PaymentGateway paymentGateway1;
	
	@Qualifier("GPay")
	@Autowired
	private PaymentGateway paymentGateway2;

	public Person() {
	}

	public Person(String name, int age, String address, PaymentGateway paymentGateway1,
			PaymentGateway paymentGateway2) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.paymentGateway1 = paymentGateway1;
		this.paymentGateway2 = paymentGateway2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public PaymentGateway getPaymentGateway1() {
		return paymentGateway1;
	}

	public void setPaymentGateway1(PaymentGateway paymentGateway1) {
		this.paymentGateway1 = paymentGateway1;
	}

	public PaymentGateway getPaymentGateway2() {
		return paymentGateway2;
	}

	public void setPaymentGateway2(PaymentGateway paymentGateway2) {
		this.paymentGateway2 = paymentGateway2;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", paymentGateway1=" + paymentGateway1
				+ ", paymentGateway2=" + paymentGateway2 + "]";
	}

}
