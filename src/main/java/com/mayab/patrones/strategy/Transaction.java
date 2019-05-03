package com.mayab.patrones.strategy;

public class Transaction {

	public float quantity;
	public String date;
	public String commerce;
	public String category;
	
	public Transaction(float quantity, String date, String commerce, String category) {
		this.quantity = quantity;
		this.date = date;
		this.commerce = commerce;
		this.category = category;
	}
	
	
}
