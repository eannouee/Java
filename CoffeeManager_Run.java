package com.mc.CoffeeManagerSeries;

import com.mc.CoffeeManagerSeries.TMenu;

public class CoffeeManager {
	
	public static void main(String[] args) {
		
		TCoffee[] drinks = { new TCoffee("아메리카노", 10, 0, 3, 2000, 3000),
			new TCoffee("모카", 10, 0, 3, 3000, 4000),
			new TCoffee("라떼", 10, 0, 3, 4000, 5000),
			new TSeasonCoffee("자허블", 10, 0, 3, 6000, 5000, new int []{11,12,1,2})};
		
		new TMenu(new TSales(), drinks).MainMenu();
		
	}

}
