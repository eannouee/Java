package com.mc.CoffeeManagerSeries;

public class TCoffee {
	
	private String name;
	private int stock;
	private int totalSalesCnt;
	private int safetyStock;
	private int cost;
	private int price;
	
	
	//매개변수가 있는 생성자
	public TCoffee(String name, int stock, int totalSalesCnt, int safetyStock, int cost, int price) {
		super();
		this.name = name;
		this.stock = stock;
		this.totalSalesCnt = totalSalesCnt;
		this.safetyStock = safetyStock;
		this.cost = cost;
		this.price = price;
	}
	
	public void offer(int orderCnt) {
		
		deductStock(orderCnt);
		
		addTotalSalesCnt(orderCnt);
		
		if(stock < safetyStock) {
			addSafetyStock();
		}
	}

	private void addSafetyStock() {
		System.out.println("[sysotem:log] 재고가 부족해 안전재고를 확보합니다. ");
		TPurchase purchase = new TPurchase(this, safetyStock*2);
		
		if(purchase.execute()) {
			System.out.println("[system : log] 안전재고 확보에 성공했습니다.");
		}else {
			System.out.println("[system : log] 안전재고 확보에 실패했습니다.");
		}
		
	}

	private void addTotalSalesCnt(int orderCnt) {
		totalSalesCnt += orderCnt;
		
		
	}

	private void deductStock(int orderCnt) {
		this.stock -= orderCnt;
		
	}
	
	public void addStock(int purchaseCnt) {
		this.stock += purchaseCnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getTotalSalesCnt() {
		return totalSalesCnt;
	}

	public void setTotalSalesCnt(int totalSalesCnt) {
		this.totalSalesCnt = totalSalesCnt;
	}

	public int getSafetyStock() {
		return safetyStock;
	}

	public void setSafetyStock(int safetyStock) {
		this.safetyStock = safetyStock;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TCoffee [name=" + name + ", stock=" + stock + ", totalSalesCnt=" + totalSalesCnt + ", safetyStock="
				+ safetyStock + ", cost=" + cost + ", price=" + price + "]";
	}
	
	
	
	

}
