package com.wangdi.designpattern.simplefactory;
import java.util.Scanner;

public class Client {
	private static Operation operation;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String numberA = null;
		String numberB = null;
		String oper = null;
		System.out.print("input number a:");
		numberA = scanner.next();
		System.out.print("input operation:");
		oper = scanner.next();
		System.out.print("input number b:");
		numberB = scanner.next();
		
		operation = OperationFactory.createOperation(oper);
		operation.numberA = Double.valueOf(numberA);
		operation.numberB = Double.valueOf(numberB);
		double result = operation.getResult();
		
		System.out.print(result);
	}

}
