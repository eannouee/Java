package com.mc.TourSeries;

public class Tour {
	
	private Airline al1 = new Airline("미국행", 3000, 300000);
	private Airline al2 = new Airline("중국행", 2000, 200000);
	private Airline al3 = new Airline("일본행", 150, 150000);
	private Tourist tt = new Tourist(1000000, 1000);
	
	public Tour() {
		
	}
	
	
	public Tour(Airline al1, Airline al2, Airline al3, Tourist tt) {
		super();
		this.al1 = al1;
		this.al2 = al2;
		this.al3 = al3;
		this.tt = tt;
	}
	
	public boolean isAble(int num) {
		// 보유 금액으로 티켓 구매 가능 여부 확인 
		
		if(tt.getMyMoney() > al1.getAirfare() 
				|| tt.getMyMoney() > al2.getAirfare() 
				|| tt.getMyMoney() > al3.getAirfare()) {
			return true;
		}
		return false;
	}
	
	public void buyTicket1() {
		//미국행 티(보유금액 차감 및 마일리지 적립 연산 수행 메서
		tt.setMyMoney(tt.getMyMoney() - al1.getAirfare());
		tt.setMyMile(tt.getMyMile() + al1.getMileage());
		
	}
	
	public void buyTicket2() {
		//중국행 티(보유금액 차감 및 마일리지 적립 연산 수행 메서
		tt.setMyMoney(tt.getMyMoney() - al2.getAirfare());
		tt.setMyMile(tt.getMyMile() + al2.getMileage());
	}
	public void buyTicket3() {
		//일본행 티(보유금액 차감 및 마일리지 적립 연산 수행 메서
		tt.setMyMoney(tt.getMyMoney() - al3.getAirfare());
		tt.setMyMile(tt.getMyMile() + al3.getMileage());
	}
	
	public int bringMyMoney() {
		return tt.getMyMoney();
		//여행객의 보유금액을 리턴 
		
	}
	
	public int bringMyMile() {
		return tt.getMyMile();
		//여행객의 마일리지를 리턴
	}
	
	
	
	
	

}
