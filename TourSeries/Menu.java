package com.mc.TourSeries;

import java.util.Scanner;
import com.mc.TourSeries.Tour;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	private Tour tour = new Tour();
	
	public void mainMenu() {
		
		//여행객의 현재 보유 금액과 마일리지 및 항공사의 메인 메뉴를 출력
		
		
		
		while(true) {
	

			System.out.println("현재 보유 금액 : " + tour.bringMyMoney());
			System.out.println("현재 보유 마일리지 : "+ tour.bringMyMile());
			
			
			System.out.println("번호\t 목적지\t 가격\t 마일리지");
			System.out.println("1\t 미국행\t 300000\t 3000");
			System.out.println("2\t 중국행\t 200000\t 2000");
			System.out.println("3\t 일본행\t 150000\t 1500");	
			System.out.println("목적지 선택(번호입력)");
			
			int inputNum = sc.nextInt();
			
			

			// 보유금액으로 티켓 구매 가능 여부를 확인하여 불가능하면 
			// 현재 보유 금액이 부족합니다. 라고 출력 후 반복 종료
			// 각 메뉴 선택 시(switch문) Tour의 메소드를 활용 
			
			if(!tour.isAble(inputNum)) {
				System.out.println("현재 보유 금액이 부족합니다.");
				break;
			}
			
			
			switch (inputNum) {
			
			case 1 : {
				tour.buyTicket1();
				System.out.println("티켓팅 후 잔액은 : " + tour.bringMyMoney());
				System.out.println("티켓팅 후 마일리지는 : " + tour.bringMyMile());
				break;
			}
			case 2 : {
				tour.buyTicket2();
				System.out.println("티켓팅 후 잔액은 : " + tour.bringMyMoney());
				System.out.println("티켓팅 후 마일리지는 : " + tour.bringMyMile());
				break;
			}
			case 3 : {
				tour.buyTicket3();
				System.out.println("티켓팅 후 잔액은 : " + tour.bringMyMoney());
				System.out.println("티켓팅 후 마일리지는 : " + tour.bringMyMile());
				break;
			}
			
			}
		
		}
	}	
		
}
	


