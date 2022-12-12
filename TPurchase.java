package com.mc.CoffeeManagerSeries;

public class TPurchase {
	
	private TCoffee coffee;
	private int purchaseCnt;
	private int budget;
	
	public TPurchase(TCoffee coffee, int purchaseCnt) {
		super();
		this.coffee = coffee;
		this.purchaseCnt = purchaseCnt;
		this.budget = coffee.getCost() * purchaseCnt;
	}
	
	public boolean execute() {
		
		if(TAccount.getInstance().registerExpences(budget)) {
			coffee.addStock(purchaseCnt);
			return true;
		}
		return false;
	}

	public TCoffee getCoffee() {
		return coffee;
	}

	public void setCoffee(TCoffee coffee) {
		this.coffee = coffee;
	}

	public int getPurchaseCnt() {
		return purchaseCnt;
	}

	public void setPurchaseCnt(int purchaseCnt) {
		this.purchaseCnt = purchaseCnt;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	
	
	
}
