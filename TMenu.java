package com.mc.CoffeeManagerSeries;

import java.util.Scanner;

public class TMenu {
	
	TAccount account  = TAccount.getInstance();
	TSales sales;
	TCoffee[] drinks;
	
	Scanner sc = new Scanner(System.in);

	public TMenu(TSales sales, TCoffee[] drinks) {
		super();
		this.sales = sales;
		this.drinks = drinks;
	}
	
	public void MainMenu() {
		
		while(true) {
			System.out.println("\n==========Menu==========");
			System.out.println("판매등록(1)");
			System.out.println("현황(2)");
			System.out.println("종료(3)");
			System.out.println("입력 : ");
			
			int inputMenu = sc.nextInt();
			
			switch (inputMenu) {
			case 1: {
				
				CoffeeMenu();
				
			}
			case 2:{
				Statistics();
			}
			case 3:{
				System.out.println("* 종료합니다.");
			}
			default:
				System.out.println("* 잘못된 번호를 입력하셨습니다.");
				break;
			}
		}
	}

	private void Statistics() {
		System.out.println("\n==========Statistics==========");
		for(int i = 0; i < drinks.length; i++) {
			System.out.println(drinks[i].getName() + "| 재고 : " + drinks[i].getStock() + "| 판매량 : " + drinks[i].getTotalSalesCnt());
			
			}
		System.out.println("잔고 : " + account.getBalance() + " | 매출 : " + account.getSalesVolumn() + " | 지출 : " + account.getExpences());
	}

	private void CoffeeMenu() {
		//음료 메뉴판
		System.out.println("\n==========List==========");
		for(int i = 0; i < drinks.length; i++) {
			System.out.println(drinks[i].getName() + "(" + i + ")");
		}
		
		System.out.println("\n * 판매한 커피 코드 : ");
		int inputCode = sc.nextInt();
		System.out.println("* 판매량 :");
		int orderCnt = sc.nextInt();
		
		if(inputCode < 0 || inputCode >= drinks.length) {
			System.out.println("정확한 번호를 입력하세요.");
			return;
		}
		
		registerOrder(inputCode, orderCnt);
		
	
		
	}

	private void registerOrder(int inputCode, int orderCnt) {
		TOrder order = TOrder.createOrder(drinks[inputCode], orderCnt);
		
		if(order == null) {
			System.out.println("재고가 부족해 주문을 취소합니다.");
			return;
		}
		
		TPayment payment = sales.takeOrder(order);
		orderResult(payment);
		
	}

	private void orderResult(TPayment payment) {
		TOrder order = payment.getOrder();
		
		
		System.out.println("\n 제품명 : " + order.getCoffee().getName());
		System.out.println(" 판매가 : " +  order.getCoffee().getPrice());
		System.out.println(" 판매수량 : " + order.getOrderCnt());
		System.out.println(" 결제금액 : " + payment.getPayPrice());
		System.out.println(" 남은 재고 : " + order.getCoffee().getStock() );
		System.out.println(order);
		
		
		
	}
	
	

	
}
