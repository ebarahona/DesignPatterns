package com.wangdi.designpattern.strategy;

public class CashContext {
	private CashSuper cs;
	
	public CashContext(String type) {
		// TODO Auto-generated constructor stub
		switch (type) {
		case "正常收费":
			cs = new CashNormal();
			break;
		
		case "满300返100":
			cs = new CashReturn("300", "100");
			break;
			
		case "打8折":
			cs = new CashRebate("0.8");
			break;
			
		default:
			break;
		}
	}
	
	public double getResult(double money){
		return cs.acceptCash(money);
	}
}
