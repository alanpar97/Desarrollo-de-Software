package com.mayab.patrones.strategy;

public class StrategyController {

	public static void main(String[] args) {
		
		CategoryReport cp = new CategoryReport();
		CommerceReport cm = new CommerceReport();
		QuantityReport qr = new QuantityReport();
		DateReport dr = new DateReport();
		
		cp.displayTransactions();
		cm.displayTransactions();
		qr.displayTransactions();
		dr.displayTransactions();

	}

}
