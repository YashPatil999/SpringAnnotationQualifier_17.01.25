package com.entity;

public interface PaymentGateway {

    abstract void processPayment(double price);

}
