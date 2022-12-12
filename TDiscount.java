package com.mc.CoffeeManagerSeries;

//final : 더 이상 상속이 불가능한 클래스(더 이상 상속할 일이 없음) 
public final class TDiscount {
	

	public static int calDiscount(TOrder order) {
		int discount = 0;
		
		if(order.getOrderPrice() >= 100000) {
			discount = (int) (order.getOrderPrice() * 0.1);
		}
		
		return discount;
	}
	
	
	

}
