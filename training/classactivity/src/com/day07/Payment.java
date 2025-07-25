package com.day07;

public class Payment {
	public synchronized void makePayment(String user, int amount) {
        System.out.println(user + " made a payment of ₹" + amount);
    }
}
