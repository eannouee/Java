package com.mc.CoffeeManagerSeries;

public class TPayment {
	
	private TOrder order;
	private int payPrice;
	
	public TPayment(TOrder order) {
		super();
		this.order = order;
		this.payPrice = order.getOrderPrice();
	}
	
	public void excute() {
		payPrice -= TDiscount.calDiscount(order);
		TAccount.getInstance().registerSales(payPrice);
	}

	public TOrder getOrder() {
		return order;
	}

	public void setOrder(TOrder order) {
		this.order = order;
	}

	public int getPayPrice() {
		return payPrice;
	}

	public void setPayPrice(int payPrice) {
		this.payPrice = payPrice;
	}
	
}
