package com.wangdi.designpattern.proxy;

public class TowelProduce implements ISaleTowel {
	private String customerName;
	
	public TowelProduce(String customerName) {
		this.customerName = customerName;
	}
	
	@Override
	public void sellTowel() {
		System.out.println("towel produce sells the towel to: " + customerName);
	}

}
