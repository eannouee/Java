package com.mc.CoffeeManagerSeries;

public class TSales {
	
	public TPayment takeOrder(TOrder order) {
		order.execute();
		TPayment payment = new TPayment(order);
		
		return payment;
	}

}
