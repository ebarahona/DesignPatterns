package com.wangdi.designpattern.decorator2;

public class Simulation {

	public static void main(String[] args) {
		ICoffee smallCup = new CoffeeSmallCup();
		smallCup = new Mike(smallCup);
		smallCup = new Mocha(smallCup);
		System.out.println(smallCup.getDescription() + ", price: " + smallCup.getPrice());
		
		ICoffee pureSmallCup = new CoffeeSmallCup();
		System.out.println(pureSmallCup.getDescription() + ", price: " + pureSmallCup.getPrice());
		
		ICoffee largeCup = new CoffeeLargeCup();
		largeCup = new Latte(largeCup);
		System.out.println(largeCup.getDescription() + ", price: " + largeCup.getPrice());
	}

}
