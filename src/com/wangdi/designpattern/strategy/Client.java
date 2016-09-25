package com.wangdi.designpattern.strategy;

public class Client {

	public static void main(String[] args) {
		CashContext cc = new CashContext("打8折");
		System.out.println(cc.getResult(500));
		CashContext cc1 = new CashContext("满300返100");
		System.out.println(cc1.getResult(740));
	}

}
