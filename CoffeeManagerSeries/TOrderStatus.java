package com.mc.CoffeeManagerSeries;

public class TOrderStatus { //아까 만들었던 코드들을 객체로 만들어서 다루어 줄 거임
	private int code; //주문상태 code
	private String desc; //주문 상태 상태
	
	//다른 곳에서 임의로 주문상태를 수정, 직접 생성할 수 없도록 만들어줬음
	//정책이기 때문에 프로그램 안에서 변경되어도 안됨 
	public static final TOrderStatus OK = new TOrderStatus(0, "주문 생성 성공");
	public static final TOrderStatus FAIL_CAUSE_SOLDOUT= new TOrderStatus(1, "품절로 인한 주문 실패");
	public static final TOrderStatus FAIL_CAUSE_STOCK = new TOrderStatus(2, "재고 부족으로 인한 주문 실패");
	public static final TOrderStatus FAIL_CAUSE_SEASON = new TOrderStatus(3, "시즌 상품은 시즌에만 구매 가능");
	public static final TOrderStatus COMPLITE = new TOrderStatus(4, "주문 완료");
	
	
	private TOrderStatus(int code, String desc) { //외부에서의 생성은 차단
		super();
		this.code = code;
		this.desc = desc;
	}

	public boolean isOK() {
		return code == OK.code;
	}
	
	public boolean isComplite() {
		return code == COMPLITE.code;
	}
	
	public boolean isFail() {
		if(code == FAIL_CAUSE_SOLDOUT.code || code == FAIL_CAUSE_STOCK.code || code == FAIL_CAUSE_SEASON.code) {
			return true;
		}
		return false;
	}
	
	public String desc() {
		return desc;
	}
	
	
	
	
}
