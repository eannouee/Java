package com.mc.CoffeeManagerSeries;

import java.time.LocalDateTime;

public class TOrder {
	
	private TCoffee coffee; //주문한 커피
	private int orderCnt;
	private LocalDateTime orderTime;
	private int orderPrice;
	private String orderTitle; //주문명 
	private int orderDiscount; //할인
	private TOrderStatus status;
	
	public static TOrder createOrder(TCoffee coffee, int orderCnt) {
		
		TOrder order = new TOrder(coffee, orderCnt);
		
		TOrderStatus status = checkOrderStatus(coffee, orderCnt); //주문 상태 확인해서 반환
		order.status = status;
		return order;
	}

	private static TOrderStatus checkOrderStatus(TCoffee coffee, int orderCnt) {
		if(coffee.getStock() < orderCnt) return TOrderStatus.FAIL_CAUSE_STOCK;
		if(coffee instanceof TSeasonCoffee) {
			TSeasonCoffee seasoncoffee = (TSeasonCoffee) coffee;
			if(!seasoncoffee.isSeason()) return TOrderStatus.FAIL_CAUSE_SEASON;
		}
		return TOrderStatus.OK;
		
	}

	private TOrder(TCoffee coffee, int orderCnt) {
		super();
		this.coffee = coffee;
		this.orderCnt = orderCnt;
		this.orderTime = LocalDateTime.now(); //현재시간
		this.orderPrice = coffee.getPrice() * orderCnt;
		this.orderTitle = coffee.getName() + "[" + orderCnt + "잔]";
		
	}
	
	
	
	public TOrderStatus getStatus() {
		return status;
	}

	public void setStatus(TOrderStatus status) {
		this.status = status;
	}

	public void execute() {
		coffee.offer(orderCnt);	
	}

	public TCoffee getCoffee() {
		return coffee;
	}

	public void setCoffee(TCoffee coffee) {
		this.coffee = coffee;
	}

	public int getOrderCnt() {
		return orderCnt;
	}

	public void setOrderCnt(int orderCnt) {
		this.orderCnt = orderCnt;
	}

	public LocalDateTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOrderTitle() {
		return orderTitle;
	}

	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public int getOrderDiscount() {
		return orderDiscount;
	}

	public void setOrderDiscount(int orderDiscount) {
		this.orderDiscount = orderDiscount;
	}

	@Override
	public String toString() {
		return "TOrder [orderCnt=" + orderCnt + ", orderTime=" + orderTime + ", orderPrice=" + orderPrice
				+ ", orderTitle=" + orderTitle + ", orderDiscount=" + orderDiscount + "]";
	}
	
	
	

}
