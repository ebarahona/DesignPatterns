package com.wangdi.designpattern.proxy;

public class Proxy implements ISaleTowel {
	private TowelProduce produce;

	public Proxy(String customerName) {
		produce = new TowelProduce(customerName);
	}
	
	@Override
	public void sellTowel() {
		produce.sellTowel();
	}

}
