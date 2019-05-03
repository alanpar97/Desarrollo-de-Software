package com.mayab.patrones.strategy;

import java.util.ArrayList;

public class BankAccount {

	public float balance;
	public ArrayList<Transaction> transactions;
	
	public BankAccount() {
		this.balance = 0;
	}
	
	public float getBalance() {
		return this.balance;
	}
	
	public void addTransaction(Transaction t) {
		this.balance += t.quantity;
		this.transactions.add(t);
	}
	
	public void removeTransaction(Transaction t) {
		this.balance -= t.quantity;
		this.transactions.remove(t);
	}
	
}
