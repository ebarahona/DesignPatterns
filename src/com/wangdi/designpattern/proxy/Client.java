package com.wangdi.designpattern.proxy;

public class Client {

	public static void main(String[] args) {
		Proxy proxy = new Proxy("Ben");
		proxy.sellTowel();
	}
}
